# Template Basics

Developers create templates to display the elements of the structure in the
markup they want. Content can then be styled properly using CSS, because markup
is generated consistently by the template when structured content is displayed.
In essence, templates are scripts that tell @product@ how to display content in
the structure. Any changes to the structure require corresponding changes to the
template, because new or deleted fields produce errors on the page. If users
enter content into a structure, it *must* have a matching template. You have
options, however, for whether you want your template to be permanently linked to
your structure. Generic templates are templates that are not tied to a
structure, which allows for reusable code that can be imported into other
templates. Without a template, @product@ has no idea how to display content which
has been created using a custom structure.

You'll look more closely at the types of templates @product@ supports next.

### Template Types (FTL, VM, and XSL) [](id=template-types-ftl-vm-and-xsl)

@product@ supports templates written in three different templating languages, to
support the skill sets of the largest number of developers. This increases the
chances you can jump right in and use whichever one you've already used before.
If you haven't yet been exposed to any of them, your best bet is FreeMarker or
Velocity, as they are less "chatty" than XSL and extremely simple to
understand.

**FTL** (FreeMarker Template Language): FreeMarker is a templating language
which could be considered a successor to Velocity. It has some advantages over
Velocity for which it sacrifices some simplicity, yet it is still easy to use.
If you haven't used any of the template languages before, FreeMarker is
recommended: you'll get up to speed the fastest.

**VM** (Velocity Macro): Velocity is a scripting language that lets you mix
logic with HTML. This is similar to other scripting languages, such as PHP,
though Velocity is much simpler.

+$$$

**Note:** The Velocity template language is deprecated for @product@ 7.0.

$$$

**XSL** (Extensible Style Sheet Language): XSL is used in Liferay templates to
transform the underlying XML of a structure into markup suitable for the
browser. While it may not be as clean and compact as Velocity or FreeMarker,
it's widely used for transforming XML into other formats and it's very likely
your developers have already been exposed to it.
