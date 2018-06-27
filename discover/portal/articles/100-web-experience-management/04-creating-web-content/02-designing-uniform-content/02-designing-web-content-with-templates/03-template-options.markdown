
You can also embed applications in web content templates. This is a convenient
way to ensure that specified apps are always located inside your web content
article. Core apps and custom apps, whether instanceable or non-instanceable can
be embedded in web content templates. Below are examples of embedding the
Currency Converter app in FreeMarker and Velocity:

**FreeMarker:**

    <@liferay_portlet_ext["runtime"] portletName="com_liferay_currency_converter_web_portlet_CurrencyConverterPortlet" />

**Velocity:**

    $theme.runtime("com_liferay_currency_converter_web_portlet_CurrencyConverterPortlet");

+$$$

**Warning:** The `theme` variable is no longer injected into the FreeMarker
context. For more information about why the theme variable was removed for
@product@ 7.0 and suggestions for updating your code, visit the
[Taglibs Are No Longer Accessible via the theme Variable in FreeMarker](/develop/reference/-/knowledge_base/7-0/breaking-changes#taglibs-are-no-longer-accessible-via-the-theme-variable-in-freemarker)
breaking change entry.

$$$

In addition to embedding applications in templates, you can embed a template 
within another template. This allows for reusable code, JS library imports, 
scripts, or macros. The template that you embed should be a generic template
with no structure assigned to it. To create a template with no structure,
leave the structure field empty when you create the template. To reference a template from within another template, you will need the Template Key.

![Figure x: You can find the Template Key when view the Edit page for a template..](../../../images/find-template-key.png)

Below are examples of embedding template in FreeMarker and Velocity:

**FreeMarker**

    <#include "${templatesPath}/[template-key]" />    

**Velocity**

    #parse ("$templatesPath/[template-key]")

 

Liferay's taglibs are also accessible to web content administrators developing
in FreeMarker. There is no need to instantiate these taglibs within your
FreeMarker template; they're already provided for you automatically. You can
access these taglibs by indicating the TLD's file name with underscores. For
instance, the above FreeMarker example accessed a tag in the
`liferay-portlet-ext.tld` file by specifying `@liferay_portlet_ext`. This is not
available for Velocity users, since Velocity is deprecated for @product@ 7.0.

<!-- There is more information about how users can make their custom taglibs
accessible by using the FreeMarker Contributor. This would be a great tutorial
to link here.

https://github.com/liferay/liferay-portal/tree/master/modules/frontend/frontend-taglib-freemarker-contributor
-Cody -->

For cases where you're creating your template within @product@, you can use the
template editor. On the left side of the template editor, you'll notice a
palette of common variables used for making web content templates. This is a
great reference when creating your template. To place one of the variables onto
the template editor, simply position your cursor where you want the variable
placed, and click the variable name. If the variable name doesn't give you
sufficient information on the variable's functionality, you can hover your
pointer over it for a more detailed description.

![Figure 6: You can hover your pointer over a variable for a more detailed description.](../../../images/web-content-templates-create.png)

The interactive template editor is available for the FreeMarker, Velocity, and
XSL languages. Depending on which language you select, the variable content
changes so you're always adding content in the language you've chosen. Another
cool feature for the template editor is the autocomplete feature. It can be
invoked by typing *${* which opens a drop-down menu of available variables. By
clicking one of the variables, the editor inserts the variable into the template
editor.

+$$$

**Note:** The `utilLocator`, `objectUtil`, and `staticUtil` variables for
FreeMarker and the `utilLocator` variable for Velocity are disabled by default.
These variables are vulnerable to remote code execution and privilege
escalation, and should be used with caution, if enabled.

$$$

After you've saved your template, @product@ provides a WebDAV URL and static URL.
These values access the XML source of your structure. You can find these URLs by
returning to your template after it's been saved and expanding the *Details*
section. For more information on WebDAV and the uses of the WebDAV URL,
reference the [WebDAV Access](/discover/portal/-/knowledge_base/7-0/publishing-files#desktop-access-to-documents-and-media)
section.

Now that you've created a handsome template and know how to use the template
editor, it's time to decide who the lucky people are that get to use your new
template.

## Assigning Template Permissions [](id=assigning-template-permissions)

Permissions for templates are similar to permissions for structures. As with
structures, you only want specific developers editing and creating templates.
You may, however, want to make the templates viewable to some content creators
who understand the template scripting language but are not directly writing the
scripts. You can determine who views and interacts with the template by
navigating to the *Options* button (![Options](../../../images/icon-options.png)) 
at the top right and selecting *Templates*. Then select the *Action* button
(![Actions](../../../images/icon-actions.png)) and click *Permissions*.

You can grant or deny permissions based on Roles. For instance, you may create a
role with the ability to update the template and create a second role that can
both update and delete. @product@ makes it possible to assign permissions based on
the roles and responsibilities within your organization.

Whether your site is small and static or large and dynamic, Liferay’s WCM
enables you to plan and manage it. With tools such as the WYSIWYG editor,
structures and templates, you can quickly add and edit content. With the Web
Content Display, you can rapidly select and configure what content to display.
You'll find that managing your site becomes far easier when using @product@’s Web
Content Management system.

<div class="video-tag" data-name="Creating Content with Structures and Templates">
  <video width="100%" height="100%" controls>
    <source src="https://dev.liferay.com/documents/10184/1058908/creating-content-with-structures-and-templates.mp4" type="video/mp4">
    <source src="https://dev.liferay.com/documents/10184/1058908/creating-content-with-structures-and-templates.webm" type="video/webm">
    Your browser does not support HTML5 video.
  </video>
</div>
