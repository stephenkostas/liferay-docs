# Asset Display Contributor Example

Now, to put your knowledge to the use, create an Asset Display Contributor for 
the Blogs application. Remember the two main steps:

1.  Create the Asset Display Contributor class for the asset type.

2.  Create the Asset Display Contributor Field classes for the fields you want 
    to be available for Asset Display Pages.
    

## Creating the Blogs Contributor

First we would have to create our contributor:

    @Component(immediate = true, service = AssetDisplayContributor.class)
    public class BlogsEntryAssetDisplayContributor
      extends BaseAssetDisplayContributor<BlogsEntry> {

      @Override
      public String getClassName() {
         return BlogsEntry.class.getName();
      }

      @Override
      protected Map<String, Object> getClassTypeValues(
         BlogsEntry assetEntryObject, Locale locale) {

         return null;
      }
    }

With this, we have already access to all of the generic Asset Display Contributor Fields for Asset Entries that are registered in the system. You can check the result by going to Control Panel > Build > Pages > Display Pages and selecting the asset type to map.

![Figure 1: You can now select the Blogs Asset Type.](../../../images/select-asset-type.png)

## Creating the Blogs Entry Title Field Contributor

Still, we are missing the fields for blogs entry to display since we haven't defined them. Now, we want to be able to select the subtitle of the blog so it can be displayed. For that we create a display contributor field for it.


    @Component(
      property = "model.class.name=com.liferay.blogs.model.BlogsEntry",
      service = AssetDisplayContributorField.class
    )
    public class BlogsEntryTitleAssetDisplayContributorField
      implements AssetDisplayContributorField<BlogsEntry> {

      @Override
      public String getKey() {
         return "subtitle";
      }

      @Override
      public String getLabel(Locale locale) {
         return LanguageUtil.get(locale, "subtitle");
      }

      @Override
      public String getType() {
         return "text";
      }

      @Override
      public String getValue(BlogsEntry blogsEntry, Locale locale) {
         return blogsEntry.getSubtitle();
      }
    }

Now we can select it when mapping a field

![Figure 1: You can now select the Blogs Entry Title field in the mapping selecting.](../../../images/mapping-fields.png)

