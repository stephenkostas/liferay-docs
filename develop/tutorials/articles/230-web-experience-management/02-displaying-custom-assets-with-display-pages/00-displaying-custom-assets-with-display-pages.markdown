# Displaying Custom Assets with Asset Display Pages [](id=displaying-custom-assets-with-asset-display-pages)

Asset Display Pages provide highly customizable ways to display assets
in Liferay using Page Fragments. With Asset Display Pages, an asset's fields
can be mapped to fields in a [Page Fragment](/develop/tutorials/-/knowledge_base/7-1/developing-fragments).
This provides many customizable, dynamic options for displaying content and 
assets. 

Asset Display Pages aren't just for Liferay's internal applications. If you 
create an application that uses Liferay's asset framework, you can 
configure your custom asset's fields to integrate with Asset Display Pages too. 
The primary point of integration between an application and Asset Display Pages 
is making the asset's fields available for display as part of an Asset 
Display Page. This is accomplished by [creating a Display Contributor](/develop/tutorials/-/knowledge_base/7-1/creating-a-display-contributor) 
class that extends `BaseAssetDisplayContributor` and [defining fields to contribute](/develop/tutorials/-/knowledge_base/7-1/asset-display-contributor-fields) by implementing `AssetDisplayContributorFields`.

Once you configure your application for Asset Display Pages, you can use the
Asset Display Page taglib to [integrate Asset Display Pages into asset creation](/develop/tutorials/-/knowledge_base/7-1/asset-display-contributor-fields).
