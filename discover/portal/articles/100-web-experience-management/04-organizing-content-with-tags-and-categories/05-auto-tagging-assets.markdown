# Auto-tagging Assets

[Tagging assets](/discover/portal/-/knowledge_base/7-2/tagging-content) 
is a great way to organize content. Typically, tags are applied by the content 
creator during content creation. However, it's also possible to *automatically* 
tag content. For example, you can upload an image and let @product@ scan it and 
automatically apply a tag that fits the image's content. This lets you leverage 
tags without requiring content creators to manually apply them. 

+$$$

**Note:** Auto-tagging currently only works for images in 
[Documents and Media](/discover/portal/-/knowledge_base/7-1/managing-documents-and-media). 

$$$

## Enabling Auto-tagging

Auto-tagging is disabled by default. You can configure it at three levels:

-   **Global:** For auto-tagging to function on any level, you must enable it 
    globally. You can then disable it for individual instances and sites if you 
    wish. 

-   **Instance:** With auto-tagging enabled globally, it's also enabled by 
    default for each instance. You can disable it for specific instances. 

-   **Site:** With auto-tagging enabled globally and for an instance, it's also 
    enabled by default for all that instance's sites. You can disable it for 
    specific sites.

### Global Configuration

Follow these steps to configure auto-tagging globally: 

1.  Go to *Control Panel* &rarr; *Configuration* &rarr; *System Settings*, 
    then select *Assets*. 

2.  Under *SYSTEM SCOPE*, select *Asset Auto Tagging*. 

3.  The following settings are available:

    -   **Enabled:** Whether auto-tagging of assets is enabled.
    -   **Maximum number of tags:** The maximum number of tags that can be 
        automatically applied to each asset. A value of `0` means that there is 
        no such limit.

4.  Click *Save* to save your changes. 

![Figure 1: You can configure auto-tagging globally in the Assets section of System Settings.](../../../images/auto-tagging-global.png)

### Instance-level Configuration

When auto-tagging is enabled globally, it's also enabled by default for all 
instances. You can, however, disable or configure it for each instance. 

Follow these steps to configure auto-tagging on the instance level: 

1.  Go to *Control Panel* &rarr; *Configuration* &rarr; *Instance Settings*, 
    then select the *Asset Auto Tagging* tab. 

2.  The same settings are available as in the global configuration. The settings 
    here, however, apply to the instance. Also note that there may be different 
    auto-tagging providers that you can configure here. For example, the 
    provider for auto-tagging images appears under 
    *TensorFlow Image Auto Tagging*. Such providers are documented elsewhere. 

3.  Click *Save* to save your changes. 

![Figure 2: You can configure auto-tagging on the instance level as well.](../../../images/auto-tagging-instance.png)

### Site-level Configuration

When auto-tagging is enabled for an instance, it's also enabled by default for 
all that instance's sites. You can, however, disable or configure it for each 
site. 

Follow these steps to configure auto-tagging for a site: 

1.  Open the *Menu* 
    (![Product Menu](../../../../images/icon-menu.png)), 
    click your site's name, and navigate to *Configuration* &rarr; 
    *Site Settings*. 

2.  In the *General* tab, expand the *Asset Auto Tagging* section. Use the 
    toggle to enable or disable auto-tagging for the site. 

3.  Click *Save* to save your changes. 

![Figure 3: You can enable or disable auto-tagging for a site.](../../../images/auto-tagging-site.png)
