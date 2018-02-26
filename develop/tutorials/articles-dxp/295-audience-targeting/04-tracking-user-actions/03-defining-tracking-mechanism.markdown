# Using a Tracking Mechanism [](id=using-a-tracking-mechanism)

Imagine an administrator has successfully configured and saved your custom
metric to his or her report. Now what? Your metric needs to fulfill its
purpose, which is to track the `view` event type for the defined newsletter. To
do this, you must define a tracking mechanism. For your newsletter, you'll use a
transparent image as the tracking mechanism, which would have the *View*
tracking event capability. Whenever the image is viewed, the newsletter metric
computes and stores the information.

For the newsletter metric, you'll use a tracking mechanism provided by the
Audience Targeting app.

1.  You must set the analytics processor that the Content Targeting API provides
    for tracking events. Add the following method and private field:

        @Reference
        protected void setAnalyticsProcessor(AnalyticsProcessor analyticsProcessor) {
            _analyticsProcessor = analyticsProcessor;
        }

        private AnalyticsProcessor _analyticsProcessor;

    The analytics processor is a module of the Audience Targeting Analytics
    system. It contains a servlet to track analytics from Liferay pages (views,
    clicks, etc.) and an API to leverage this tracking mechanism. In the
    `setAnalyticsProcesoor(...)` method, you're obtaining a reference of the
    current analytics processor to build the URL used to generate a transparent
    image. All you have to do is insert the generated URL into your newsletter's
    HTML, and the transparent image tracks who reads it. Everything is processed
    by the default Audience Targeting Analytics system automatically.

    Now that you've obtained a reference of the analytics processor, you need to
    add logic for generating the appropriate tracking URL.

2.  Replace the `populateContext` method with the updated method:

        @Override
        protected void populateContext(
            TrackingActionInstance trackingActionInstance,
            Map<String, Object> context, Map<String, String> values) {

            String alias = StringPool.BLANK;
            String elementId = StringPool.BLANK;
            String eventType = StringPool.BLANK;
            String trackImageHTML = StringPool.BLANK;

            if (!values.isEmpty()) {
                alias = values.get("alias");
                elementId = values.get("elementId");
                eventType = values.get("eventType");
            }
            else if (trackingActionInstance != null) {
                alias = trackingActionInstance.getAlias();
                elementId = trackingActionInstance.getElementId();
                eventType = trackingActionInstance.getEventType();

                String trackImageURL = _analyticsProcessor.getTrackingURL(
                    trackingActionInstance.getCompanyId(), 0, 0, "", 0,
                    Campaign.class.getName(),
                    new long[] {trackingActionInstance.getCampaignId()},
                    trackingActionInstance.getElementId(), "view", "");

                trackImageHTML = "<img alt=\"\" src=\"" + trackImageURL + "\" />";
            }

            context.put("alias", alias);
            context.put("elementId", elementId);
            context.put("eventType", eventType);
            context.put("eventTypes", getEventTypes());
            context.put("trackImageHTML", trackImageHTML);
        }

    This updated method creates a new variable named `trackImageHTML`,
    retrieves a tracking URL using the analytics processor, and then populates
    the `trackImageHTML` context variable. When creating a new metric, the
    transparent image's URL field is not present in the metric's form. When the
    metric is initially saved, however, the URL is generated using the analytics
    processor and is available for copying.

Excellent! You've obtained the analytics processor and can create the
transparent image tracking mechanism. The newsletter metric's behavior is
defined and complete. The last thing you need to do is create a JSP template.

## Defining the Metric's UI [](id=defining-the-metrics-ui)

The Java code you've added to this point has assumed that there are three
configurable fields for your newsletter metric: 

- *Name:* used in reports that count the number of times a metric has been
  triggered. This is also known as the newsletter's alias.
- *Newsletter ID:* used to differentiate between newsletters.
- *Event Type:* used to differentiate several actions on the same newsletter,
  such as opening the newsletter or clicking on a link.

To let administrators set these values, you must define a UI so your metric can
be configured during the view/save lifecycle. Remember that you must also define
a field to display the generated transparent image's URL. Create a `view.jsp`
file in your metric's module (e.g.,
`/src/main/resources/META-INF/resources/view.jsp`) and add the following logic:

    <%
    Map<String, Object> context = (Map<String, Object>)request.getAttribute("context");

    String alias = (String)context.get("alias");
    String elementId = (String)context.get("elementId");
    String eventType = (String)context.get("eventType");
    List<String> eventTypes = (List<String>)context.get("eventTypes");
    String trackImageHTML = (String)context.get("trackImageHTML");
    %>

    <aui:input helpMessage="name-help" label="name" name='<%= ContentTargetingUtil.GUID_REPLACEMENT + "alias" %>' type="text" value="<%= alias %>">
        <aui:validator name="required" />
    </aui:input>

    <aui:input helpMessage="enter-the-id-of-the-newsletter-to-be-tracked" label="newsletter-id" name='<%= ContentTargetingUtil.GUID_REPLACEMENT + "elementId" %>' type="text" value="<%= elementId %>">
        <aui:validator name="required" />
    </aui:input>

    <c:if test="<%= ListUtil.isNotEmpty(eventTypes) %>">
        <aui:select label="event-type" name='<%= ContentTargetingUtil.GUID_REPLACEMENT + "eventType" %>'>

            <%
            for (String curEventType : eventTypes) {
            %>

                <aui:option label="<%= curEventType %>" selected="<%= curEventType.equals(eventType) %>" value="<%= curEventType %>" />

            <%
            }
            %>

        </aui:select>
    </c:if>

    <c:if test="<%= !Validator.isBlank(trackImageHTML) %>">
        <span class="h5">
            <liferay-ui:message key="paste-this-code-at-the-beginning-of-your-newsletter" />
        </span>
        <label for='<%= renderResponse.getNamespace() + ContentTargetingUtil.GUID_REPLACEMENT + "trackImageHTML" %>' key="paste-this-code-at-the-beginning-of-your-newsletter" /></label>

        <liferay-ui:input-resource id='<%= renderResponse.getNamespace() + ContentTargetingUtil.GUID_REPLACEMENT + "trackImageHTML" %>' url="<%= trackImageHTML %>" />
    </c:if>

First you instantiate the `context` variable and its attributes you configured
in your Java class's `populateContext` method. Then you specify the appropriate
fields Name, Newsletter ID, and Event Type. Finally, you present the generated
transparent image URL.

Notice that the input field names in the JSP are prefixed with
`ContentTargetingUtil.GUID_REPLACEMENT`. This prefix is required for
multi-instantiable metrics, which are metrics that return `true` in the
`isInstantiable` method of their `-TrackingAction` class and can be added more
than once to the Metrics form.

![Figure 3: Once you've saved the metric, you can copy the generated transparent image URL into your newsletter's HTML to track who views it.](../../images-dxp/metric-generated-url.png)

Congratulations! You've created the newsletter metric and can now track whether
users viewed a newsletter. You can test if the metric is working by copying the
generated tracking image HTML into an email HTML editor, sending it, and opening
it as if it were an actual newsletter. Then open the custom report containing
the newsletter metric and select *Update Report*. A chart and table with the
newsletter's view count is shown.

You can view the finished version of the newsletter metric by downloading its
[ZIP file](https://customer.liferay.com/documents/10738/200086/newsletter.zip/589ea9a1-9473-4409-acc6-c41c6d20728a).

Now you've created and examined a fully functional metric and have the knowledge
to create your own.
