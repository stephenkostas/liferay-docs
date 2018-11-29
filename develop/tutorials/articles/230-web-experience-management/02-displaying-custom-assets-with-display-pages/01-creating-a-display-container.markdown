# Creating a Display Container

All the logic related to Asset Display Contributors, such as reading fields and 
their values, is contained in the `BaseAssetDisplayContributor` class. This 
makes integrating it with your application as simple as creating a class that 
extends `BaseAssetDisplayContributor` and implements it's `getClassName()` and `getClassTypeValue()` methods in your module.

## BaseAssetDisplayContributor

Your custom `*AssetDisplayContributor` should implement 
`BaseAssetDisplayContributor` and must provide the class name and and the 
fields for the that you are contributing fields from. The first method, 
`getClassName`, must return the class name for your asset type. The 
`getClassTypeValues` method returns a `Map` of the field names and values 
for that asset. The class can also contain additional logic as needed to provide
that information.




