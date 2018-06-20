# Advanced Site Settings

Advanced Settings are settings that relate to security (like User Roles) or 
that require some kind of external configuration (like creating a Google 
Analytics account) in order to use.

### Default User Associations [](id=default-user-associations)

*Default User Associations* is the leading option when opening the Advanced 
tab. It is for configuring site roles and teams that newly assigned site 
members will have by default. If you'd like to learn more about creating roles 
and/or teams, visit the [Roles and Permissions](/discover/portal/-/knowledge_base/7-1/roles-and-permissions)
and [Creating Teams for Advanced Site Membership Management](/discover/portal/-/knowledge_base/7-1/creating-teams-for-advanced-site-membership-management)
sections, respectively.

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

To enable a different analytics service:

1.  Go to *Configuration* in the Control Panel.

2.  Go to *Instance Settings* &rarr; *Miscellaneous*.

3.  Enter the name of any additional service you want to add in the *Analytics*
    field provided.

4.  Once you have entered the name, go to the *Site Settings* &rarr; *Advanced* 
    &rarr; *Analytics* page for the site where you wish to add analytics.
    
5.  Copy the JavaScript tracking code provided by your analytics platform into 
    corresponding field for your service.

    Now all pages on the selected site contain the tracking script and will 
    send analytics data to your analytics platform. 

This procedure lets you use any tool you want to visualize your site's traffic.

## Maps [](id=maps)

The *Maps* options lets you configure the maps API provider used by your Liferay
instance when displaying geolocalized assets. Geolocalized assets can be
displayed for documents, web content articles, DDL records, etc. Maps is
available under the Advanced tab. You can read more about Geolocation in [Geolocating Assets](/discover/portal/-/knowledge_base/7-1/geolocating-assets).


### Recycle Bin [](id=recycle-bin)

The *Recycle Bin* option under the Advanced tab provides the option to
enable/disable the Recycle Bin for your site. You can also regulate the age (in
minutes) for which content is able to be stored in the Recycle Bin until it is
permanently deleted. For a full explanation of the Recycle Bin, see the
[Restoring Deleted Assets](/discover/portal/-/knowledge_base/7-0/restoring-deleted-assets)
section.

### Content Sharing [](id=content-sharing)

If you select the *Content Sharing* tab from the Advanced tab, you can
configure whether sub-sites can display content from this site. Administrators
of this site's sub-sites can use all structures, templates, categories,
application display templates, etc. from this parent site. Even if you
initially allowed content sharing between the parent site and its sub-sites,
you're able to disable this option and immediately revoke content sharing from
all sub-sites.
