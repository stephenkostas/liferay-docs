---
header-id: adding-comments-to-your-app
---

# Adding Comments to Your App

[TOC levels=1-4]

Liferay provides taglibs that enable comments on your app's content. Here, 
you'll learn how to use these taglibs, using a sample Guestbook app as an 
example. 

Follow these steps to enable commenting on your app's content: 

1.  Make sure your entity is 
    [asset enabled](/developer/frameworks/-/knowledge_base/7-2/asset-framework). 

2.  Choose a read-only view of the entity you want to enable comments on. You 
    can display the comments component in your app's view, or if you've 
    [implemented asset rendering](/developer/frameworks/-/knowledge_base/7-2/rendering-an-asset) 
    you can display it in the full content view in the Asset Publisher app. 

3.  Include the `liferay-ui`, `liferay-comment`, and `portlet` taglib 
    declarations in your JSP: 

        <%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
        <%@ taglib prefix="liferay-comment" uri="http://liferay.com/tld/comment" %>
        <%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>

4.  Use 
    [`ParamUtil`](@platform-ref@/7.2-latest/javadocs/portal-kernel/com/liferay/portal/kernel/util/ParamUtil.html) 
    to get the entity's ID from the render request. Then create an entity object 
    using the `-LocalServiceUtil` class. Here's an example that does this for a 
    guestbook entry in the example Guestbook app:

        <%
        long entryId = ParamUtil.getLong(renderRequest, "entryId");
        entry = EntryLocalServiceUtil.getEntry(entryId);
        %>

5.  Create a collapsible panel for the comments using the 
    `liferay-ui:panel-container` and `liferay-ui:panel` tags. This lets users 
    hide the discussion area: 

        <liferay-ui:panel-container extended="<%=false%>"
          id="guestbookCollaborationPanelContainer" persistState="<%=true%>">
          <liferay-ui:panel collapsible="<%=true%>" extended="<%=true%>"
            id="guestbookCollaborationPanel" persistState="<%=true%>"
            title="Collaboration">

6.  Create a URL for the discussion using the `portlet:actionURL` tag: 

        <portlet:actionURL name="invokeTaglibDiscussion" var="discussionURL" />

7.  Use the `liferay-comment:discussion` tag to add the discussion. To let the 
    user return to the JSP after making a comment, set the tag's `redirect` 
    attribute to the current URL. You can use 
    `PortalUtil.getCurrentURL((renderRequest))` to get the current URL from the 
    `request` object. In this example, the current URL was earlier set to the 
    `currentURL` variable: 

            <liferay-comment:discussion className="<%=Entry.class.getName()%>"
              classPK="<%=entry.getEntryId()%>"
              formAction="<%=discussionURL%>" formName="fm2"
              ratingsEnabled="<%=true%>" redirect="<%=currentURL%>"
              userId="<%=entry.getUserId()%>" />

          </liferay-ui:panel>
        </liferay-ui:panel-container>

If you haven't already connected your portlet's view to the JSP for your entity, 
see 
[Configuring JSP Templates for an Asset Renderer](/developer/frameworks/-/knowledge_base/7-2/configuring-jsp-templates-for-an-asset-renderer). 

## Related Topics

[Asset Framework](/developer/frameworks/-/knowledge_base/7-2/asset-framework)

[Rating Assets](/developer/frameworks/-/knowledge_base/7-2/rating-assets)
