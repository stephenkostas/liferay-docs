# Creating Pages [](id=creating-pages)

After you create a site for your Liferay instance, you may need to add new 
pages or edit existing pages. From the Site Administration &rarr;
*Navigation* section of the Menu, you can configure site pages. If you're not
currently on the site you want to edit, click the *Site Selector* button
(![Compass](../../../../images/icon-compass.png)) next to your current site name
in the Menu and select your desired site. The edits you make to your pages are
only made to the scope you've selected in the Menu.

![Figure 1: The Sites Pages page allows you to edit your site pages as a whole.](../../../../images/managing-site-pages.png)

Open the Navigation tab and click on *Site Pages* to manage pages. From here, 
you'll manage your public and private page sets as well as page templates. 
Page sets are always associated with sites. Even users' personal pages are part 
of their personal sites. All pages belong to one of two types of page sets: 
public pages and private pages. By default, public pages are accessible to 
anyone, even non-logged in users (guests). Private pages are accessible only to
users who are members of the site that owns the pages. This means the private
pages of an organization's site are viewable only by site members and members of
the organization. 

The same interface manages pages regardless of whether the pages are public or
private. You'll look at this interface more closely next. 

From *Site Pages*, you can add a page or child page to any existing page or page
set by clicking the `+` button in the top right corner. Because *Public Pages*
is selected on the top, clicking `+` here adds a top level page making it
a sibling page of the Welcome page. You can, however, nest pages as deeply as
you like. To create a sub-page under the Welcome page, click the `+` button next
to *Welcome*.

Adding a child page creates child pages in the hierarchy below the page you've 
selected. You can nest pages as deep as you like and you can manage that 
hierarchy through Navigation Menus [link]. 

Once you've clicked the `+` icon to add a page, you're asked to select the type
of page you are creating:

**Full Page Application:** creates a page that displays a single full page
application.

**Page Set** creates a container that you can create subpages under that is not 
actually a page itself. 

**Link to Page** links to a Page within the same site. This is often used to
make a page available it multiple parts of a sites hierarchy.

**Layout:** creates a page with a layout template that defines the number of
rows and columns for adding applications to your page in a custom layout.

**Panel:** a page containing any number of applications as selected by an
administrator, but only one is displayed at a time. Users select the portlet
they want to use from a menu on the left side of the page, and the selected
portlet takes up the entire page. 

**Embedded:** displays content from another website inside your instance. An
administrator can set a URL from the page management interface and that page
appears in the context and within the navigation of your Liferay instance.

**Link to URL** creates a link to any URL. This could be an external page, or
a link across Sites in the same Liferay instance.

**Content:** creates a Content Page based on a Fragments.

![Figure 1: You must select a page type when adding pages.](../../../../images/page-types-adding.png)

Now that you know the basics of adding site pages, you can start working on the
Lunar Resort site. If you're not currently on the right site, navigate to Site
Administration in the Menu, select the compass icon next to the current site
name, and select the site you wish to edit.

If you ever need to modify the page you've created for your site, select
*Configure* from the Options menu for the page from *Site Pages*. When
configuring a specific page, you're given more options than when you were
creating a new page. These extended options for configuring specific pages are
covered in more detail later. 

There are also configuration options that are only available for either
individual pages or page groups only. You'll learn about options available for
both instances.

Next, you'll look at creating the main page types you'll use in Liferay.
