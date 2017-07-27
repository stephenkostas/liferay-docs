# Using Entry List Screenlet

You'll use Entry List Screenlet the same way you use any Screenlet: insert the 
Screenlet in a storyboard scene, then conform the view controller's class to the 
Screenlet's delegate protocol. You'll follow these steps now to use Entry List 
Screenlet in the entries scene. 

## Adding Entry List Screenlet to the Entries Scene

Follow these steps to add Entry List Screenlet to the entries scene: 

1.  In your storyboard, first select the entries scene's view controller. Then 
    drag and drop a plain view (`UIView`) from the Object Library onto the view 
    controller. In the outline view, this new view should be nested under the 
    view controller's existing view. 

    ![Figure 1: The new view is nested under the view controller's existing view.](../../../images/ios-lp-entries-view-outline.png)

2.  Resize the new view to take up all the space below the navigation bar. Then 
    open the *Add New Constraints* menu at the bottom-right of the canvas. In 
    this menu, set *Spacing to nearest neighbor* to 0 on all sides, and click 
    the *Add 4 Constraints* button. 

    ![Figure 2: Set the new view's constraints to 0 on all sides.](../../../images/ios-lp-gb-constraints.png)

3.  With the new view selected, open the Identity inspector and set the view's 
    Custom Class to `EntryListScreenlet`. The view now appears as Entry List 
    Screenlet in the outline view. 

Great! The entries scene now contains Entry List Screenlet. Next, you'll conform 
the scene's view controller class to the Screenlet's delegate. 

## Conforming to the Screenlet's Delegate Protocol

To respond to Entry List Screenlet's events, `EntriesViewController` must 
conform to the `EntryListScreenletDelegate` protocol. You created this delegate 
when creating the Screenlet. This delegate defines methods for responding to the 
success or failure to retrieve entries, and the selection of an entry in the 
list. 
