# Displaying Custom Assets with Asset Display Pages 

Asset Display Pages provide highly customizable ways to display various assets
in Liferay using Page Fragments. With Asset Display Pages, an asset's fields
can be mapped to fields in a [Page Fragment](/develop/tutorials/-/knowledge_base/7-1/developing-fragments).
This provides many customizable, dynamic options for displaying content and 
assets. 

Asset Display Pages aren't just for Liferay's internal applications. If you 
create an application that uses Liferay's asset framework, you can 
configure your custom asset's fields to integrate with Asset Display Pages too. 
This is accomplished by [creating a Display Contributor]() class that extends 
`BaseAssetDisplayContributor` and [defining fields to contribute]() by 
implementing `AssetDisplayContributorFields`.
