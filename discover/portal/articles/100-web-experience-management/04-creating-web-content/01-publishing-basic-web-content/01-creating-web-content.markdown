# Creating Web Content [](id=creating-web-content)

Content is the reason web sites exist. @product@ has made it easier than ever to
get content published to your site. Because @product@ is so flexible, you can use
basic authoring tools right away or take advantage of the more advanced
features. It's adaptable to your needs.

You'll begin by creating some simple content using Liferay's WYSIWYG editor.
Then you'll publish it to the home page of the Lunar Resort's web site. This is
a fast and straightforward process that demonstrates how easy it is to create
and publish content on your Liferay instance. You'll learn about the Web Content
section in Site Administration so you can create and publish your first pieces
of content.

When you manage web content from the Site Administration menu, you can select
the location where the content resides. When selecting the Site Administration
dropdown from the Menu, you are presented with two scopes: site scope and page
scope. The site scope can be managed by clicking the *Site Selector* button
(![Compass](../../../images/icon-compass.png)) located on the Site
Administration dropdown menu, which is characterized by the name of the site.
From there you can select the site for which you want your content scoped. For
instance, you can add content that's available to a specific site or globally
across your Liferay instance. By default, the page scope must be configured
before you can access it. For instance, if you add a Web Content Display app to
a site page called *Lunar Rover*, you can navigate to the app's *Options* icon
(![Options](../../../images/icon-app-options.png)) and select *Configuration*
&rarr; *Scope*. From the scope dropdown, you can select the current page you're
on, which will be characterized as *New* in parenthesis. Click *Save* and return
to the Site Administration &rarr; *Content* menu. You'll now observe the
*Default Scope* option. Select the *Default Scope* icon
(![Gear](../../../images/icon-control-menu-gear.png)) and choose the page you
configured. Now the content created in this app is scoped to the *Lunar Rover*
page only. For more information on scoping content in an application, visit the
[Application Scope](/discover/portal/-/knowledge_base/7-0/application-scope)
section.

![Figure 1: You can choose where to create content by navigating to the Site Administration menu and selecting your site and page scope.](../../../images/site-page-scopes.png)

Once you have the Lunar Resort site selected, click on the *Web Content* link
under Content. You'll see a folder structure containing all of the web content
articles that exist in the currently selected scope (the Lunar Resort site). You
can click the *Add* icon (![Add Web Content](../../../images/icon-add.png)) &rarr;
*Folder* to create a new folder. For sites with lots of content and web content
articles, it can be very useful to use folders to group certain kinds of web
content articles together. Click *Add* &rarr; *Basic Web Content* to create a
new web content article.

![Figure 2: Click *Add* &rarr; *Basic Web Content* to create a new simple web content article. To create a new web content article based on an existing web content structure, click *Add* and then click on the name of the structure you'd like to use.](../../../images/web-content-add-menu.png)

Existing web content structures also appear in the *Add* menu. This provides
users with shortcuts for creating specific kinds of web content articles. For
example, if a web content structure called *FAQ* has been created for Frequently
Asked Questions articles in your currently selected scope, you can create a new
FAQ article by clicking *Add* &rarr; *FAQ*.

+$$$

**Note:** In previous versions of Liferay, you could specify web content types
via `portal.properties`. In @product@ 7.0, web content types are no longer used
and have been replaced by vocabularies. Vocabularies allow users to filter their
web content articles by category instead, which lets you filter your content
using the Asset Publisher and faceted search. To learn more about vocabularies
and how to use them with web content articles, see the 
[Defining Categories for Content](/discover/portal/-/knowledge_base/7-0/organizing-content-with-tags-and-categories#defining-categories-for-content)
section.

$$$

You have the ability to provide a structure and template to your web content
articles. You'll learn more about the power of web content structures and
templates later. For now, you'll cover the basics of creating a piece of web
content by first exploring the editor.
