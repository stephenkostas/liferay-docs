# Creating Structured Web Content [](id=creating-structured-web-content)

Structures are the foundation for web content. They determine which fields are
available to users as they create new items for display. Structures not only
improve manageability for the administrator, they also make it much easier for
users to quickly add content.

For example, say you're managing an online news magazine. All your articles need
to contain the same types of information: a title, a subtitle, an author and one
or more pages of text and images that comprise the body of the article. If
@product@ only supported simple content as has been described above, you'd have no
way to make sure your users entered a title, subtitle, and author. You might
also get articles that don't match the look and feel of your site. If titles are
supposed to be navy blue but they come in from your writers manually set to
light blue, you need to spend time reformatting them before they are published.

Structures give you the ability to provide a format for your content so your
users know what needs to be entered to have a complete article. Using
structures, you can provide a form for your users which spells out exactly what
is required and can be formatted automatically using a template.

You create a structure by adding form controls such as text fields, text boxes,
text areas (HTML), check boxes, select boxes and multi-selection lists. Also,
you can add specialized, Liferay-specific application fields such as an Image
Uploader and Documents and Media right onto the structure. Furthermore, you can
move the elements around by dragging them where you want them. This makes it
easy for you to prototype different orders for your input fields. Additionally,
elements can be grouped together into blocks which can then be repeatable.
Template writers can then write a template which loops through these blocks and
presents your content in innovative ways, such as in sliding navigation bars,
content which scrolls with the user, and more.

Next you'll take a look at how you can create and edit structures through the
Manage Structures interface.

## Editing Structures [](id=editing-structures)

Go to your site's Site Administration menu and select *Web Content* from the
Content section. The first way to access the Manage Structures interface is by
navigating to the *Options* icon (![Options](../../../images/icon-options.png))
in the top right of the page and selecting *Structures*. This opens a popup
showing all the web content structures that exist in your currently selected
scope. Here, you can add new web content structures, edit existing ones, manage
the templates associated with a structure, edit the permissions of a structure,
and copy or delete structures.

Copying web content structures can be useful if you'd like to create a new web
content structure that's similar to an existing one, but you don't want to start
from scratch. @product@ generates a unique portal ID for the copied structure, but
every other attribute of the copied structure, including the name, is the same
as that of the original. Once you've copied a web content structure, you should
enter a new name for it to avoid confusing it with the original. When you copy a
web content structure, you'll be prompted to choose whether to copy any detail
templates or list templates associated with the structure. For information on
detail templates and list templates, please refer to the
[Using Web Forms and Dynamic Data Lists](/discover/portal/-/knowledge_base/6-2/using-web-forms-and-dynamic-data-lists)
section.

<!-- TODO: Update link above for 7.0. -Cody -->

![Figure 1: You can access the Manage Structures interface by clicking the Options icon &rarr; *Structures* from the Web Content page.](../../../images/manage-structures.png)

The second way to access the Manage Structures interface is directly from the
web content article menu. Click *Add* &rarr; *Basic Web Content* from the Web
Content page to add another piece of content to your Liferay instance. Instead
of going right for the content, this time you'll first create a structure. To
access the Manage Structures interface, simply click on *Structure and Template*
in the bottom dropdown menu and click *Select* for the *Structure* heading.
You'll notice there is a *Basic Web Content* structure and template available by
default. This structure and template are used automatically if a custom
structure and template are not added. You have the option of editing the default
structure and template, if desired. To create a new structure in your chosen
scope, simply click on the *Add* button
(![Add Structure](../../../images/icon-add.png)) in the Manage Structures popup.

It's very easy to create and edit structures: all you have to do is drag
elements into the structure and then give them names. For instance, select the
*Text* element and drag it onto the structure. You can do the same with any of
the elements. To remove it from the structure, simply select the *Delete* icon
(![Delete](../../../images/icon-trash.png)) in the upper right corner of the
element. You also have the ability to duplicate the element, which can be done
by selecting the *Duplicate* button (![Add](../../../images/icon-add-2.png)).
You'll learn about the *Configuration*
(![Configuration](../../../images/icon-wrench.png)) button later.

