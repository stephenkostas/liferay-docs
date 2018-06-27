# Adding Templates [](id=adding-templates)

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
