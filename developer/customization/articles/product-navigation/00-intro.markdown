# Product Navigation

[TOC levels=1-4]

Liferay's product navigation consists of the main menus you use to customize,
configure, and navigate the system. When you edit a page, switch to a different
Site scope, access a User's credentials, etc., you're using the default
navigation menus. Providing a customization to a default menu can help give your
Liferay instance a unique touch. You can extend and customize the default
product navigation to fit your need.

There are four product navigation sections that you can extend: Product Menu,
Control Menu, Simulation Menu, and User Personal Menu.

![Figure 1: The main product navigation menus include the Product Menu, Control Menu, and Simulation Menu.](../../images/product-navigation-summary.png)

The Product Menu is on the left, and displays the Control Panel and Site 
Administration functionality. The Control Menu is on top, offering navigation 
to the Product Menu, Simulation Menu (the right menu), and the *Add* button. 
User account settings are available through an icon below  the Contol Menu. 
When certain settings are enabled (e.g., Staging, Page Customization, etc.), 
more tools are offered. 

In this section of tutorials, you'll learn about the various ways you can extend
and customize Liferay's product navigation to fit your needs.

## Customizing the Product Menu 

By default, Liferay's Product Menu consists of two main sections: Control
Panel and Site Administration. These sections are called panel
categories. For instance, the Control Panel is a single panel category, and when
clicking on it, you see four child panel categories: *Users*, *Sites*, *Apps*,
and *Configuration*. Clicking a child panel category shows panel apps.

| **Note:** The Product Menu cannot be changed by applying a new theme. To 
| change the layout/style of the Product Menu, you must create and deploy a 
| theme contributor. See the [Theme Contributors](dev-guide-link)
| tutorial for more details.

The Product Menu is intuitive and easy to use---but you can still change it any
way you want. You can reorganize the panel categories and apps, or add
completely new categories and populate them with custom panel apps. Here you'll
learn how to provide new or modified panel categories and panel apps for the
Product Menu.

### Adding Custom Panel Categories and Applications

As you navigate the Product Menu, you can see that Panel Apps like *Web
Content* and *Site Settings* are organized into Panel Categories such as
*Content & Data* and *Configuration*. You can [create custom panel apps](dev-guide-link) for your own applications and [create custom panel categories](dev-guide-link) to organize those appplication.

## Customizing the Control Menu

The Control Menu is the most visible and accessible menu in Liferay. For
example, on your home page, the Control Menu offers options for
accessing the Product Menu, Simulation Menu, and Add Menu. You can think of this
menu as the gateway to configuring options in Liferay.

![Figure 1: The Control Menu has three configurable areas: left, right, and middle. It also displays the title and type of page that you are currently viewing.](../../../images/control-menu-home.png)

If you navigate away from the home page, the Control Menu adapts and provides
helpful functionality for whatever option you're using. For example, if you
navigate to Site Administration &rarr; *Content & Data* &rarr; *Web Content*, 
you see a Control Menu with different functionality tailored for that option.

![Figure 2: When switching your context to web content, the Control Menu adapts to provide helpful options for that area.](../../../images/control-menu-web-content.png)

The default Control Menu contains three categories representing the left,
middle, and right portions of the menu. You can create navigation entries for
each category. The Control Menu is extensible and you can [create your own control menu entries(dev-guide-link).

| You can add the Control Menu to a theme by adding the following
| snippet into your `portal_normal.ftl`:
| 
|    ```<@liferay.control_menu />```
|
| The other product navigation menus (e.g., Product Menu, Simulation Menu) are
| included in this tag, so specifying the above snippet embeds all three menus
| into your theme. Embedding the User Personal Bar is slightly different. Visit
| the [Providing the User Personal Bar](dev-guide-link)
| tutorial for more information.


## Extending the Simulation Menu

When testing how pages and apps appear for users, it's important to simulate
their views in as many ways as possible. The Simulation Menu on the right-side
of the main page allows this, and you can [extend the simulation menu](dev-guide-link) if you need to simulate something that it does not 
provide.

## Providing the User Personal Bar

The User Personal Bar displays options unique to the current user. In the 
default theme, this appears as an avatar button in the top right corner of the 
screen below the Contol Menu that expands the User Settings sub-menu. In a 
custom theme, the User Personal Bar could appear anywhere
in the interface.

![Figure 1: By default, the User Personal Menu contains the signed-in user's avatar.](../../images/user-personal-bar.png)

Although Liferay's default User Personal Bar is bare-bones, you can
add more functionality to fit your needs. Unlike other product navigation menus
(e.g., Product Menu), the User Personal Bar does not require the
extension/creation of panel categories and panel apps. The User Personal Bar is a portlet, and you can replace it with your own custom portlet to [provide a custom User Personal Bar](dev-guide-link).
