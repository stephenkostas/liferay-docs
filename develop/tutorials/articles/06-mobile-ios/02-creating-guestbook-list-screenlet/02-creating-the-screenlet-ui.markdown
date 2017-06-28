# Creating Guestbook List Screenlet's UI

In Liferay Screens for iOS, Screenlet UIs are called *Themes*. Every Screenlet 
must have at least one Theme. In this article, you'll use the following steps to 
create a Theme for Guestbook List Screenlet: 

1.  Create your Theme's folder and add it to your Xcode project. 
2.  Create an XIB file, and use it to construct the UI. 
3.  Create your Theme's View class, and set it as the XIB file's custom class. 

## Creating Your Theme's Folder

Even if you only plan on creating one Theme, it's best practice to create it in 
its own folder. You should also create this folder inside a parent `Themes` 
folder. This gives you a place to put any additional Themes you create. You'll 
create a single Theme for Guestbook List Screenlet: the Default Theme. You'll 
therefore create the `Themes/Default` folder path inside the 
`GuestbookListScreenlet` folder. 

Follow these steps to create your Theme's folder: 

1.  In the Finder, create the `Themes` folder inside your project's 
    `GuestbookListScreenlet` folder. Then create the `Default` folder inside the 
    new `Themes` folder. 

    ![Figure 1: The new `Themes/Default` folder structure should be inside the Screenlet's folder.](../../../images/ios-lp-theme-folders-finder.png)

2.  Drag and drop the `Themes` folder from the Finder into your Xcode project, 
    under the `GuestbookListScreenlet` folder. In the dialog that appears, 
    select *Copy items if needed*, *Create groups*, and the *Liferay Guestbook* 
    target. Then click *Finish*. The `Themes/Default` folder structure now 
    appears in your project. 

    ![Figure 2: After adding the `Themes` folder, your project should look something like this.](../../../images/ios-lp-themes-proj-nav.png)

Now you're ready to start creating your Theme. First, you'll create its XIB 
file. 

## Creating the XIB File

A Theme requires an XIB file to define the UI's components and layout. Use these 
steps to create your Theme's XIB file: 

1.  In the Project navigator, right-click the `Default` folder and select 
    *New File*. In the dialog that appears, select *iOS* &rarr; *User Interface* 
    &rarr; *Empty*, and click *Next*. Name the file 
    `GuestbookListView_default.xib`, and ensure that *Default* is selected for 
    the save location and group. The *Liferay Guestbook* target should also be 
    selected. Click *Create*. The file should open in Interface Builder. 

