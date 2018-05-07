# Displaying Web Content [](id=displaying-web-content)

Now that you've created and published your first piece of web content for
the Lunar Resort, it's time to display it. First, add the *Web Content Display*
application to your Welcome page by selecting the *Add* button
(![Add](../../../images/icon-control-menu-add.png)) from the top Control Menu
and selecting the *Applications* tab. In the search field, type *Web Content
Display*.

![Figure 12: Add the Web Content Display app to a page to begin displaying your new web content article.](../../../images/add-web-content-display.png)

Once the application appears, drag it to the position on the page where you want
your content to appear. You can have as many Web Content Display apps on a page
as you need, which gives you the power to lay out your content exactly the way
you want it. 

To add existing web content, click the *Select Web Content* button on the lower
left of the app. Click the *Select* button from the menu to choose the article
you'd like to display. You have several options here.

Naturally, if your content appears in the list, you can simply select it. If
there is lots of published content available, you could search for the content
by title, description, user name, or site (click the dropdown arrow to see all
the options).

Once you've selected the web content article, you're able to choose the User
Tools and Content Metadata to be published in the Web Content Display app. These
two entities have the following options to choose from, by default:

- **User Tools**
    - *Translations*
    - *Print*
- **Content Metadata**
    - *Related Assets*
    - *Ratings*
    - *Comments*
    - *Comment Ratings*

