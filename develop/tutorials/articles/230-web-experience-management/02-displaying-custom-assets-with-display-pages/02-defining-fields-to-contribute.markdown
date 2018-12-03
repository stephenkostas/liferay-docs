# Asset Display Contributor Fields 

Once you have created the Asset Display Contributor, the next step is to create 
the `AssetDisplayContributorField`. To do this, you must implement the 
`AssetDisplayContributorFields` interface, and reference 
`AssetDisplayContributorField.class` in your service declaration. Each field 
will require its own class. You could do this for one of your assets field
or all of them.

## AssetDisplayContributorFields

The `AssetDisplayContributorFields` interface looks like this:

        public interface AssetDisplayContributorField<T> {

          public String getKey();

          public String getLabel(Locale locale);

          public String getType();

          public Object getValue(T model, Locale locale);

          }

The methods work as follows:

* *getkey()* returns the asset field name. 

* *getLabel(Locale locale)* passes in the `locale` paramter and returns the 
    language key for the field's display title.

* *getType()* returns the type for the asset field (i.e. text, image, html).

* *getValue(T model, Locale locale)* passes in the model type and a `locale` 
    as, and returns the field data.

Each field that you want to contribute for use in an Asset Display Page will 
have it's own implementation of `AssetDisplayContributorFields`. For an example 
implementation you can look at the `JournalArticleLastEditorNameAssetDisplayContributorField`:

        @Component(
          property = "model.class.name=com.liferay.journal.model.JournalArticle",
          service = AssetDisplayContributorField.class
        )
        public class JournalArticleLastEditorNameAssetDisplayContributorField
          implements AssetDisplayContributorField<JournalArticle> {

          @Override
          public String getKey() {
             return "lastEditorName";
          }

          @Override
          public String getLabel(Locale locale) {
             ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
                locale, "com.liferay.journal.lang");

             return LanguageUtil.get(resourceBundle, "last-editor-name");
          }

          @Override
          public String getType() {
             return "text";
          }

          @Override
          public String getValue(JournalArticle article, Locale locale) {
             User user = _userLocalService.fetchUser(article.getUserId());

             if (user != null) {
                return user.getFullName();
             }

             return StringPool.BLANK;
          }

          @Reference
          private UserLocalService _userLocalService;

        }

The `JournalArticleLastEditorNameAssetDisplayContributorField` meets all of the 
requirements as described above and also has a reference to `UserLocalService`
which it needs to access the user data for determining who really was the last 
editor of the asset. Your Asset Display Contributor Field could also contain 
additional logic or references needed to provide the necessary information for 
the methods being implemented.


