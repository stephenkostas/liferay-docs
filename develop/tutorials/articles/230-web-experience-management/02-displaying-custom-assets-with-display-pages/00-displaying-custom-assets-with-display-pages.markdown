# Displaying Custom Assets with Asset Display Pages 

Asset Display Pages provide highly customizable ways to display various assets
in Liferay using Page Fragments. With Asset Display Pages, an asset's fields
can be mapped to fields in a [Page Fragment](/develop/tutorials/-/knowledge_base/7-1/developing-fragments).
This provides many customizable, dynamic options for displaying content and 
assets. 

Asset Display Pages aren't just for Liferay's internal applications. If you 
create an application that uses Liferay's asset framework, you can 
configure your custom asset's fields to integrate with Asset Display Pages too. 
The primary point of integration between an application and Asset Display Pages 
is making the asset's fields available for display as part of an Asset 
Display Page. This is accomplished by [creating a Display Contributor](/develop/tutorials/-/knowledge_base/7-1/developing-fragments) class 
that extends `BaseAssetDisplayContributor` and [defining fields to 
contribute](/develop/tutorials/-/knowledge_base/7-1/developing-fragments) by implementing `AssetDisplayContributorFields`.
