# Creating the Guestbooks Scene

In the previous article, you used Login Screenlet to implement authentication in 
the login scene. Now you must create the scene you want the user to see 
following login: the guestbooks scene. Later in this Learning Path, you'll 
display guestbooks in this scene via Guestbook List Screenlet. For now, though, 
all you need to do is create the scene and take the user to it after login. This 
article shows you how to do this with the following steps: 

1.  Add a view controller to your storyboard. You'll then embed the view 
    controller in a navigation controller. The navigation controller gives the 
    scene a navigation bar and automatically implements back-navigation in the 
    entries scene you'll create later. 

2.  Create the guestbook scene's view controller class. This class controls the 
    view controller's behavior. 

3.  Create a segue from the login scene to the guestbooks scene. After login, 
    this segue takes the user to the guestbooks scene. 

First, you'll add a view controller to the storyboard. 

## Adding a View Controller to the Storyboard

Follow these steps to add a view controller to the storyboard:

1.  Open your storyboard and drag and drop a *View Controller* from the Object 
    Library to the right of the login scene. 

    ![Figure 1: The arrow shows where to drag and drop the View Controller to create the new guestbooks scene.](../../images/ios-lp-add-gb-vc.png)

2.  Now you must embed this view controller in a 
    [navigation controller](https://developer.apple.com/library/content/documentation/WindowsViews/Conceptual/ViewControllerCatalog/Chapters/NavigationControllers.html). 
    Navigation controllers in iOS implement a *navigation stack*. You can 
    loosely think of a navigation stack as a deck of cards, where each card is a 
    view controller with a navigation bar. The navigation bar contains a back 
    button that lets you navigate to the previous view controller in the stack. 
    You can also change the navigation bar's title to reflect the scene's 
    content. 

    With the new view controller selected in the storyboard, select *Editor* 
    &rarr; *Embed In* &rarr; *Navigation Controller*. Your storyboard now shows 
    the navigation controller with a segue to the guestbooks scene. Also, the 
    guestbooks scene now contains an empty navigation bar. 

3.  Double-click the guestbooks scene's navigation bar and type in *Guestbooks*. 
    Your storyboard should now look like this: 

    ![Figure 2: The new guestbooks scene is now embedded in a navigation controller. Also note that the navigation bar's title reflects what the scene will be used for.](../../images/ios-lp-nav-controller.png)

4.  With the guestbooks scene's view controller selected in the storyboard, open 
    the Attributes inspector and uncheck *Adjust Scroll View Insets*. This 
    ensures that the scene's contents are flush with the navigation bar.

    ![Figure 3: Make sure the view controller's *Adjust Scroll View Insets* option is unchecked in the Attributes inspector.](../../images/ios-lp-adj-scroll-view-ins.png)

Great! You now have the guestbooks scene, embedded in a navigation controller. 
For this scene's view controller to work, it must have a class that controls its 
behavior. You'll create this class next. 

## Creating the Guestbooks Scene's View Controller Class

Each view controller must have a class that controls its behavior. In this 
section, you'll create this class for the guestboooks scene's view controller. 
In the storyboard, you'll then set this class as the view controller's custom 
class. 

1.  Right-click the *Liferay Guestbook* folder in Xcode's project navigator and 
    select *New File*. In the *iOS* &rarr; *Source* section of the dialog that 
    appears, select *Cocoa Touch Class* and click *Next*. 

2.  The next screen in the dialog lets you set the class's name, subclass, and 
    language. You can also choose whether to create an XIB file for the class. 
    Enter the following information and click *Next*: 

    - **Class:** `GuestbooksViewController`
    - **Subclass of:** `UIViewController`
    - **Also create XIB file:** Unchecked
    - **Language:** Swift

    ![Figure 4: Set these options when creating the view controller's class.](../../images/ios-lp-gb-vc-class.png)

3.  The final screen in the dialog lets you set the class's location, group, and 
    targets. Make sure *Liferay Guestbook* is selected for both the *Group* and 
    *Targets* menus, and click *Create*. 

4.  In the storyboard, select the guestbooks scene's view controller. In the 
    Identity inspector, set `GuestbooksViewController` as the Custom Class. 

    ![Figure 5: Set `GuestbooksViewController` as the custom class of the guestbooks scene's view controller.](../../images/ios-lp-gb-vc-cc.png)