One of the many options is *Translations*, which shows the available locales for
your content. If you're working on the page for a particular language, you can
select the translation of your content that goes with your locale. To learn more
about translating your content, visit the
[Localizing Web Content](/discover/portal/-/knowledge_base/7-0/publishing-basic-web-content#localizing-web-content)
sub-section.

![Figure 13: Publishing web content is a snap. At a minimum, you only have to select the content you wish to publish. You can also enable lots of optional features to let your users interact with your content.](../../../images/web-content-choosing-web-content.png)

If you have enabled OpenOffice.org integration with your Liferay instance, you
can also enable document conversion for your content. This gives your users the
ability to download your content in their format of choice. This is especially
handy if you are running a research or academically oriented site; users can
very quickly download PDFs of your content for their research projects. These
conversion options will be available under the *User Tools* list.

+$$$

**Note:** To enable OpenOffice integration in your Liferay instance, navigate to
the Control Panel &rarr; *Configuration* &rarr; *Server Administration* &rarr;
*External Services* and select the *Enabled* checkbox for enabling OpenOffice
integration.

$$$

Note that you also have other options, such as enabling a Print button, enabling
ratings so users can rate the content, enabling comments, and enabling ratings
on comments.

The Print button pops the content up in a separate browser window that contains
just the content, without any of the web site navigation. This is handy for
printing the content. Enabling ratings shows one of two ratings interfaces
@product@ has: five stars or thumbs up and thumbs down. This can be set globally
in the `portal-ext.properties` file. See the
[Properties Document](https://docs.liferay.com/portal/7.0/propertiesdoc/portal.properties.html#Ratings%20Tag%20Library)
for more details about this.

Enabling comments creates a discussion forum attached to your content which
users can use to discuss your content. Enabling ratings on comments gives your
users the ability to rate the comments. By default, guests are not allowed to
leave comments on web content. If you'd like to allow guests to comment on your
web content article, navigate to the Control Panel &rarr; *Users* &rarr; *Roles*
and select *Guest* &rarr; *Define Permissions*. From the left menu, select *Site
Administration* &rarr; *Content* &rarr; *Web Content*. The navigate down to the
Web Content Article heading and select the *Add Discussion* checkbox. Guests are
now able to post comments on your web content article!

You may decide you want one, some, or none of these features, which is why
they're all implemented as simple selector buttons to be enabled or disabled at
need. Once you've selected the features you want to include in your Web Content
Display spp, click the *Save* button. You can now close the configuration
window.

To publish new content, select the *Add* icon
(![Add](../../../images/icon-app-add.png)) from the app's top panel and select
the type of article you'd like to add (e.g., Basic Web Content). This launches
the same full-featured editor you've already seen in the Menu, which lets you
add and edit content in place as you are working on your page.

This is another example of the flexibility that @product@ offers. At times, you
may want to add content directly into the Web Content Display app of the page
you're managing, especially if you are in the process of building the page. At
other times, you may want to navigate to Site Administration to create content,
because at that moment you're more concerned with the creation of the content
and not where the content will later be displayed. Liferay WCM supports both
processes. 

Editing content that's already been published is just as easy as creating new
content is. Once the content is displayed--whether you've selected content or
created it in the Web Content Display app--you can edit the content directly
from the Web Content Display app or from Site Administration. To edit it from
the Web Content Display app, select the *Options* button
(![Options](../../../images/icon-app-options.png)) from the app's top panel
and select the approriate edit action. For example, selecting the *Edit Web
Content* button launches the WYSIWYG editor and from there you can make any
necessary changes. You can also select the *Edit Template* button, which
launches the template editor for the web content article's template.

![Figure 14: You can select and edit an article, or edit its template directly from the Web Content Display app.](../../../images/web-content-display-icons.png)

There are instances where you've edited your web content article many times, and
you'd be interested in viewing the article's evolution. To view an article's
history, navigate to *Web Content* from the Menu. Then select the article's
*Actions* icon (![Actions](../../../images/icon-actions.png)) and select *View
History*. From this menu, you can view all the article's versions and
modified/display dates. Another cool feature is the web content Diff tool, which
lets you compare versions of the article and highlight the differences between
the two. Of course, you must have more than two versions of the article for this
feature to be available. Click the *Actions* icon again next to a version of the
article you'd like to compare and select *Compare to...*. Then select the other
article you want to compare. The tool provides color coded highlighting to
emphasize additions and deletions between the two articles.

![Figure 15: Comparing web content articles is a great feature to use during the Workflow process.](../../../images/web-content-diff-feature.png)

When you publish updates to a web content article that's already being displayed
somewhere in your Liferay instance (e.g., in a Web Content Display app or an
Asset Publisher app), the content is immediately updated (unless, of course, you
have a workflow enabled, which is discussed in greater detail in the
[Using Workflow](/discover/portal/-/knowledge_base/7-0/using-workflow) section).
It makes no difference whether you edit it from a Web Content Display app, from
the Asset Publisher, or from the Site Administration interface.

+$$$ 

**Note:** If you're using a mobile device or tablet and you'd like to view your 
page the way your users will see it (i.e., without all the app controls and 
icons), go up to the top Control Menu and select the *Toggle Controls* icon
(![Toggle Controls](../../../images/icon-edit-controls.png)). This makes all 
those extra controls you see as a Liferay administrator disappear. You'll also 
notice the icon is crossed out when the Toggle Controls are disabled. If you 
need to use the controls again, just select the icon again to return to the 
original format.

This button is not displayed when viewing the page from a desktop computer. This 
is because apps displayed from a desktop computer hide their controls by 
default, and can be rendered by hovering over the app. To test out your page 
from different devices, select the *Simulation* button (![Simulation](../../../images/icon-simulation.png)) 
from the right corner of the top Control Menu.

$$$

As an administrator, you may want to monitor what changes are being made to your
site's web content without implementing a workflow process. To keep tabs on
what's going on with your site's web content, you can subscribe to
articles and folders. To do this, select the checkbox next to the web content
entities you'd like to monitor. Then click the *Information* icon
(![Information](../../../images/icon-information.png)) and select the *Subscribe*
icon (![Subscribe](../../../images/icon-star.png)). Now whenever a web content
article or folder is modified, you'll receive an email to your account's
configured email address notifiying you of a change. To learn more about
configuring your email in @product@, visit the
[Instance Settings](/discover/portal/-/knowledge_base/7-0/instance-settings)
section. You can navigate to your Web Content menu's *Options* icon
(![Options](../../../images/icon-options.png)) and select *Configuration* to
modify your Web Content email notification settings.

![Figure 16: Click the Subscribe icon in the web content entity's *Information* menu to begin receiving web content notifications.](../../../images/web-content-subscribe.png)

That's pretty much all there is to simple content creation. Whole sites have
been created this way. But if you want to take advantage of the full power of
@product@'s WCM, you'll want to use structures and templates. You'll cover these
topics next.
