# Other Content Options [](id=other-content-options)

Publishing content won't always be a neat and simply process. Here are some important options and tools that you can use.

## Localizing Content

When you create a new piece of web content, you have the ability to choose a
default language. First, you'll need to change the system configuration to 
enable the option to change the default language.

1.  Go to the *Control Panel* &rarr; *System Settings*. 

2.  Locate *Web Content* &rarr; *Administration* by scrolling or using the 
    search bar.

3.  Check the box labeled *Changeable Default Language*.

4.  *Save* your configuration.

![Figure 9: This blog entry has links to three Related Assets: one web content and two message board entries.](../../../images/changeable-default-language.png)

After you enable changes to the default language, you'll see options at the top
of the New Web Content Screen to change the default language and add a 
translation. Click *Change*, to select a new default language from the list of
supported languages.

![Figure 10: You have many translation languages to choose from for your web content.](../../../images/web-content-default-language.png)

In order for this to all work, you need to add translations for whatever 
languages you need. Adding translations works like this:

1.  Open a web content article.

2.  Click the flag icon with a country code on it next to any localizable web 
    content field.

3.  Select a language from the list.

When you select a language, all of the fields in the article will switch to the 
new language. To create the new translation, fill in the fields in the selected 
language and publish the article. 

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

When you create a new web content structure, each field you create has a
*Localizable* checkbox displayed next to it. This enables you to control what
can and can't be changed in the translation process. For example, if you don't
want images or content titles to be changed when the content is translated, you
can make sure those fields aren't listed as localizable. When you follow the
steps above to localize content, only fields within the structure that had the
*Localizable* box checked appear within the translation window.

## Xuggler for Embedding Video

Xuggler is a tool which generates video previews and makes it possible to embed
videos from your Documents and Media library in web content and elsewhere on the
site. To enable Xuggler:

1.  Navigate to the *Control Panel*.

2.  click on *Configuration* &rarr; *Server Administration* &rarr; *External Services*.

3.  Scroll to the bottom and click *Install* in the *Xuggler* section.

    This will download the necessary libraries and prompt you to restart the
    server to enable Xuggler.

4.  After the server restarts, you can enable Xuggler from the same page.

Once Xuggler has been installed and enabled, you can embed a video or audio 
file in a web content article the same way you added images previously. 

![Figure 5: If you've installed and enabled Xuggler from the *Server Administration* &rarr; *External Tools* section of the Control Panel, you can add audio and video to your web content!](../../../images/web-content-audio-video.png)

## XML Format Downloads

@product@ provides tools like the [Resource Importer](/develop/tutorials/-/knowledge_base/7-1/importing-resources-with-your-themes) and Site Initiators which can be deployed to build a site almost 
instantly. To import Web Content like this, you need to have it individually
exported in XML format. To export the content:

1.  Go to *Site Administration* &rarr; *Content* &rarr; *Web Content*

2.  Start editing the article you need an XML version of.

3.  Click the *Options* icon (![Options](../../../images/icon-options.png)) in 
    the top right of the page and select *View Source*.

This displays the raw XML source of the article. You can copy this content to 
save into an XML file locally.

![Figure 6: The *View Source* button is available from the *Options* button.](../../../images/web-content-download.png)

˜
