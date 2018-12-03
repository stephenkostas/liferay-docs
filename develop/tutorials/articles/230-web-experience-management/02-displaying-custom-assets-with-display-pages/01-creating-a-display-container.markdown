# Creating a Display Contributor

All the logic related to Asset Display Contributors, such as reading fields and 
their values, is contained in the `AssetDisplayContributor` class. This 
makes integrating it with your application as simple as creating a class that 
references the `AssetDislayContributor` service, extends 
`BaseAssetDisplayContributor` and implements it's `getClassName()` and 
`getClassTypeValue()` methods in your module.

## BaseAssetDisplayContributor

Your custom `*AssetDisplayContributor` must implement 
`BaseAssetDisplayContributor` and provide the class name and and the 
fields for the that you are contributing fields from. The first method, 
`getClassName`, must return the class name for your asset type. The 
`getClassTypeValues` method returns a `Map` of the field names and values 
for that asset. Since you will use `AssetDisplayContributorFields` to define the
fields for the Display Page, the `getClassTypeValues` method can be set to 
return null, and no further methods are necessary.

The final class can be very small and simple like this:

    @Component(immediate = true, service = AssetDisplayContributor.class)
    public class YourAppEntryAssetDisplayContributor
      extends BaseAssetDisplayContributor<BlogsEntry> {

      @Override
      public String getClassName() {
         return YourAppField.class.getName();
      }

      @Override
      protected Map<String, Object> getClassTypeValues(
         BlogsEntry assetEntryObject, Locale locale) {

         return null;
      }

    }
    
After you create the `*AssetDisplayContributor` class, you must create a class
for each asset field that you want to use with Display Pages.
