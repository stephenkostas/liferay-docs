# Using the Fragment Generator

After you setup the generator and create your first project by running
`yo liferay-fragment` you will have the basic structure created, but there's
still more that the generator can help you with.

## Creating Collections

Before you can create any Page Fragments, you need to create a Collection. You 
can learn more about Collection in the [Creating Page Fragments article](link).
Creating a Collection will create the base folder structure and some 
information about your Collection. To do this,

1.  From inside of your project, run `npm run add-collection`.

2.  Follow the prompts to name your Collection.

You can now create Page Fragments inside of this Collection.

## Creating Fragments

A Page Fragment is made up of three primary files, `index.html`, `index.css`, 
and `index.js`. However, the files need to be properly arranged in the folder 
structure and have the appropriate metadata to be imported onto your server. 
The Fragment Generator will create the files in the correct hierarchy with all 
of the necessary information.

1.  From inside of the Collection you created, run `npm run add-fragment`.

2.  Follow the prompts to add the necessary information about your Page 
    Fragment.
    
Now the files are all created and you can edit them using your editor of 
choice.

## Importing and Exporting Fragments

The Fragment Generator can connect to your currently running Liferay to import
and export fragments. You can even have fragments that you create with the 
generator imported into Liferay automatically.

* To get collections and fragments from a running @product@ server, run `npm run export`

* To send the collections and fragments from your current project to a running
    @product@ server, run `npm run import`
    
* To have collections and fragments automatically imported into @product@ as 
    they are created or modified, run `npm run import:watch`
    
* To create a `.zip` file that can be manually imported into @product@ run
    `npm run compress`
    
With these tools at your disposal, you can more efficiently manage creating 
and editing Page Fragments with whatever tools and environments work best for 
you.

