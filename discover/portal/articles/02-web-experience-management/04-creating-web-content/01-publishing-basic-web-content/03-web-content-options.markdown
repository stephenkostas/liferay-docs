# Web Content Options

The bottom menu of the New Web Content form provides options for customizing
your web content.

![Figure 7: New web content can be customized in various ways using the menu located below the WYSIWYG editor.](../../../images/wcm-menu.png)

**Structure and Template:** lets you customize the web content article's
structure and template. To learn more about web content structures and
templates, visit the [Designing Uniform Content](/discover/portal/-/knowledge_base/7-0/designing-uniform-content)
section.

**Small Image:** sets the image that is used for the web content article's
previews. For example, when viewing an article in the Web Content library, the
small image is displayed as the article's icon.

**Metadata:** let you set the organizational hierarchy of the web content
article by selecting tags, categories, and priority. To learn more about tags
and categories, visit the
[Organizing Content with Tags and Categories](/discover/portal/-/knowledge_base/7-0/organizing-content-with-tags-and-categories)
section.

**Schedule:** customizes the date and time your content publishes and/or
expires. To learn more about scheduling content, visit the
[Scheduling Web Content Publication](/discover/portal/-/knowledge_base/7-0/scheduling-web-content-publication)
section.

**Display Page:** lets you determine where the web contents are displayed when
linked from other pages. The Canonical URL can be used here. The Canonical URL
is unique for articles that redirect the visitor to the article's default
display page.

Imagine you have a newspaper with a sports section and a technology section. You
add a Sports page and a Tech page to your site, each one with a specific banner
and look and feel. You want the articles to appear in the appropriate pages, but
you know in @product@, articles are not related to pages. You can add an article
as often as you like in different web content display apps or in configured
Asset Publishers. But if you have a *View in context* link, where will you show
your article? This is where you'd use a default display page. Articles that have
a default display page defined are shown with other related articles in the same
display page.

Imagine you have 100 sports articles and 100 tech articles. Instead of needing
to create a page for each article to show it, you can have only one sports page
and one tech page, and can show all articles in one place in a consistent
fashion. You'll work through an example of creating a display page in the
[Creating a Display Page](/discover/portal/-/knowledge_base/7-0/publishing-basic-web-content#creating-a-display-page)
sub-section.

**Related Assets:** lets you determine content relationships between the web
content article and other assets in your Liferay instance, even if they don't
share any tags and aren't in the same category. You can connect your content to
a Blogs Entry, Message Boards Message, Web Content, Calendar Event, Bookmarks
Entry, Documents and Media Document, Wiki Page, etc. To learn more about
defining content relationships and publishing links to those related assets,
visit the
[Defining Content Relationships](/discover/portal/-/knowledge_base/7-0/defining-content-relationships)
section.

![Figure 8: This blog entry has links to three Related Assets: one web content and two message board entries.](../../../images/related-assets-link.png)

**Permissions:** customizes who has access to the content. By default, content
is viewable by Anyone (Guest Role). You can limit viewable permissions by
selecting any Role from the drop-down or in the list. Additionally, @product@
provides the ability to customize permissions in more detail. Select the *More
Options* link below the drop down button and you'll find the different
activities you can grant or deny to your web content article.

While you can set permissions here, they are ignored unless you activate Web
Content Article permissions in your System Configuration: 

1. Go to the *Control Panel* &rarr; *Configuration* &rarr; *System Settings*.

2. Search or browse for *Web Content (Default Settings for All Instances)*.

3. Check the box labeled *Article view permissions check enabled*.

4. Click *Save*.

Once it is activated, any permissions you set in the article's configuration are
checked before displaying the article.

+$$$

**Version Note:** This property is only available with Fix Pack
de-13 installed. If you do not have the latest fix packs installed, set the 
`journal.article.view.permission.check.enabled=` to `true` in your 
`portal-ext.properties` file and restart Liferay to activate the permission 
check.

$$$

Before you display your web content, you'll learn how to localize it to cater to
different language speaking users.

## Localizing Web Content [](id=localizing-web-content)

When you create a new piece of web content, you have the ability to choose a
default language. First, you'll need to change the system configuration to 
enable the option to change the default language. Go to the *Control Panel* 
&rarr; *System Settings*. From *System Settings* scroll through the available 
configurations or use the search bar to find *Web Content Administration*. From 
there you can check the box to enable *Changeable Default Language* and save 
your configuration.

![Figure 9: This blog entry has links to three Related Assets: one web content and two message board entries.](../../../images/changeable-default-language.png)

After you enable changes to the default language, you'll see options at the top
of the New Web Content Screen to change the default language and add a 
translation. If you click *Change*, you can select your default language from a 
large number of languages @product@ supports.

![Figure 10: You have many translation languages to choose from for your web content.](../../../images/web-content-default-language.png)

After you click *Add Translation*, you can select a language by scrolling
through the list. When you select a language, an *Available Translations* list
is rendered and the language you selected is highlighted. The new web content
form enables you to translate the original web content into the selected
language. Once you are done with the translation, click *Publish* and the
translation is added to the list of *Available Translations*.

![Figure 11: The Available Translations list lets you easily survey the current translations for the article.](../../../images/web-content-translation.png)

You can modify the language translation list by inserting `locales.enabled=`
followed by your preferred languages in your `portal-ext.properties` file. For
example, `locales.enabled=ar_SA,nl_NL,hi_IN` offers *Arabic (Saudi Arabia)*,
*Dutch (Netherlands)*, and *Hindi (India)*.

+$$$

**Warning:** If you switch your site's default language (e.g., via friendly
URL), but do not have the necessary translations for localizable fields, your
site's language values will be used from the old default language. Therefore,
you should change the default language of your site *only* when you have
translated values for all localizable entities. Otherwise, you may not be in
control of what language is displayed in your Liferay instance.

$$$

The ability to completely delete a translation in one step is also available.
Instead of disabling a translation or having to go through a multistep
process to remove it, you can select the Delete button (`X`) next to the
translation to delete it.

When you create a new web content structure, each field you create has a
*Localizable* checkbox displayed next to it. This enables you to control what
can and can't be changed in the translation process. For example, if you don't
want images or content titles to be changed when the content is translated, you
can make sure those fields aren't listed as localizable. When you follow the
steps above to localize content, only fields within the structure that had the
*Localizable* box checked appear within the translation window.

