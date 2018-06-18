# Mobile Device Rules [](id=mobile-device-rules)

Mobile device families allow you to configure sets of rules to alter the
behavior of the instance based on the device being used to access @product@. 
For instance, you can configure the look and feel of Liferay pages accessed by
smartphone or tablet users differently from those accessed by PC users.

Both sites and individual pages can be configured with any number of mobile
device families. A family is designed to describe a group of devices. It can
contain one or more rules that describe a category of devices, such as all
Android devices or all iOS tablets. You can define as many rules in a family as
you need to classify all the devices for which you'd like to define actions.
Families can be prioritized to determine which one applies to a given page
request.

In order to configure mobile device rules, you need a way to find out the
characteristics of the device. While some of the characteristics are provided by
the device, most are not. For this reason, there are databases that contain
information about thousands of devices. These databases make it possible to
learn every detail about a device from the device type, which is included in
each request sent to Liferay. @product@'s Mobile Device Rules can connect to
device databases so that you can use their device characteristics in your rules. 

+$$$

**Important:** For the features described in this article to work, you must 
install the Liferay Mobile Device Detection (LMDD) app from the Liferay 
Marketplace. This app provides the device detection database that's required for 
your @product@ instance to detect which mobile devices are accessing it. Note 
that if you're running Liferay DXP, you must install 
[the lite version of LMDD](https://web.liferay.com/marketplace/-/mp/application/92831494) 
before you can install 
[the enterprise version](https://web.liferay.com/marketplace/-/mp/application/35419014). 
[Click here](/discover/portal/-/knowledge_base/7-1/using-the-liferay-marketplace) 
for instructions on using Liferay Marketplace to find and install apps. 

$$$