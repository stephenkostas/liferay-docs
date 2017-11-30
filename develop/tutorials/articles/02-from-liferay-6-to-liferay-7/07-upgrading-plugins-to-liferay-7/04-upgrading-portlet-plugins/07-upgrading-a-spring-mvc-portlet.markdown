# Upgrading a Spring MVC portlet [](id=upgrading-a-spring-mvc-portlet)

The [Spring Portlet MVC framework](https://docs.spring.io/spring/docs/current/spring-framework-reference/html/portlet.html)
facilitates injecting dependencies and implementing the Model View Controller
pattern in portlets. If you use this framework in a portlet for Liferay Portal
6.x, you can upgrade it to @product-ver@. 

This tutorial demonstrates upgrading a Spring MVC portlet called My Spring MVC
(project `my-spring-mvc-portlet`). It's a bare-bones portlet created from the
Plugins SDK's `spring_mvc` template. 

![Figure 1: My Spring MVC portlet shows its name and @product@'s information.](../../../../images/upgraded-spring-mvc-portlet.png)

To follow along, download and refer to the
[original source code](https://dev.liferay.com/documents/10184/656312/my-spring-mvc-portlet-pre-7-0-upgrade.zip)
and the 
[upgraded source code](https://dev.liferay.com/documents/10184/656312/my-spring-mvc-portlet-post-7-0-upgrade.zip).

The figure below shows the `my-spring-mvc-portlet` project.

![Figure 2: The `my-spring-mvc-portlet` project has traditional Liferay plugin files, Spring Portlet MVC application contexts (in `spring-context/`), and a controller class `MySpringMVCPortletviewController`. ](../../../../images/upgrading-spring-mvc-portlets-folder-structure.png)

These files have Spring-related content:

-   `view.jsp` &rarr; Shows the portlet's name and @product@'s release
    information.
-   `my-spring-mvc-portlet.xml` &rarr; @product@ uses this context file for the
    portlet.
-   `portlet-applications-context.xml` &rarr; Spring's
    `SpringContextLoaderListener` class uses this context file. 
-   `MySpringMVCPortletviewController` &rarr; Maps `VIEW` requests to the
    `view.jsp` and assigns @product@ release information to a model attribute.
-   `portlet.xml` &rarr; References context configuration file
    `my-spring-mvc-portlet.xml` and specifies a dispatcher for registered
    portlet request handlers.
-   `web.xml` &rarr; References context configuration file
    `portlet-application-context.xml` and specifies a `ViewRendererServlet` to
    convert portlet requests and responses to HTTP servlet requests and
    responses.

Here are the Spring MVC portlet upgrade steps:

1.  [Adapt the code to @product-ver@'s API](#adapt-the-code-to-liferay-api-changes)

2.  [Resolve dependencies](#resolve-dependencies)

## Adapt the code to @product-ver@'s API [](id=adapt-the-code-to-liferay-api-changes)

The
[Code Upgrade Tool](/develop/tutorials/-/knowledge_base/7-0/adapting-to-liferay-7s-api-with-the-code-upgrade-tool)
facilitates updating the code and resolving compilation issues quickly.

The Code Upgrade Tool detects if the value of the `liferay-versions` property in
your plugin's `liferay-plugin-package.properties` file needs updating and it
provides an option to fix it automatically. This is the only code adaptation
required by `my-spring-mvc-portlet`. 

## Resolve Dependencies [](id=resolve-dependencies)

In Liferay Portal 6.2, `my-spring-mvc-portlet` leveraged Portal's JARs by
specifying them in the `liferay-plugin-package.properties` file's
`portal-dependency-jars` property. Since the property is deprecated in
@product-ver@, you should acquire dependencies using a dependency management
framework, such as Apache Ant/Ivy.

Here's the updated `dependency` element for `my-spring-mvc-portlet`'s `ivy.xml`
file:

    <dependencies defaultconf="default">
        <dependency conf="test->default" name="arquillian-junit-container" org="org.jboss.arquillian.junit" rev="1.1.3.Final" />
        <dependency conf="test->default" name="arquillian-tomcat-remote-7" org="org.jboss.arquillian.container" rev="1.0.0.CR6" />
        <dependency conf="test->default" name="com.liferay.ant.arquillian" org="com.liferay" rev="1.0.0-SNAPSHOT" />
        <dependency org="aopalliance" name="aopalliance" rev="1.0" />
        <dependency org="commons-logging" name="commons-logging" rev="1.2" />
        <dependency org="org.springframework" name="spring-aop" rev="4.1.9.RELEASE" />
        <dependency org="org.springframework" name="spring-beans" rev="4.1.9.RELEASE" />
        <dependency org="org.springframework" name="spring-context" rev="4.1.9.RELEASE" />
        <dependency org="org.springframework" name="spring-core" rev="4.1.9.RELEASE" />
        <dependency org="org.springframework" name="spring-expression" rev="4.1.9.RELEASE" />
        <dependency org="org.springframework" name="spring-web" rev="4.1.9.RELEASE" />
        <dependency org="org.springframework" name="spring-webmvc" rev="4.1.9.RELEASE" />
        <dependency org="org.springframework" name="spring-webmvc-portlet" rev="4.1.9.RELEASE" />
    </dependencies>

Some of `my-spring-mvc-portlet`'s dependency artifacts have new names. 

 Old name | New name |
 -------- | -------- |
 `spring-web-portlet` | `spring-webmvc-portlet` |
 `spring-web-servlet` | `spring-webmvc` |

[Maven Central](https://search.maven.org/) provides artifact dependency
information. 

+$$$

**Note**: If the Spring Framework version you're using differs from the version
@product@ uses, you must name your Spring Framework JARs differently from
@product@'s Spring Framework JARs. If you don't rename your JARs, @product@
assumes you're using its Spring Framework JARs and excludes yours from the
generated WAB (Web Application Bundle).
[Portal property `module.framework.web.generator.excluded.paths`](https://docs.liferay.com/ce/portal/7.0-latest/propertiesdoc/portal.properties.html#Module%20Framework)
lists @product@'s Spring Framework JARs. 
[Understanding Excluded JARs](/develop/tutorials/-/knowledge_base/7-0/resolving-a-plugins-dependencies#understanding-excluded-jars)
explains how to detect the Spring Framework version @product@ uses. 

$$$

+$$$

**Note**: If a dependency is an OSGi module JAR and @product@ already exports
your plugin's required packages, *exclude* the JAR from your plugin's WAR file.
This prevents your plugin from exporting the same package(s) that Liferay is
already exporting. This prevents class loader collisions. To exclude a JAR from
deployment, add its name to the your project's
`liferay-plugin-package.properties` file's `deploy-excludes` property.

    deploy-excludes=\
        **/WEB-INF/lib/module-a.jar,\ 
        **/WEB-INF/lib/module-b.jar

Since `my-spring-mvc-portlet`'s dependencies aren't OSGi modules, no JARs
must be excluded.

$$$

To import class packages referenced by your portlet's descriptor files, add the
packages to an `Import-Package` header in the
`liferay-plugin-package.properties` file. See 
[Packaging a Spring MVC Portlet](/develop/tutorials/-/knowledge_base/7-0/spring-mvc#packaging-a-spring-mvc-portlet)
for details.

If you depend on a package from Java's `rt.jar` other than its `java.*`
packages, override
[portal property `org.osgi.framework.bootdelegation`](@platform-ref@/7.0-latest/propertiesdoc/portal.properties.html#Module%20Framework)
and add it to the property's list. Go [here](/develop/tutorials/-/knowledge_base/7-0/resolving-classnotfoundexception-and-noclassdeffounderror-in-osgi-bundles#case-4-the-missing-class-belongs-to-a-java-runtime-package)
for details. 

+$$$

**Note**: Spring MVC portlets whose embedded JARs contain properties files
(e.g., `spring.handlers`, `spring.schemas`, `spring.tooling`) might be affected
by issue
[LPS-75212](https://issues.liferay.com/browse/LPS-75212).
The last JAR that has properties files is the only JAR whose properties are
added to the resulting WAB's classpath. Properties in other JARs aren't added.

[Packaging a Spring MVC Portlet](/develop/tutorials/-/knowledge_base/7-0/spring-mvc#packaging-a-spring-mvc-portlet)
explains how to add all the embedded JAR properties.

$$$

The portlet is ready to deploy. Deploy it as you always have.

@product@'s
[WAB Generator](/develop/tutorials/-/knowledge_base/7-0/using-the-wab-generator)
converts the portlet WAR to a Web Application Bundle (WAB) and installs the WAB
to Liferay's OSGi Runtime Framework. 

    21:12:23,775 INFO  [com.liferay.portal.kernel.deploy.auto.AutoDeployScanner][AutoDeployDir:252] Processing my-spring-mvc-portlet-7.0.0.1.war
    ...
    21:12:36,159 INFO  [fileinstall-C:/portals/liferay-dxp-digital-enterprise-7.0-sp1/osgi/war][PluginPackageUtil:1007] Reading plugin package for my-spring-mvc-portlet
    07-Aug-2017 21:12:36.170 INFO [fileinstall-C:/portals/liferay-dxp-digital-enterprise-7.0-sp1/osgi/war] org.apache.catalina.core.ApplicationContext.log Initializing Spring root WebApplicationContext
    07-Aug-2017 21:12:36.181 INFO [fileinstall-C:/portals/liferay-dxp-digital-enterprise-7.0-sp1/osgi/war] org.apache.catalina.core.ApplicationContext.log Initializing Spring root WebApplicationContext
    21:12:36,365 INFO  [fileinstall-C:/portals/liferay-dxp-digital-enterprise-7.0-sp1/osgi/war][PortletHotDeployListener:201] Registering portlets for my-spring-mvc-portlet
    21:12:36,707 INFO  [fileinstall-C:/portals/liferay-dxp-digital-enterprise-7.0-sp1/osgi/war][PortletHotDeployListener:313] 1 portlet for my-spring-mvc-portlet is available for use
    21:12:36,868 INFO  [fileinstall-C:/portals/liferay-dxp-digital-enterprise-7.0-sp1/osgi/war][BundleStartStopLogger:35] STARTED my-spring-mvc-portlet_7.0.0.1 [1309]

You've upgraded a Spring MVC portlet to @product-ver@. Way to go!

## Related Topics [](id=related-topics)

[Spring MVC](/develop/tutorials/-/knowledge_base/7-0/spring-mvc)

[Migrating Plugins SDK Projects to Workspace and Gradle](/develop/tutorials/-/knowledge_base/7-0/migrating-traditional-plugins-to-workspace-web-applications)

[Using Dependency Management Tools](/develop/tutorials/-/knowledge_base/7-0/resolving-a-plugins-dependencies#managing-dependencies-with-ivy)

[Using the WAB Generator](/develop/tutorials/-/knowledge_base/7-0/using-the-wab-generator)
