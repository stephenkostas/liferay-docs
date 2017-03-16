# JSON Web Services Invoker [](id=json-web-services-invoker)

Using JSON web services is easy: you send a request that defines a service
method and parameters, and you receive the result as a JSON object. As easy as
this technique is, it can be improved. In this tutorial, we introduce a tool
that lets you use JSON web services more efficiently and pragmatically. 

Consider the following example. You're working with two related objects: a
`User` and its corresponding `Contact`. With simple JSON web service calls, you
first call the user service to get the user object and then you call the contact
service using the contact ID from the user object. You end up sending two HTTP
requests to get two JSON objects that aren't even bound together. There's no
contact information in the user object (i.e. no `user.contact`). This approach
is suboptimal with respect to performance (sending two HTTP calls) and usability
(manually managing the relationship between two objects). It'd be nicer if you
had a tool to address these inefficiencies. Fortunately, the *JSON Web Service
Invoker* does just that! 

Liferay's JSON Web Service Invoker helps you optimize your use of JSON Web
Services. In the following sections, we'll show you how. 

### Simple Invoker Calls [](id=a-simple-invoker-call)

The Invoker is accessible from the following fixed address:

    http://[address]:[port]/api/jsonws/invoke

It only accepts a `cmd` request parameter--this is the Invoker's command. If the
command request parameter is missing, the request body is used as the command.
So you can specify the command by either using the request parameter `cmd` or
the request body. 

The Invoker command is a plain JSON map that describes how JSON web services are
called and how the results are managed. Here's an example of how to call a
simple service using the Invoker: 

    {
        "/user/get-user-by-id": {
            "userId": 123,
            "param1": null
        }
    }

The service call is defined as a JSON map. The key specifies the service URL
(i.e. the service method to be invoked) and the key's value specifies a map of
service parameter names (i.e. `userId` and `param1`) and their values. In the
example above, the retrieved user is returned as a JSON object. Since the
command is a JSON string, null values can be specified either by explicitly
using the `null` keyword or by placing a dash before the parameter name and 
leaving the value empty (e.g. `"-param1": ''`).

The example Invoker calls functions exactly the same way as the following
standard JSON Web Service call: 

    /user/get-user-by-id?userId=123&-param1

Next, suppose that you're running Liferay locally on port `8080`. Consider the
following example of a real Liferay JSON web service invoker call. Suppose that
you're signed in to Liferay as the default admin user whose email address is
`test@liferay.com` and whose user ID is `20127`. And suppose that the value of
your `p_auth` authentication token is `htXjvt5d`. Then you can invoke the
following URL to obtain a JSON representation of your user object:

    http://localhost:8080/api/jsonws/invoke?cmd={%22/user/get-user-by-id%22:{%22userId%22:20172}}&p_auth=htXjvt5d

This URL uses the following JSON map. Notice that you supplied it by using the
`cmd` URL parameter:

    {
        "/user/get-user-by-id": {
            "userId": 20172
        }
    }

