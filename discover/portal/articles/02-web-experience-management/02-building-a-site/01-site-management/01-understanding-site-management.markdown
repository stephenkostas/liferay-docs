# Understanding Site Management [](id=understanding-site-management)

Whether you're building a large corporate website or a small site designed to
facilitate collaboration among team members, supporting different kinds of
collaboration and social scenarios is a must. Liferay's sites provide three
membership types:

**Open:** Users can become members of the site at any time.

**Restricted:** Users can request site membership but site administrators must
approve requests in order for users to become members.

**Private:** Users are not allowed to join the site or request site membership.
Site administrators can still manually select users and assign them as site
members.

In addition to these memberships, when a site is associated with an
organization, all the users of that organization are automatically considered
members of the site.

You can view all the available open and restricted sites by adding the My Sites
application to a page and accessing the *Available Sites* tab. You can request
access to any of the sites you're not already a member of by
selecting the site's *Options* button
(![Options](../../../images/icon-actions.png)) and clicking *Join*.

## Site Scope

Members of a site can be given additional privileges within the site by using
@product@'s permission settings. It is also possible to assign different roles
within the site to different members. This can be done through *site roles*,
which are defined equally for all sites or *teams* which are unique for each
site. These concepts will be discussed later in the chapter.

@product@ separates site-scoped information from the Control Panel by placing it
in the Sites menu. From this menu, you can select the specific site to work on.
The Site Administration panel is available for your site, which includes Pages,
Content, Members, Configuration, and Publishing.

![Figure 1: Your site's content resides in the Site Administration menu.](../../../images/web-content-site-content.png)

For details about @product@'s social collaboration suite, see the
[Social Collaboration](/discover/portal/-/knowledge_base/7-1/collaboration-suite)
section.

## Site Hierarchies

Sites can also be organized hierarchically, just like organizations. The
difference between sites and organizations, of course, is that sites are used to
organize pages, content, application data, and users (via site memberships)
whereas organizations are only used to group users. Content sharing is available
for sites within the same hierarchy. For instance, if a parent site has a
document called *Lunar Goals and Objectives* and would like for all its subsites
to have a copy, the parent site's administrator can enable content sharing to
automatically share the document with its subsites, instead of having to send
each site the document individually. Also, content sharing privileges can be set
to let every site administrator share content across sites they manage. Some
examples of content you can share across site include web content structures and
templates, categories, application display templates, etc.

Please refer to the [Sites Admin Portlet](https://docs.liferay.com/portal/7.1/propertiesdoc/portal.properties.html#Sites%20Admin%20Portlet)
section of Liferay's `portal.properties` file for a list of relevant
configurable properties. For example, the
`sites.content.sharing.with.children.enabled` property allows you to disable
content sharing between sites and subsites, disable it by default while allowing
site administrators to enable it per site, or to enable it by default while
allowing administrators to disable it per site.

The Sites Directory application is a configurable app that can allow users to
view a hierarchy of sites and subsites. It enables users to navigate to any of
the displayed sites. To use this app to display site hierarchies, add it to
a page, open its Configuration window, and under Display Style, select *List
Hierarchy*. The My Sites Directory application is very similar to the Sites
Directory application, except that it lists only the sites a user belongs to.

Each subsite in the hierarchy has its own administrator, and the Site
Administrator role permissions do not flow down to child sites in the hierarchy.
If a Site Administrator creates a subsite, he or she has the same permissions in
that subsite. This is not, however, because of inheritance. It is only because
creating a site makes you the Owner of that site. A Site Administrator or a
parent site has no default role in any subsites created by other Site
Administrators. 

If you wanted a user to have administrative access to all sites in a
site/subsite hierarchy, you must create a role based on the Site Administrator
role that has the permission *Manage Subsites*. 

The Site Map application is another configurable app that's intended to help
users navigate among pages within a site. When configuring this app, a site
administrator can select a root page and a display depth. Just as sites can be
organized hierarchically, so can the pages within a site. The display depth of
the Site Map application determines how many levels of nested pages to display.

![Figure 2: The Sites Directory application lets users navigate between sites organized hierarchically. The Site Map application lets users navigate among pages of a site organized hierarchically.](../../../images/site-directory-site-map.png)

## Site Members

Another useful administrative application is the Site Members application. This
enables administrators to survey all the users, organizations, and user groups
that reside in the site. Similarly, Liferay provides the Portal Directory
application, which functions the same as the Site Members app, but globally
scoped for all sites in the instance.

<!-- TODO: Portal Directoy app still has "portal" name, although most other
entities in Liferay have changes to "instance". Check back with this name before
release of @product-ver@. -Cody -->

## Page Sets

@product@'s sites have two categories of pages called page sets. There are two
kinds of page sets: public pages and private pages. A site can have only public
pages, only private pages, or both. Private pages can only be accessed by site
members. Public pages can be accessed by anyone, including users who haven't
logged in. It's possible to restrict access to pages at the page set level or at
the level of individual pages through the permissions system. Public pages and
private pages have different URLs and can have different content, applications,
themes, and layouts.

Building a corporate intranet is a typical use case for Liferay sites. A
corporate intranet could have sites for all the organizations in the company:
Sales, Marketing, Information Technology, Human Resources and so on. But what
about the corporate health and fitness center? That's something everybody in the
company, regardless of organization, may want to join. This makes it a good
candidate for an open and independent site. Similarly, the home page for a
corporate intranet should probably be placed in an open independent site so any
member of the instance can access it.

For other kinds of web sites, you may want to use independent sites to bring
users together who share a common interest. If you were building a photo sharing
website, you might have independent sites based on the types of photos people
want to share. For example, those who enjoy taking pictures of landscapes could
join a Landscapes site and those who enjoy taking pictures of sunsets could join
a Sunsets site.

@product@ always provides one default site, which is also known as the main site
of the instance. This site does not have its own name but rather takes the name
of the instance. By default the instance name is *Liferay* but this value can be
changed through the simple configuration of the setup wizard. The instance name
can also be changed at any time through the Control Panel within *Configuration
&rarr; *Instance Settings*.
