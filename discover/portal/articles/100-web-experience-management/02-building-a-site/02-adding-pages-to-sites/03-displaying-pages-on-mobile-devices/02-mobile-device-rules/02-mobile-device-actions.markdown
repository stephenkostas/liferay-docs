# Mobile Device Actions

After you've created Families and applied rules to define those families, you 
can associate specific actions that will occur when a user visits that site on 
a device.

To add actions to a selected rule group:

1.  Go to the *Configuration* page for the page, page set, or Site where you 
    have configured a device family.

2.  In the *Mobile Device Rules* section, click *Actions* (![Actions](../../../../../../images/icon-actions.png)) &rarr; *Manage 
    Actions* next to the device family that you wish to add an action for.
    
3.  Click *Add Action*.

![Figure X: Getting to the Manage Actions page.](../../../../../../images/manage-mobile-actions.png)


By default, there are four kinds of actions that can be configured for mobile families:

* **Layout Template Modification** lets you change the way portlets are 
    arranged on pages delivered to mobile devices. For example, you could have
    pages with more complex layouts automatically switch to a simpler template
    if it detects a mobile device---even if the resolution is theoretically high
    enough to support the standard layout.

* **Theme Modification** lets you select a specific theme for different mobile 
    device families. In some cases you would have a mobile version of your 
    site's theme that is automatically applied when a device hits your page.

* **URL Redirect** sends mobile users to any URL. This can be used 
    to direct mobile users to a mobile app download or a mobile version of the 
    page.

* **Site Redirect** sends mobile users to a different Site on your portal. In 
    some cases, mobile content could be created on a mirror of site.

!$$$

**Tip:** @product-ver@ was designed from the ground up to be responsive and 
adapt to any device that might be accessing it. Before creating new themes or 
forcing a layout template change, you should test how the site behaves using 
@product@ out of the box. Certain features, like URL Redirects, can be 
disruptive and frustrating for users if used improperly.

$$$

Like mobile device rules, mobile device actions are designed to be extensible. 
Your developers can define custom actions in addition to the four actions 
provided by default.

To review, if you'd like to configure an action or actions that take place when
mobile device requests are received, take the following steps:

1.  Create a mobile device family to represent the group of devices for which to
    define an action or actions.

2.  Define one or more rules for your family that describe the group of
    devices represented by your family.

3.  Apply your family to an entire page set of a site (all the public pages of a
    site or all the private pages) or to a single page.

4.  Define one or more actions for your family that describe how requests should
    be handled.

To see how this might work in practice, you'll study a few examples of how you
can use mobile device rules. First, suppose you have a separate version of a
site on your Liferay instance that's specifically designed for mobile phones
running Android or Bada. For this example, you'll make a site called
*Android/Bada Liferay* and you'll configure the default Liferay site to redirect
incoming requests from Android or Bada mobile phones to the Android/Bada Liferay
site. Yur first step is to create the Android/Bada Liferay site: go to the Sites
option of the Control Panel and click *Add*
(![Add](../../../../../../images/icon-add.png)) &rarr; *Blank Site*. Enter the name
*Android/Bada Liferay* and click *Save*. Then add a page called *Welcome* to
that site. Now your Android/Bada Liferay site has a public Welcome page just
like the default Liferay site.

Next, select the default *Liferay* site in the site selector of the Menu,
navigate to Site Administration &rarr; *Configuration*, and click on *Mobile
Device Families*. Click on *Add Device Family*
(![Add Device Family](../../../../../../images/icon-add.png)), enter the name *Android
and Bada Mobile Phones*, and click *Save*.

Click the device family link to configure the rule group to apply only to mobile
phones running Android or Bada. Enter *Rule 1* for the name. Under Operating
System, select *Android* and *Bada OS* (hold down Control to make multiple
selections), select *Other Devices* under Tablet since you want your family to
apply only to mobile phones, and click *Save*. Now you just need to define the
redirect action for your family. Navigate to *Navigation*, select *Options* next
to Public Pages and click on *Advanced* &rarr; *Mobile Device Rules* in the
bottom navigation menu.

![Figure 3.31: To apply a mobile device family to a page set of a site, click on *Mobile Device Rules*, click *Select*, and select the desired rule group.](../../../../../images/site-pages-mobile-device-rules.png)

Click *Select* and then click the *Android and Bada Mobile Phones* device family
that you configured. Once you've selected your device family, click on your
device family's *Actions* &rarr; *Manage Actions*. Then click *Add Action*,
enter the name *Android/Bada Liferay Redirect*, and select *Redirect to Site*
under Type. Under the Site dropdown menu that appears, select *Android/Bada
Liferay* and under the Page dropdown menu that appears, select the *Welcome*
page that you created earlier. Lastly, click *Save*. That's it! Now Android and
Bada mobile phone users are redirected to the Android/Bada Liferay site from the
Liferay site.

Now you'll look at one more example of using mobile device rules before you move
on. Suppose you'd like to create another rule so that when a site is accessed by
an Android or iOS tablet, a different layout is used. To set this up, you need
to follow the same four steps described above. First, make sure you're on the
Liferay site by checking in the site selector of the Menu. Then navigate to the
Mobile Device Families page of Site Administration. Add a new device family
called *Android and iOS Tablets*. Add a classification rule called *Rule 1*,
select *Android and iPhone OS* under the *Operating System* heading, select
*Tablets* under the *Device Type* heading, then click *Save*. As with the
previous example, you only need one rule to describe your device family.

Next, click on *Navigation* in Site Administration, select *Mobile Device
Rules*, and select the *Android and iOS Tablets* device family. Notice that
you've now selected two rule groups for the Liferay site's public pages and
they've been assigned priorities. If a device making a request belongs to both
of the device families represented by the rule groups, the priority of the rule
groups determines which rule group's actions are executed. Note that in this
example, the first rule group contains only mobile phones and the second rule
group contains only tablets, so no devices can belong to both rule groups. Now
you just need to define an action for your Android and iOS Tablets rule group to
use a different layout: On the *Edit* page of your page group, click on
*Mobile Device Rules*, and then on *Actions* &rarr; *Manage Actions* next to
Android and iOS Tablets. Click on *Add Action*, enter the name *Layout Template
Modification*, and select the *Layout Template Modification* action type.
Lastly, select the *1 Column* layout template (or whichever one you like) and
click *Save*. Good job! Now the Liferay site's pages are presented to Android
and iOS tablet users with the 1 Column layout template.