Web content structures also have the capability of inheriting characteristics
from other structures. When a parent structure is configured, the child
structure inherits the parent's fields and settings. Using this feature is
helpful when you want to make a similar structure to one that already exists.
For example, if you'd like to create an in-depth Lunar Resort sports article in
addition to a regular Lunar Resort sports article, you can simply inherit the
characteristics of the regular article and only add additional fields to the
more in-depth article. When the in-depth article is configured, it will display
its parent's fields in addition to its own fields.

+$$$

**Note:** In some instances, there can be more than one structure with the same
`structureKey`. For example, this can happen when exporting a global structure
and then importing it back into a site. This scenario would have global and site
scoped structures with identical `structureKey`s. If this happens, you can no
longer use the global structure. This is because @product@ is configured to follow
a specific hierarchy when choosing structures with the same `structureKey`:
*current site > parent site > global scope*.

$$$

The WebDAV URL feature is available for web content structures and templates so
users could upload and organize resources from both a web interface and the file
explorer of their desktop operating system. With the WebDAV URL, site
administrators are capable of adding, browsing, editing, and deleting structures
and templates on a remote server. After you complete your structure, you can
access the WebDAV URL by re-opening the structure or template and clicking the
*Details* section. If you'd like the see WebDAV in action, visit the
[WebDAV Access](/discover/portal/-/knowledge_base/7-0/publishing-files#desktop-access-to-documents-and-media)
section.

+$$$

**Note:** Some operating systems require a WebDAV server to be class level 2
(i.e., to support file locking) before allowing files to be read or written. The
Documents and Media library uses a class level 2 WebDAV server but Web Content
structures and templates do not. This means that @product@'s Document and Media
library supports WebDAV file locking but Web Content structures and templates do
not. However, on operating systems which require WebDAV servers to be class
level 2, it's possible to avoid the restriction by using third-party WebDAV
clients (e.g., [Cyberduck](http://cyberduck.ch)).

$$$

Another method to edit your structure is switching to *Source* mode and manually
customizing your structure by editing its XML file. You'll notice by default the
*View* mode is selected. Click the *Source* tab to switch to Source mode. This
method is for the more experienced developers.

Take a moment to add, delete, and rearrange different elements.

![Figure 2: The structure editor gives you many options to customize your Web Content.](../../../images/web-content-structure-editor.png)

@product@ supports the following fields in structures:

**Boolean:** Adds a checkbox onto your structure, which stores either `true`
(checked) or `false` (unchecked). Template developers can use this as a display
rule.

**Date:** Adds a preformatted text field that displays a convenient date picker
to assist in selecting the desired data. The format for the date is governed by
the current locale.

**Decimal:** Similar to *Number*, except that it required a decimal point (.) be
present.

**Documents and Media:** Adds an existing uploaded document to attach to the
structure. Also has the ability to upload documents into the Document Library.

**Geolocation:** Adds a map that displays a configured location. The geolocation
system can work in two ways: letting the system know your current location
(especially useful on mobile devices) and giving the user directions to a
concrete place.

**HTML:** An area that uses a WYSIWYG editor to enhance the content.

**Image:** Adds the browse image application into your structure. You have the
option of selecting an image from the Documents and Media library or to upload
an image from your computer's storage. If uploading an image from your personal
computer to the web content article, it is only available for that article.

**Integer:** Similar to *Number*, except that it constrains user input to
non-fractional numbers.

**Link to Page:** Inserts a link to another page in the same site.

**Number:** Presents a text box that only accepts numbers as inputs, but puts no
constraints on the kind of number entered.

**Radio:** Presents the user with a list of options to choose from using radio
button inputs.

**Select:** Presents a selection of options for the user to choose from using a
combo box. Can be configured to allow multiple selections, unlike *Radio*.

**Separator:** Adds a line separator between fields, useful for organization
purposes.

**Text:** Used for items such as titles and headings.

**Text Box:** Used for the body of your content or long descriptions.

These fields provide all you need to model any information type you would
want to use as web content. Liferay customers have used structures to model
everything from articles, to video metadata, to databases of wildlife. You're
limited only by your imagination. To fuel that imagination, you'll look more
closely at field settings.

## Editing Field Settings [](id=editing-field-settings)

When creating a new structure, it is essential that you set variable names.
Template writers can use these variables to refer to elements on your form. If
you don't set variable names, @product@ generates random variable names and these
can be difficult for a template writer to follow. For example, consider a field
called *Author*. You might create this field in your form but the underlying
variable name in the structure might look something like `TextField4882`. The
template writer needs to create markup for your structure and place the Author
field in a certain spot in the markup. How will he or she know which field is
Author when they're all named randomly?

To solve this problem, all you need to do is set a variable name for each field
as you add it to your structure. Go ahead and do this now. In your structure,
add an element *HTML*. To change its field label and variable name, you'll need
to access the field's settings. Hover over the field and select the
*Configuration* icon (![Configuration](../../../images/icon-wrench.png)) that
appears in the upper right corner. Change the *Field Label* value to
*Instructions* and the *Name* value (variable name) to `Steps`. Now your
template writer has a variable by which he or she can refer to this field.

Here's a list of all the configurable settings available for a structure's
fields:

**Type:** Lists the type of field placed in the definition. This is not editable
but is available to reference from a template.

**Field Label:** Sets the text that can be displayed with the field. This is the
human-readable text that the user sees.

**Show Label:** Select *Yes* to display the Field Label.

**Required:** Select *Yes* to mark the field required. If a field is required,
users must enter a value for it in order to submit content using this structure.

**Name:** The name of the field internally, automatically generated. Since this
is the variable name that you can read the data from in a template, you should
give a more memorable name here.

**Predefined Value:** Specifying predefined values for structure forms is a way
to specify defaults. When a user creates a new web content article based on a
structure that has predefined values for various fields, the predefined values
appear in the form as defaults for those fields.

**Tip:** Each field can have a small help icon, with a tooltip attached that
displays helpful information. If you would like to provide text for the tooltip
you may enter it here.

**Indexable:** Select *Yes* to enable @product@ to index your field for search.

**Localizable:** Select *Yes* to enable @product@ to localize your field.

**Repeatable:** Select *Yes* to make your field repeatable. Your users can then
add as many copies of this field as they like. For example, if you're creating a
structure for articles, you might want a repeatable Author field in case you
have multiple authors for a particular article.

**Multiple:** Select *Yes* to enable a multi-selection list (only available for
Select).

**Options:** Changes the options available for selection. You're able to add and
remove options as well as edit each individual option's display name and value
(only available for Radio and Select).

**Style:** Changes the line separtor's style (only available for Separator).

For the Lunar Resort structure, type something in the *Tip* field that helps
users know what to put into the Body element (example: *This is an HTML text
area for the body of your content*). Now, when users hover over the Help icon
near your title, your tip is displayed.

### Structure Default Values [](id=structure-default-values)

Structure Default Values let you create one structure that uses common data from
multiple articles.

Returning to the newspaper scenario again, assume you want all sports articles
to have the same display page (sports page), the same categories, or the same
set of tags. Instead of adding them for each article or wondering if your users
are adding them to every web content article, you can add these characteristics
once for every sports article by creating default values for the structure.
Creating default values is not part of creating a new structure, so make sure
you have an existing structure.

To edit a structure's default values, go to *Web Content* in the Content section
of Site Administration and click the *Options* icon
(![Options](../../../images/icon-options.png)) &rarr; *Structures* to see the
structures list. Find the *Actions* button
(![Actions](../../../images/icon-actions.png)) for the desired structure and
select *Edit Default Values* from the menu to view a window like the one below.
This form allows you to manage the structure settings.

![Figure 3: You can edit default values via the *Actions* button of the Manage Structures interface.](../../../images/structure-actions.png)

Every new web content you create with this structure is preloaded with the
data you inserted. Next, you'll learn about assigning permissions.

## Assigning Permissions [](id=assigning-permissions)

Setting permissions on structures is done using the same procedure as
permissions everywhere else in Liferay. Most users should not have the ability
to edit structures. Structures are coupled with templates, which require some
web development knowledge to create. This is why only trusted developers should
be able to create structures and templates. Users, of course, should be able to
view structures. The *View* permission enables them to make use of the
structures to create content.

![Figure 4: You're able to assign structure permissions via the *Actions* button.](../../../images/web-content-structure-permissions.png)

You can grant or deny permissions based on Roles and this is the recommended way
to handle permissions for structures.

Now that you understand what structures are used for, you need to understand the
other half of @product@'s web content management system: templates.
