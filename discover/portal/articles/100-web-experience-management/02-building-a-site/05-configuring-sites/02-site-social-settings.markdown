# Site Social Settings [](id=improving-site-intelligence)

Site Settings offers several miscellaneous configuration options that improve
your site's usability, overall display, and data tracking. To make your site 
smarter, explore and configure the options below.


## Analytics [](id=analytics)

Analyzing site traffic is another huge advantage for site administrators that
want to monitor what content is most popular. @product@ includes built-in
support for Google Analytics, allowing administrators to make use of Google's
tool set for analyzing site traffic data. When you sign up for Google Analytics,
a snippet of code is provided which needs to be added to your web pages to allow
Google's system to register the page hit. It can be a tedious process to add
this code to every page on a site, especially if it's a large site and there is
a lot of user-generated content.

This problem can be solved in Liferay by putting Google's code into a custom
theme written specifically for the web site on which Liferay is running. Doing
this, however, requires a theme developer to make specific changes to the theme
and it prevents users from using the many themes that are freely available for
@product@ "out of the box."

Because of this, support for Google Analytics has been built into @product@, and
can be turned on through a simple user interface. This allows Liferay
administrators to make use of Google Analytics on a site by site basis and turn
it on and off when needed. You can sign up for Google Analytics at the Google
Analytics site here:

[http://www.google.com/analytics](http://www.google.com/analytics)

To enable Google Analytics support, navigate to the *Analytics* tab in Site
Settings, which loads a very simple form, pictured below.

![Figure 5: Setting up Google Analytics for your site is very easy: sign up for Google Analytics, receive an ID, and then enter it into the Google Analytics ID field.](../../../../images/maintaining-google-analytics.png)

Enter your Google Analytics ID (which should have been provided to you when you
signed up for the service) in the field and click *Save*. All the pages in the
site you selected will now have the Google Analytics code in them and will be
tracked. 

To enable a different analytics service, navigate to *Configuration* in the
Control Panel, and then go to *Instance Settings* &rarr; *Miscellaneous*. You
can enter the name of any additional service you want to add in the *Analytics*
field provided. Once you have entered the name, go to the *Site Settings*
&rarr; *Advanced* &rarr; *Analytics* page for the site where you wish to add
analytics. Copy the JavaScript tracking code provided by your analytics
platform into corresponding field for your service. Now all pages on the
selected site contain the tracking script and will send analytics data to your
analytics platform. 

This is a fairly simple procedure, and it gives you the ability to take
advantage of some great tools to help you visualize who's coming to your site
and from where. The *Analytics* option is listed under the Advanced tab.

## Maps [](id=maps)

The *Maps* options lets you configure the maps API provider used by your Liferay
instance when displaying geolocalized assets. Geolocalized assets can be
displayed for documents, web content articles, DDL records, etc. Maps is
available under the Advanced tab. You can read more about Geolocation in [Geolocating Assets](/discover/portal/-/knowledge_base/7-1/geolocating-assets).


## Languages [](id=languages)

The *Languages* option lets you configure the language options for your
site. This is the leading option when opening the Languages tab. You have
options to use the default language options or define a custom default language.

Now that you know how to configure sites, you'll learn how to customize your
personal sites.
