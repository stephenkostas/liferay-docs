# Creating Entry List Screenlet's UI

Recall that in Liferay Screens for iOS, Screenlet UIs are called *Themes*, and 
every Screenlet must have at least one Theme. You'll create Entry List 
Screenlet's Theme with the same steps you used to create Guestbook List 
Screenlet's Theme: 

1.  Create your Theme's folder and add it to your Xcode project. 
2.  Create an XIB file, and use it to construct the UI. 
3.  Create your Theme's View class, and set it as the XIB file's custom class.

## Creating Your Theme's Folder

Like Guestbook List Screenlet's Theme, you'll create Entry List Screenlet's 
Theme in a `Themes/Default` folder. Follow these steps to create this folder 
structure in Entry List Screenlet's folder: 

1.  In the Finder, create the `Themes` folder inside your project's 
    `EntryListScreenlet` folder. Then create the `Default` folder inside the 
    new `Themes` folder. 

2.  Drag and drop the `Themes` folder from the Finder into your Xcode project, 
    under the `EntryListScreenlet` folder. In the dialog that appears, select 
    *Copy items if needed*, *Create groups*, and the *Liferay Guestbook* target. 
    Then click *Finish*. The `Themes/Default` folder structure now appears in 
    your project. 

    ![Figure 1: After adding the `Themes` folder to Entry List Screenlet, the `Themes/Default` folder structure should look like this in the Project navigator.](../../../images/ios-lp-themes-proj-nav-02.png)

Now you're ready to start creating your Theme. First, you'll create its XIB 
file. 

## Creating the XIB File

A Theme requires an XIB file to define the UI's components and layout. Use these 
steps to create your Theme's XIB file: 

1.  In the Project navigator, right-click the `Default` folder and select 
    *New File*. In the dialog that appears, select *iOS* &rarr; *User Interface* 
    &rarr; *Empty*, and click *Next*. Name the file 
    `EntryListView_default.xib`, and ensure that *Default* is selected for 
    the save location and group. The *Liferay Guestbook* target should also be 
    selected. Click *Create*. The file should then open in Interface Builder. 

2.  In Interface Builder, drag and drop a View from the Object Library onto the 
    canvas. Then add a Table View to the View. Set the Table View to take up the 
    entire View. 

3.  With the Table View selected, open the *Add New Constraints* menu at the 
    bottom-right of the canvas. In this menu, set *Spacing to nearest neighbor* 
    to 0 on all sides, select *Constrain to margins*, and then click the *Add 4 
    Constraints* button. 

    ![Figure 2: Add these constraints to the Table View in the XIB.](../../../images/ios-lp-xib-constraints.png)

Your Theme's XIB is now finished. Next, you'll create your View class. 

## Creating the Theme's View Class

Every Theme needs a View class that controls its behavior. Recall that by 
extending 
[the `BaseListTableView` class](https://github.com/liferay/liferay-screens/blob/master/ios/Framework/Core/Base/BaseListScreenlet/TableView/BaseListTableView.swift), 
a list Screenlet's View class gets most of the functionality it needs. You can 
therefore focus on the parts of your View class that are unique to your 
Screenlet. 

Follow these steps to create your Screenlet's View class:

1.  In the Project navigator, right-click Entry List Screenlet's `Default` 
    folder and select *New File*. In the dialog that appears, fill out each 
    screen as follows: 

    - Select *iOS* &rarr; *Source* &rarr; *Cocoa Touch Class*, and click *Next*. 
    - Name the class `EntryListView_default`, set it to extend 
      `BaseListTableView`, select *Swift* for the language, and click *Next*.
    - Make sure the `Default` folder and group is selected, as well as the 
      *Liferay Guestbook* target (these should be selected by default). Click 
      *Create*. 

2.  Replace the class file's contents with this code: 
    <!-- Add explanation that references Guestbook List Screenlet's article -->

        import UIKit
        import LiferayScreens

        class EntryListView_default: BaseListTableView {

            override public func doFillLoadedCell(row: Int, cell: UITableViewCell, object: AnyObject) {
                let entry = object as! EntryModel

                cell.textLabel?.text = entry.message
                cell.detailTextLabel?.text = entry.name
            }

            override open func doCreateCell(_ cellId: String) -> UITableViewCell {
                return UITableViewCell(style: .subtitle, reuseIdentifier: cellId)
            }

            override public func doFillInProgressCell(row: Int, cell: UITableViewCell) {
                cell.textLabel?.text = "Loading..."
            }

        }
