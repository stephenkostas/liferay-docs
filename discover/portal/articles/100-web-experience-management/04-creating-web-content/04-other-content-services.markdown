# Other Content Services

You can integrate @product@ with external services to enable additional
functionality.

## Xuggler for Embedding Video

For example, if you navigate to the Control Panel, click on
*Configuration* &rarr; *Server Administration* &rarr; *External Services*. From
this menu, you can install and enable Xuggler. Enabling Xuggler allows you to
embed audio and video files in web content. Installing and enabling Xuggler is
easy; you can do it right from the Control Panel. Please refer to the
[Publishing Files](/discover/portal/-/knowledge_base/7-0/publishing-files)
article of this guide for more details.

Once Xuggler has been installed and enabled, embedding audio or video files in a
web content article is easy. By default the current WYSIWYG editor (AlloyEditor)
does not provide audio/video files. You can extend the default AlloyEditor by
adding an audio/video button. You can learn about doing this in the
[WYSIWYG Editors](/develop/tutorials/-/knowledge_base/7-0/wysiwyg-editors)
tutorials section. Another option you have is changing the WYSIWYG editor to one
that supports embedding audio/video files in web content. The CKEditor, for
example, is an editor that provides this functionality. To use the CKEditor,
create a `portal-ext.properties` file in your @product@ root folder and add the
following property:

    editor.wysiwyg.portal-impl.portlet.ddm.text_html.ftl=ckeditor

Once you restart your Liferay instance, the AlloyEditor is replaced with the
CKEditor and you have the ability to add audio/video files!

Place your cursor in the editor and select the audio/video button and then
choose the file you'd like to insert. If you haven't already uploaded the audio
or video file to your Liferay instance, you'll need to navigate to *Documents
and Media* in the Content section and upload the file to Liferay. Select the
file and then check that the audio or video component appears in the web
content. Excellent! When your web content is published, users can view or listen
to the embedded multimedia!

![Figure 5: If you've installed and enabled Xuggler from the *Server Administration* &rarr; *External Tools* section of the Control Panel, you can add audio and video to your web content!](../../../images/web-content-audio-video.png)

## XML Format Downloads

You can also download the web content article in XML format by clicking the
*Options* icon (![Options](../../../images/icon-options.png)) from the top right
corner of the screen and selecting *View Source*. This button is available on
the Edit Web Content screen, after you've created your web content article.

![Figure 6: The *View Source* button is available from the *Options* button.](../../../images/web-content-download.png)

An XML version of an article is essential when creating content for themes using
the [Resources Importer](https://dev.liferay.com/participate/liferaypedia/-/wiki/Main/Resources+Importer).
If you'd like to learn more about importing web content with a theme, visit its
dedicated [tutorial](/develop/tutorials/-/knowledge_base/6-2/importing-resources-with-your-themes).

<!-- Update links above for 7.0, when available. -Cody -->
