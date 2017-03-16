# Invoking Remote Services [](id=invoking-remote-services)

You can invoke the remote services of any installed Liferay application the same
way that you invoke your local services. Doing so could be described as
"invoking remote services locally." One reason to invoke a remote service
instead of the corresponding local service might be to take advantage of the
remote service's permission checks. Consider the following common scenario:

- Both a local service implementation and a remote service implementation have
  been created for a particular service.
- The remote service performs a permission check and then invokes the
  corresponding local service.

In the above scenario, it's a best practice to invoke the remote service instead
of the local service. Doing so ensures that you don't need to duplicate
permission checking code. This is the practice followed by the
[Event Listing](https://github.com/liferay/liferay-docs/tree/6.2.x/develop/tutorials/code/tutorials-sdk/portlets/event-listing-portlet)
project.

Of course, the main reason for creating remote services is to be able to invoke
them remotely. Service Builder can expose your project's remote web services
both via a JSON API and via SOAP. By default, running Service Builder with
`remote-service` set to `true` for your entities generates a JSON web services
API for your project. You can access your project's JSON-based RESTful services
via a convenient web interface. If you've deployed the
[Event Listing](https://github.com/liferay/liferay-docs/tree/6.2.x/develop/tutorials/code/tutorials-sdk/portlets/event-listing-portlet)
project, visit the following URL to view its JSON web services:

    http://localhost:8080/event-listing-portlet/api/jsonws

Each entity's available operations are listed on the plugin's JSON web services
API page. You can invoke JSON web services directly from your browser. For
example, to view details about your Event entity's *delete-event* service, visit
the above URL and click on the *delete-event* link. 

![Figure 1: You'll see a page displaying the name of the service method, its required parameters, its return type, possible exceptions it can throw, and a form for entering its parameters.](../../images/invoking-sb-generated-json-ws.png)

The only parameter required for the `delete-event` operation is an event ID. To
test the `delete-event` remote web service, you could use the Event Listing
portlet to add a new event. Then you could check the `Event_Event` table in
Liferay's database to find your event's event ID. To invoke the web service, you
could enter the event ID value into the `eventId` field in the Execute section
of the `delete-event` JSONWS page and click *Invoke*. Invoking the
`delete-event` service deletes the event that corresponds to the entered event
ID. Liferay returns feedback from each invocation that indicates, for example,
whether the service invocation succeeded or failed.

Finding a portlet's web services is easy with Liferay's JSON web service
interface. Invoking a portlet's web services via Liferay's JSON web service
interface is a great way to test them. You can also examine alternate equivalent
methods of calling the SOAP and JSON web services via JavaScript, Curl, and
URLs.

Service Builder can also make your project's web services available via SOAP
using Apache Axis. After you've built your portlet project's WSDDs (web service
deployment descriptors) and deployed the project as a plugin, its services are
available on your Liferay server. It's easy to list your plugin's SOAP web
services. You have two options: you can access them in Liferay IDE or you can
point your browser to your application's SOAP web services URL.

To access your SOAP web services in Liferay IDE, right-select your portlet from
under it's Liferay server in the *Servers* view. Then select *Test Liferay Web
Services...*.

If you'd rather view your SOAP web services from a browser, go to the following
URL: 

    http://localhost:8080/event-listing-portlet/api/axis

Liferay Portal lists the services available for all your entities and provides
links to their WSDL documents. For example, clicking on the WSDL link for the
Event service takes you to the following URL: 

    http://localhost:8080/event-listing-portlet/api/axis/Plugin_Event_EventService?wsdl 

This WSDL document lists the Event entity's SOAP web services. Once the web
service's WSDL is available, any SOAP web service client can access it. 

**Related Topics**

[Invoking Local Services](/develop/tutorials/-/knowledge_base/6-2/invoking-local-services)

[Invoking Liferay Services in your Android App](/develop/tutorials/-/knowledge_base/6-2/invoking-liferay-services-in-your-android-app)

[Invoking Liferay Services in your iOS App](/develop/tutorials/-/knowledge_base/6-2/invoking-liferay-services-in-your-ios-app)
