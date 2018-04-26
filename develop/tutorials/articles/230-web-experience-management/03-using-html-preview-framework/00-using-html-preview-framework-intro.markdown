# HTML Preview Framework

The HTML Preview Framework can generate previews of HTML content. This can be used in a variety of ways. In Liferay's Fragment editor it is used to display a live preview of XHTML content created in the editor. It could also be used to display static HTML provided as an example or generate an output file.

HTML Preview contains two parts: the HTML Preview Generator Service and the HTML Preview Processor. The Preview Generator Service takes HTML as an input and returns an `HtmlPreviewEntry` containing the preview of the rendered content. The HTML Preview Processor renders the preview to different document types, by extending the `HtmlPreviewProcessor` interface.

In this tutorial we'll look first at how to use the HTML Preview Generator to 
preview code in your own custom application. After that we'll look at 
possibilities for extending the HTML Preview Generator to create different 
kinds of output.

## Using the HTML Preview Generator

The Fragment editor uses the HTML Preview Generator to provide an on-the-fly
preview for the HTML, CSS, and JavaScript. Since it's an OSGi module, it's
usable in any application. To use it in your application,

1.  Add the `com.liferay:com.liferay.html.preview.api` module as a project 
    dependency.
 
2.  Inject the service as an `@Reference` in any `@Component`:
    
        @Reference
        private HtmlPreviewEntryLocalService _htmlPreviewEntryLocalService;

3.  Next call this method generate an HTML preview:

        public HtmlPreviewEntry addHtmlPreviewEntry(
           long userId, long groupId, long classNameId, long classPK,
           java.lang.String.content, java.lang.String mimeType,
           ServiceContext.serviceContext)
         throws PortalException;

    The `classNameId` and `classPK` fields are the class name and identifier of 
    the entity you want to generate a preview for. `content` is XHTML content.
    The default implementation throws a `PortalException` if it is not well
    formed XHTML content. The method returns an `HtmlPreviewEntry` instance
    that's linked to a file entry for the further processing if needed.

4. Finally, you'll need to display in through 

As an example, let's look at Liferay's Fragment editor.

## Extending the HTML Preview Framework

By default, the HTML Preview Generator directly renders the previewed content as
HTML to be displayed in the browser. You can add support to output a PDF or
other format. You must, of course, provide the requisite code and libraries to
generate your desired output. Your new HTML preview processor must be an OSGI
`@Component` and must implement `HtmlPreviewProcessor.` Here's a sample
interface:

    public interface HtmlPreviewProcessor {

    /**
     * Generate a preview from an HTML content
     *
     * @param content HTML content to generate a preview for.
     * @return Generated preview file.
     * @throws Exception
    */

    public File generateHtmlPreview(String content) throws Exception;

    /**
     * HTML preview processor MIME type.
     *
     * @return MIME type string.
    */

    public String getMimeType();
    }

<!-- This tutorial isn't done. All you've listed is the interface. Every IDE can
generate the methods that must be implemented when you create a class based on
the interface. Please document an actual, implemented sample, even if it's just
the one Liferay already provides. -Rich --> 
