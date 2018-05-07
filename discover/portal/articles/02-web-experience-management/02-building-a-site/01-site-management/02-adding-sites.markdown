# Adding Sites [](id=adding-sites)

Sites can be created through the Control Panel by a Liferay administrator.
Liferay's Control Panel provides an administrative interface for managing your
Liferay instance. There are four main sections of the Liferay Control Panel:
Users, Sites, Apps, and Configuration. In this section, you'll learn how to use
the Control Panel to manage sites. In a later section, you'll learn about using
the Control Panel to manage site templates. Site templates allow Liferay
administrators to create multiple sites with the same default set of pages and
content. For information about the Apps, Users, and Configuration sections of
the Control Panel, see the
[Leveraging the Liferay Marketplace](/discover/portal/-/knowledge_base/7-1/leveraging-the-liferay-marketplace),
[User Management](/discover/portal/-/knowledge_base/7-1/user-management), and
[Using the Control Panel](/discover/portal/-/knowledge_base/7-1/using-the-control-panel)
sections, respectively.

+$$$

**Tip:** If you're signed in as an administrator, you can access all sites by
navigating to the Site Administration menu from the Control Panel. To manage a
single site, navigate to the site by going to the Menu and clicking the *Site
Selector* button (![Compass](../../../images/icon-compass.png)) from the sites
dropdown menu and selecting the appropriate site name you'd like to manage. Once
finished, the site administration options (i.e., Navigation, Content, Members,
etc.) for that site are available.

$$$

Now, you'll add a site for the Lunar Resort.

1.  Navigate to the Control Panel and select *Sites* &rarr; *Sites*.

2.  Click the Add icon (![Add Site](../../../images/icon-add.png)) at the 
    top right of the page.
    
3.  Select a *Blank Site*.

Any available site templates will display here for you to select. Site
templates provide a preconfigured set of pages, applications, and content that
can be used as the basis of a site's public or private page set. To create a
site from scratch, select *Blank Site*. Otherwise, select the name of the site
template you'd like to use. If you opt to create a site from a site template,
you have to choose whether to copy the site template's pages as your new site's
public or private page set. If other site templates are created, they will
appear in the Add menu as they become available. 

1.  Name your site "The Lunar Resort"
    
After you enter the name, you will be prompted to enter additional information 
about the site and configure certain site settings.

**Name:** names the site you wish to create. You also have the option to
translate the name for many different languages. This can be done by selecting
the language flag under the Name field, and inserting the name in the selected
language. Liferay saves the name translation for each language and displays the
translated site name when that specific language is selected for the instance.
If a name translation is not provided, the default instance language's name is
displayed.

**Description:** describes the site's intended function. The description can
also be translated to other languages; see the Name description for more
information on translating the site's description.

**Active:** determines whether a site is active or inactive. Inactive sites are
inaccessible but can be activated whenever a site administrator wishes.

**Membership Type:** can be open, restricted, or private. An open site appears
in the My Sites app and users can join and leave the site whenever they want. A
restricted site is the same except users must request membership. A site
administrator must then explicitly grant or deny users' requests to join. A
private site does not appear in the My Sites app and users must be added to it
manually by a site administrator.

**Allow Manual Membership Management:** determines whether to allow or disallow
users to be manually added or removed from the site. By default, manual site
membership management is enabled. This allows administrators to manually assign
users to the site. It also allows users to join open sites or request membership
from restricted sites using the My Sites app. For organization sites, manual
site membership management is disabled, by default. This causes organization
members to be automatically assigned membership following the organization's
membership policy. Also, because manual membership management is disabled for
organization sites, by default, the *Users* section of *Sites* is unavailable.
To activate the *Users* functionality for your organization site, you'll need to
check *Allow Manual Membership Management* after creating the organization site
by navigating to its *Site Settings* menu.

+$$$

**Note:** It's possible for site memberships to be handled automatically by a
membership policy. The membership policy can check various pieces of information
from each user, such as their first names, last names, birthdays, job titles,
organizations, and user groups. Using this information, the site membership
policy can automatically assign members to the site. If your site will implement
a membership policy, your site administrators can disallow manual membership
management for their site. When the Allow Manual Membership Management option is
disabled, the *Members* section of Site Administration (Site Memberships and
Site Teams) is hidden, even from administrators.

$$$

**Parent Site:** lets you select a parent site for the site that's being
created. Sites can be organized hierarchically. Using hierarchical sites
provides a simplified way to manage site memberships and site content sharing.
For organizations that have attached sites, the organization hierarchy should
match the site hierarchy. When you select a parent site, an additional option
appears: *Limit membership to members of the parent site*. If this option is
enabled, the site's membership policy performs a check so that you can only
assign members to the current site if they're already members of the parent
site.

2.  Set the *Membership Type* as *Restricted*.

3.  Leave the remain defaults and click *Save*.

When creating a blank site or organization site, the site is not immediately
viewable. This is because sites without a
page are impossible to view. Therefore, before you can view your site, you must
first create a page for it. To add a page for your temporarily invisible site,
navigate to the *Navigation* option from Site Administration. Then add a public
page. After adding your site's first page, it renders and your site is viewable.
For more information about adding pages, see the
[Creating and Managing Pages](/discover/portal/-/knowledge_base/7-0/creating-and-managing-pages)
section.

You also have the option to categorize your site template using tags and
categories by selecting the *Categorization* menu from the bottom of the page.
To learn more about using tags and categories in Liferay, see the 
[Organizing Content with Tags and Categories](/discover/portal/-/knowledge_base/7-0/organizing-content-with-tags-and-categories)
section. Lastly, you'll notice at the top of the page an additional tab named
*Social*. This tab lets you manage whether users of your site can mention other
users. You'll learn about mentioning users later in the Social Collaboration
sections.

When creating a site from a site template, the initial form provides a new
option that lets you decide if you want to copy the pages from the template as
public pages or as private pages. By default, the site is linked to the site
template and changes to the site template propagate to any site based on it. A
checkbox appears that lets users unlink the site template if the user has
permission to do so.

Once the site has been created, you'll want to configure its settings to fit
your needs. You can learn more about Site Settings here[link].

Next, you'll learn about creating pages.