# Converting Eclipse Projects into Liferay IDE Projects [](id=converting-eclipse-projects-into-liferay-ide-projec)

Liferay IDE lets you import non-Liferay projects in your Eclipse workspace
(i.e., you can see them in Eclipse's Project Explorer) and convert them to
Liferay projects.

This tutorial shows the steps required to accomplish this. 

## Converting Your Eclipse Project [](id=converting-your-eclipse-project)

1.  Move the project into a Liferay Plugins SDK, if it is not already in one. 
    To import the project, select *File* &rarr; *Import...* and then follow the 
    import instructions that appear.

2.  In Eclipse's Project Explorer, right-click on the project and select
    *Liferay* &rarr; *Convert to Liferay plugin project*. 

    +$$$

    **Note:** If no convert action is
    available, either the project is already a Liferay IDE project or it is not
    faceted (i.e., Java and Dynamic Web project facets are not yet configured
    for it). For instructions on resolving these issues, see the
    [Faceting a Plugin Project for Liferay IDE](/develop/tutorials/-/knowledge_base/6-2/faceting-a-plugin-project-for-liferay-ide)
    tutorial and the 
    [Verifying Successful Project Import](/develop/tutorials/-/knowledge_base/6-2/verifying-successful-project-import)
    tutorial. 

    $$$

3.  In the *Convert Project* wizard, your project is selected and the SDK
    location and SDK version of your project are displayed.

    ![Figure 1: The *Convert Project* wizard detects your Plugin's SDK's the location and version.](../../images/ide-convert-plugin-project.png)

4.  Select a Liferay Runtime to use for the project. If you don't have a
    Liferay Runtime defined, define one now by clicking *New...*. 

5.  Click *Finish*. 

Great! Now that you've imported and converted your project, you can work with it 
just as you would any other Liferay project.

## Related Topics [](id=related-topics)

[Faceting a Plugin Project for Liferay IDE](/develop/tutorials/-/knowledge_base/6-2/faceting-a-plugin-project-for-liferay-ide)

[Deploying Plugins](/develop/tutorials/-/knowledge_base/6-2/deploying-plugins)

