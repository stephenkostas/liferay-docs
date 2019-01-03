# Displaying Custom Assets with Asset Display Pages [](id=displaying-custom-assets-with-asset-display-pages)

Asset Display Pages display assets in highly customizable ways using Page
Fragments. With Asset Display Pages, an asset's fields can be mapped to fields
in a 
[Page Fragment](/develop/tutorials/-/knowledge_base/7-1/developing-fragments),
which gives you dynamic options for displaying content and assets. 

If you create an application that uses Liferay's asset framework, you can
make your custom asset's fields integrate with Asset Display Pages. This
is accomplished by 
[creating a Display Contributor](/develop/tutorials/-/knowledge_base/7-2/creating-a-display-contributor) 
class that extends `BaseAssetDisplayContributor` and [defining fields to contribute](/develop/tutorials/-/knowledge_base/7-2/asset-display-contributor-fields) by implementing `AssetDisplayContributorFields`.

Once you configure your application for Asset Display Pages, you can use the
Asset Display Page tag library to 
[integrate Asset Display Pages into asset creation](/develop/tutorials/-/knowledge_base/7-2/asset-display-contributor-fields).