Notice in the URL that the double quotes are URL-encoded. If you're not sure
what your user ID is, use the Dockbar to navigate to *My Account*. Your user ID
is on the Details page. If you're not sure what the value of your `p_auth`
authentication token is, navigate to
[Liferay's JSON web services API page](http://localhost:8080/api/jsonws) and 
click on any method in the list. The value of your `p_auth` token appears under
the Execute heading along with any other parameters of the selected API method.

You can use JSON syntax for supplying values for objects and arrays that you
need to supply as parameters. To supply a value for an object, use curly
brackets: `{` and `}`. To supply a value for an array, use square brackets: `[`
and `]`. Suppose as before that you're signed in to Liferay as an admin user and
that the value of your `p_auth` authentication token is `htXjvt5d`. Furthermore,
suppose that two vocabularies have been created with vocabulary IDs of `20783`
and `20784`. Here's a real Liferay JSON web service invoker example that
demonstrates how to pass an array as a parameter:

    http://localhost:8080/api/jsonws/invoke?cmd={%22/assetvocabulary/get-vocabularies%22:{%22vocabularyIds%22:[20783,20784]}}&p_auth=htXjvt5d

This URL uses the following JSON map:

    {
        "/assetvocabulary/get-vocabularies": {
            "vocabularyIds": [20783,20784]
        }
    }

As before, the double quotes in the URL are URL-encoded. Also, the
`vocabularyIds` parameter is an array, so its value is supplied as a JSON array.

Finally, here's one more Liferay JSON web service invoker example that
demonstrates how to pass an object containing an array as a parameter:

    http://localhost:8080/api/jsonws/invoke?cmd={%22/user/add-user%22:{%22companyId%22:20127,%22autoPassword%22:false,%22password1%22:%22test%22,%22password2%22:%22test%22,%22autoScreenName%22:false,%22screenName%22:%22joe.bloggs%22,%22emailAddress%22:%22joe.bloggs@liferay.com%22,%22facebookId%22:0,%22openId%22:%22%22,%22locale%22:%22en_US%22,%22firstName%22:%22Joe%22,%22middleName%22:%22T%22,%22lastName%22:%22Bloggs%22,%22prefixId%22:0,%22suffixId%22:0,%22male%22:true,%22birthdayMonth%22:1,%22birthdayDay%22:1,%22birthdayYear%22:1970,%22jobTitle%22:%22Tester%22,%22groupIds%22:null,%22organizationIds%22:null,%22roleIds%22:null,%22userGroupIds%22:null,%22sendEmail%22:false,%22serviceContext%22:{%22assetTagNames%22:[%22test%22]}}}&p_auth=htXjvt5d

This URL uses the following JSON map:

    {
        "/user/add-user": {
            "companyId": 20127,
            "autoPassword": false,
            "password1": "test",
            "password2": "test",
            "autoScreenName": false,
            "screenName": "joe.bloggs",
            "emailAddress": "joe.bloggs@liferay.com",
            "facebookId": 0,
            "openId": "",
            "locale": "en_US",
            "firstName": "Joe",
            "middleName": "T",
            "lastName": "Bloggs",
            "prefixId": 0,
            "suffixId": 0,
            "male": true,
            "birthdayMonth": 1,
            "birthdayDay": 1,
            "birthdayYear": 1970,
            "jobTitle": "Tester",
            "groupIds": null,
            "organizationIds": null,
            "roleIds": null,
            "userGroupIds": null,
            "sendEmail": false,
            "serviceContext": {"assetTagNames":["test"]}
        }
    }

The `serviceContext` is the object containing an array in this example. It
contains the array `assetTagNames`.

Of course, the JSON Web Service Invoker handles calls to plugin methods as well:

    {
        "/suprasurf-portlet.surfboard/hello-world": {
            "worldName": "Mavericks"
        }
    }

The code above calls the (fictitious) SupraSurf portlet's remote service. 

You can use variables to reference objects returned from service calls. Variable
names must start with a dollar sign, `$`. In our previous example, the service
call returned a user object you can assign to a variable: 

    {
        "$user = /user/get-user-by-id": {
            "userId": 123,
        }
    }

The `$user` variable holds the returned user object. You can reference the
user's contact ID using the syntax `$user.contactId`. 

Next, see how you can use nested service calls to join information from two
related objects. 

## Nesting Service Calls [](id=nesting-service-calls)

With nested service calls, you can magically bind information from related
objects together in a JSON object. You can call other services within the same
HTTP request and nest returned objects in a convenient way. Here's the magic of
a nested service call in action: 

    {
        "$user = /user/get-user-by-id": {
            "userId": 123,
            "$contact = /contact/get-contact-by-id": {
                "@contactId": "$user.contactId"
            }
        }
    }

This command defines two service calls: the contact object returned from the
second service call is nested in (i.e. injected into) the user object, as a
property named `contact`. Now we can bind the user and his or her contact
information together! 

Let's see what the Invoker did in the background when we used a single HTTP
request to make the above nested service call: 

- First, the Invoker called the Java service mapped to `/user/get-user-by-id`,
  passing in a value for the `userId` parameter. 
- Next, the resulting user object was assigned to the variable `$user`. 
- The nested service calls were invoked. 
- The Invoker called the Java service mapped to `/contact/get-contact-by-id` by 
  using the `contactId` parameter, with the `$user.contactId` value from the
  object `$user`. 
- The resulting contact object was assigned to the variable `$contact`. 
- Lastly, the Invoker injected the contact object referenced by `$contact` into
  the user object's property named `contact`. 

+$$$

**Note:** You must *flag* parameters that take values from existing variables.
To flag a parameter, insert the `@` prefix before the parameter name. 

$$$

Next, let's talk about filtering object properties so that only the properties
you need are returned when you invoke a service. 

## Filtering Results [](id=filtering-results)

Many of Liferay Portal's model objects are rich with properties. If you only
need a handful of an object's properties for your business logic, making a web
service invocation that returns all of an object's properties is a waste of
network bandwidth. With the JSON Web Service Invoker, you can define a
*white-list* of properties: only the specific properties you request in the
object will be returned from your web service call. Here's how you white-list
the properties you need: 

    {
        "$user[firstName,emailAddress] = /user/get-user-by-id": {
            "userId": 123,
            "$contact = /contact/get-contact-by-id": {
                "@contactId": "$user.contactId"
            }
        }
    }

In this example, the returned user object has only the `firstName` and
`emailAddress` properties (it still has the `contact` property, too). To specify
white-list properties, you simply place the properties in square brackets (e.g.,
`[whiteList]`) immediately following the name of your variable. 

Let's talk about batching calls next. 

## Batching Calls [](id=batching-calls)

When we nested service calls earlier, the intent was to invoke multiple services
with a single HTTP request. Using a single request for multiple service calls is
helpful for gathering related information from the service call results, but it
can also be advantageous to use a single request to invoke multiple unrelated
service calls. The Invoker lets you batch service calls together to improve
performance. It's simple: just pass in a JSON array of commands using the
following format: 

    [
        {/* first command */},
        {/* second command */}
    ]

The result is a JSON array populated with results from each command. The
commands are collectively invoked in a single HTTP request, one after another. 

Now that you've learned the ins and outs of invoking JSON web services in
Liferay, you may want to consider taking a streamlined approach to accessing Web
Content articles and Dynamic Data List records. Liferay's Skinny JSON Provider
app gives you access to them and returns them in an easy-to-use fashion. For
more information, please refer to the
[Invoking Services Using Skinny JSON Provider](/develop/tutorials/-/knowledge_base/6-2/invoking-services-using-skinny-json-provider) 
tutorial.

## Related Topics [](id=related-topics)

[Registering JSON Web Services](/develop/tutorials/-/knowledge_base/6-2/registering-json-web-services)

[Invoking JSON Web Services](/develop/tutorials/-/knowledge_base/6-2/invoking-json-web-services)

[JSON Web Services Invocation Examples](/develop/tutorials/-/knowledge_base/6-2/json-web-services-invocation-examples)
