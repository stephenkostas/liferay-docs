# Displaying Custom Assets with Asset Display Pages [](id=displaying-custom-assets-with-asset-display-pages)

Asset Display Pages display assets in highly customizable ways using [Page Fragments](/develop/tutorials/-/knowledge_base/7-1/developing-fragments). Out 
of the box, Liferay supports using Asset Display Pages to map the fields of 
certain assets, like Web Content, to fields defined in a Page Fragment. The 
asset can then be displayed on a page using the Page Fragment as a 
template.

For example, you could use this to have a specific design for displaying 
Web Content Articles by following these steps: 

1.  Create a Page Fragment which contains editable elements for each of the 
    entity fields that you want to display, like the title, abstract, 
    body, and images.

2.  Create a Display Page and map each of the Web Content article entity type 
    to the appropriate fields in the Page Fragment.

3.  Modify an existing article or create a new one and select your new Display 
    Page under the *Display Page* section.

4.  Links to the full content of your article will now display a Display Page 
    with the content from the article and the design and styling from the Page 
    Fragment.

In addition to doing this with the default assets, if you integrate your 
application's entities with the [Asset Framework](/develop/tutorials/-/knowledge_base/7-2/asset-framework) you can 
also integrate with Asset Display Pages to display them. To use Asset Display 
Pages with custom assets, you must:

1.  [Create a Display Contributor](/develop/tutorials/-/knowledge_base/7-2/creating-a-display-contributor) class that extends `BaseAssetDisplayContributor`.

2.  [Define fields to contribute](/develop/tutorials/-/knowledge_base/7-2/asset-display-contributor-fields) by implementing `AssetDisplayContributorFields`.

3.  Use the Asset Display Page tag library to [integrate Asset Display Pages into asset creation](/develop/tutorials/-/knowledge_base/7-2/asset-display-contributor-fields).

Next, you'll go through each of these steps to demonstrate enabling Asset Display Pages for your applications entities.