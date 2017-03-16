# Understanding Liferay Faces Alloy [](id=understanding-liferay-faces-alloy)

Liferay Faces Alloy is distributed in a `.jar` file. You can add Liferay Faces
Alloy as a dependency to your portlet projects, in order to use AlloyUI in a
way that is consistent with JSF development. 

During the creation of a JSF portlet in Liferay IDE/Developer Studio, you have
the option of choosing the portlet's JSF Component Suite. The options include
*JSF standard*,
[*ICEfaces*](http://www.icesoft.org/java/projects/ICEfaces/overview.jsf),
[*PrimeFaces*](http://primefaces.org/),
[*RichFaces*](http://richfaces.jboss.org/), and *Liferay Faces Alloy*. You can
visit the
[JSF learning path](/develop/tutorials/-/knowledge_base/6-2/writing-a-jsf-application-using-liferay-faces)
to walk through this process. 

If you selected the Liferay Faces Alloy JSF Component Suite during your
portlet's setup, the `.jar` file is included in your portlet project using Maven. 

The Liferay Faces Alloy project provides a set of UI components that utilize
AlloyUI. For example, a brief list of some of the supported `aui:` tags are
listed below: 

- Input: `alloy:inputText`, `alloy:inputDate`, `alloy:inputFile`
- Panel: `alloy:accordion`, `alloy:column`, `alloy:fieldset`, `alloy:row`
- Select: `alloy:selectOneMenu`, `alloy:selectOneRadio`, `alloy:selectStarRating`

If you want to utilize Liferay's AlloyUI technology based on YUI3, you must
include the Liferay Faces Alloy `.jar` file in your JSF portlet project. If you
selected *Liferay Faces Alloy* during your JSF portlet's setup, you have Liferay
Faces Alloy preconfigured in your project, so you're automatically able to use
the `alloy:` tags. 

As you can see, it's extremely easy to configure your JSF application to use
Liferay's AlloyUI tags. 

## Related Topics [](id=related-topics)

[Liferay Faces Alloy UI Components](/develop/tutorials/-/knowledge_base/6-2/liferay-faces-alloy-ui-components)

[Creating and Deploying JSF Portlets](/develop/tutorials/-/knowledge_base/6-2/creating-and-deploying-jsf-portlets)

[Developing Liferay Faces Portlets with Maven](/develop/tutorials/-/knowledge_base/6-2/developing-liferay-faces-portlets-with-maven)

[Understanding Liferay Faces Bridge](/develop/tutorials/-/knowledge_base/6-2/understanding-liferay-faces-bridge)

[Understanding Liferay Faces Portal](/develop/tutorials/-/knowledge_base/6-2/understanding-liferay-faces-portal)
