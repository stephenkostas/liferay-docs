# Creating Entry List Screenlet's Connector

Recall that Connectors are Screenlet components that make server calls. Also 
recall that by making your server calls in Connectors instead of Interactors, 
you gain an additional layer of abstraction and can also support list Screenlet 
pagination. 

In this article, you'll create Entry List Screenlet's Connector. Because this 
Connector is so similar to that of Guestbook List Screenlet, the steps to create 
it aren't explained in detail. Focus is instead placed on the few places in the 
code where the Connectors diverge. For a full explanation of the code, see 
[the article on creating Guestbook List Screenlet's Connector](https://www.liferay.com/). 

## Creating Your Connector's Folder

Follow these steps to create your Connector's folder: 

1.  In the Finder, create the `Connector` folder inside your project's 
    `EntryListScreenlet` folder. 

2.  Drag and drop the `Connector` folder from the Finder into your Xcode 
    project, under the `EntryListScreenlet` folder. In the dialog that appears, 
    select *Copy items if needed*, *Create groups*, and the *Liferay Guestbook* 
    target. Then click *Finish*. The `Connector` folder now appears in your 
    project. 

Now you're ready to create the Connector. 

## Creating the Connector


