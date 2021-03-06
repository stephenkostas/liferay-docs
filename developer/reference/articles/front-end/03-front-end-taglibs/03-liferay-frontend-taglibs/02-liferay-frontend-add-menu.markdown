---
header-id: liferay-front-end-add-menu
---

# Liferay Front-end Add Menu

[TOC levels=1-4]

The add menu tag creates an add menu button for one or multiple items. It's 
used for actions that add entities (e.g. a new blog entry), and is part of the 
Management Bar. Use the `<liferay-frontend:add-menu>` tag to create the add 
menu and nest a `<liferay-frontend:add-menu-item>` tag for each item. 

| **Note:** This pattern is deprecated as of @product-ver@. We recommend that you
| use the Clay Management Toolbar's
| [creation menu pattern](/docs/7-2/reference/-/knowledge_base/r/clay-management-toolbar#creation-menu)
| instead.

When the menu has one item, the button triggers the item's action as shown in 
the example below for the Blogs Admin App:

```html
<liferay-frontend:management-bar>
  <liferay-frontend:management-bar-buttons>
      ...
      <liferay-frontend:add-menu
        inline="<%= true %>"
      >
        <liferay-frontend:add-menu-item
          title='<%= LanguageUtil.get(request, "add-blog-entry") %>'
          url="<%= addEntryURL %>"
        />
      </liferay-frontend:add-menu>

  </liferay-frontend:management-bar-buttons>
</liferay-frontend:management-bar>
```

![Figure 1: The add button pattern consists of an `add-menu` tag and at least one `add-menu-item` tag.](../../../../images/liferay-frontend-taglib-add-menu-one-item.png)

When the menu has multiple items, they display in a pop-up menu. For example, 
the Message Boards Admin application has the configuration below:

```html
<liferay-frontend:add-menu>
    ...
    <liferay-frontend:add-menu-item title='<%= LanguageUtil.get(request,
    "thread") %>' url="<%= addMessageURL.toString() %>" />
    ...
    <liferay-frontend:add-menu-item title='<%= LanguageUtil.get(request,
    (categoryId == MBCategoryConstants.DEFAULT_PARENT_CATEGORY_ID) ?
    "category[message-board]" : "subcategory[message-board]") %>'
    url="<%= addCategoryURL.toString() %>" />
    ...
</liferay-frontend:add-menu>
```

![Figure 2: The add button pattern consists of an `add-menu` tag and at least one `add-menu-item` tag.](../../../../images/liferay-frontend-taglib-add-menu-items.png)

The examples above use some of the available attributes. See the 
[add menu](@app-ref@/foundation/latest/taglibdocs/liferay-frontend/add-menu.html) 
and 
[add menu item](@app-ref@/foundation/latest/taglibdocs/liferay-frontend/add-menu-item.html) 
taglibdocs for the full list of available attributes for the tags. 

## Related Topics

- [Liferay Frontend Cards](/docs/7-2/reference/-/knowledge_base/r/liferay-frontend-cards)
- [Liferay Frontend Info Bar](/docs/7-2/reference/-/knowledge_base/r/liferay-frontend-info-bar)
- [Liferay Frontend Management Bar](/docs/7-2/reference/-/knowledge_base/r/liferay-frontend-management-bar)
