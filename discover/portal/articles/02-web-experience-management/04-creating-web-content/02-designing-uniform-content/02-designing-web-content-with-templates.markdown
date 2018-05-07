# Designing Web Content with Templates [](id=designing-web-content-with-templates)

Developers create templates to display the elements of the structure in the
markup they want. Content can then be styled properly using CSS, because markup
is generated consistently by the template when structured content is displayed.
In essence, templates are scripts that tell @product@ how to display content in
the structure. Any changes to the structure require corresponding changes to the
template, because new or deleted fields produce errors on the page. If users
enter content into a structure, it *must* have a matching template. You have
options, however, for whether you want your template to be permanently linked to
your structure. Generic templates are templates that are not tied to a
structure, which allows for reusable code that can be imported into other
templates. Without a template, @product@ has no idea how to display content which
has been created using a custom structure.

You'll look more closely at the types of templates @product@ supports next.

### Template Types (FTL, VM, and XSL) [](id=template-types-ftl-vm-and-xsl)

@product@ supports templates written in three different templating languages, to
support the skill sets of the largest number of developers. This increases the
chances you can jump right in and use whichever one you've already used before.
If you haven't yet been exposed to any of them, your best bet is FreeMarker or
Velocity, as they are less "chatty" than XSL and extremely simple to
understand.

**FTL** (FreeMarker Template Language): FreeMarker is a templating language
which could be considered a successor to Velocity. It has some advantages over
Velocity for which it sacrifices some simplicity, yet it is still easy to use.
If you haven't used any of the template languages before, FreeMarker is
recommended: you'll get up to speed the fastest.

**VM** (Velocity Macro): Velocity is a scripting language that lets you mix
logic with HTML. This is similar to other scripting languages, such as PHP,
though Velocity is much simpler.

+$$$

**Note:** The Velocity template language is deprecated for @product@ 7.0.

$$$

**XSL** (Extensible Style Sheet Language): XSL is used in Liferay templates to
transform the underlying XML of a structure into markup suitable for the
browser. While it may not be as clean and compact as Velocity or FreeMarker,
it's widely used for transforming XML into other formats and it's very likely
your developers have already been exposed to it.

### Adding Templates [](id=adding-templates)

Liferay WCM makes it easy to create structures, templates, and content from the
same interface. You'll go through the entire flow of how you'd create a
structure, link it to a template, and then create content using them both.
You'll use FreeMarker for your template and lay out the structure fields
systematically to go along with the format you've defined for your content.

1.  Go back to the Web Content section of the Site Administration page and click
    *Add* &rarr; *Basic Web Content*.
2.  Select *Structure and Template* from the bottom menu and click *Select*
    under the Structures heading to access the Manage Structures interface.
3.  Click on the *Add* button (![Add Template](../../../images/icon-add.png)).
4.  Name the structure *News Article* and add the following fields:

	| Field Type | &nbsp;Field Label | &nbsp;Name |
	--------- | ---------- | ---------- |
	Text  | &nbsp;Title | &nbsp;`title` |
	Text Box | &nbsp;Abstract | &nbsp;`abstract` |
	Image | &nbsp;Image | &nbsp;`image` |
	HTML | &nbsp;Body | &nbsp;`body` |

5.  Click *Save*.
6.  In the Manage Structures interface, click *Choose* next to the News Article
    structure that you created.
7.  In the New Web Content form, click *Select* under the Template heading to
    access the Manage Templates interface.
8.  Click *Add*, enter the name *News Article*, and add a description.
9.  Make sure FreeMarker is selected as the script language (it's the default).
10. If you've written the script beforehand, you can select *Browse* to upload
    it from your machine. Otherwise, you can type the script directly into the
    script editor window.
11. Click *Save*.
12. Click *Choose* next to the News Article template you created.
13. On the New Web Content form, you'll see the Title, Abstract, Image, and Body
    fields that you defined for the News Article structure. The News Article
    template should also be selected.
14. Populate the fields and click *Publish* to publish your News Article.

Below is the template script for this structure. It is written in FreeMarker:

    <#assign renderUrlMax = request["render-url-maximized"]>
    <#assign namespace = request["portlet-namespace"]>
    <#assign readmore = request.parameters?is_hash && request.parameters.read_more?? && getterUtil.getBoolean(request.parameters.read_more?first, false)>
    <h1>${title.getData()}</h1>
    <#if readmore>
    <p>${abstract.getData()}</p>
    <p>${body.getData()}</p>
    <#else>
    <p>
    <img src="${image.getData()}" border="0" align="right">
    ${abstract.getData()}</p>
    <a href="${renderUrlMax}&${namespace}read_more=true">Read More</a>
    </#if>

This template is small but accomplishes a lot. First, a portlet URL which
maximizes the portlet is created. Once this is done, the template gets the
namespace of the portlet. This is important to avoid URL collisions with other
URLs that might be on the page.

After this, the template attempts to get a request parameter called `read_more`.
Whether or not this was successful is the key to the rest of the script:

- If the template got the `read_more` parameter, it displays the abstract and
the body below the title (which is always displayed).

- If the template didn't get the `read_more` parameter, it displays the image,
the abstract and the link created above, which sets the `read_more` parameter.

When this template is rendered, it looks something like this:

![Figure 5: The initial and expanded views for the Lunar Resort News Article. After clicking *Read More*, you're able to read the full text body.](../../../images/web-content-structures-templates-completed.png)

+$$$

**Note:** During the creation of a web content article, @product@ provides an
*Options* &rarr; *Preview* button that gives you the option to preview your
article as a final product before publishing. In some instances, the preview
does not give an accurate depiction of the web content article. For example,
fields provided by the `request` variable are not available because the
`request` is not populated until the web content is rendered on a Liferay page.
Therefore, the preview of the article would display errors. Use the *Preview*
functionality with caution.

$$$

@product@ also provides the ability to create generic templates that aren't
connected to a specific structure. In previous versions of Liferay, each
template had to be associated with a structure. Now, you have options for
whether to permanently assign a template to a structure or create a generic
template and reuse its code for any structure.

Suppose you have three different Lunar Resort web content articles and
structures with similar aesthetics. Instead of creating three different
templates from scratch, you can use the same generic template for all three and
build off of it. This creates a smarter and more efficient process when creating
a multitude of similar web content articles.

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
