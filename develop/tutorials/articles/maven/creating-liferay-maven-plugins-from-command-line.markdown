# Creating Liferay Maven Plugins from the Command Line [](id=creating-liferay-maven-plugins-from-the-command-lin)

To learn how to use Liferay IDE to create Liferay Maven plugins, please refer to
the 
[Creating Liferay Maven Plugins from the Command Line](https://www-ldn.liferay.com/develop/tutorials/-/knowledge_base/creating-liferay-maven-plugins-from-the-command-lin)
tutorial. This tutorial explains how to use Maven archetypes to generate
Liferay plugin projects using the command line.

## Using the Maven Archetype Tool to Create a Liferay Plugin

Follow these steps to create a Liferay plugin from the command line:

1.  Open the command prompt or terminal and navigate to the parent directory in
    which you want to create the plugin project. Archetype create a
    sub-directory for each plugin project you create.

+$$$

**Note:** If you haven't already
    created a parent project, you may want to consider creating one to share
    common project information. See the
    [Using Liferay Maven Parent Plugin Projects](https://www-ldn.liferay.com/develop/tutorials/-/knowledge_base/using-liferay-maven-parent-plugin-projects)
    tutorial for details.

$$$

2.  Execute the command

        mvn archetype:generate -DarchetypeCatalog=https://repository.liferay.com/nexus/content/groups/liferay-ce

+$$$

**Important:** Sometimes, after a
    new Liferay release, the Liferay CE and EE artifacts might only be available
    from [repository.liferay.com](repository.liferay.com). In this case, you
    must use the `-DarchetypeCatalog=...` option to access the Liferay
    Repository.  You'll also need to configure a couple other files to ensure
    the generation command completes successfully. Please refer to the
    *Installing Artifacts from the Liferay Repository* section of the
    [Setting Up Maven](https://www-ldn.liferay.com/develop/tutorials/-/knowledge_base/setting-up-maven)
    tutorial to configure Maven to access the Liferay Repository for Liferay CE
    and EE artifacts. 

$$$

    <!-- Edit archetype generate command and remove above note when GA1 artifacts
    are available from Maven Central. -Cody -->

    Archetype starts and lists the archetypes available to you. You're prompted
    to *choose* an archetype or *filter* archetypes by group / artifact ID. The
    output looks like this: 

        ...
        6: https://repository.liferay.com/nexus/content/groups/liferay-ce -> 
        com.liferay.maven.archetypes:liferay-portlet-liferay-faces-alloy-archetype
        (Provides an archetype to create Liferay Faces Alloy portlets.)
        7: https://repository.liferay.com/nexus/content/groups/liferay-ce/ -> 
        com.liferay.maven.archetypes:liferay-portlet-jsf-archetype
        (Provides an archetype to create Liferay JSF portlets.)
        8: https://repository.liferay.com/nexus/content/groups/liferay-ce/ ->
        com.liferay.maven.archetypes:liferay-portlet-archetype
        (Provides an archetype to create Liferay portlets.)
        9: https://repository.liferay.com/nexus/content/groups/liferay-ce/ ->
        com.liferay.maven.archetypes:liferay-layouttpl-archetype
        (Provides an archetype to create Liferay layout templates.)
        10: https://repository.liferay.com/nexus/content/groups/liferay-ce ->
        com.liferay.maven.archetypes:liferay-hook-archetype
        (Provides an archetype to create Liferay hooks.)
        ...
        Choose a number or apply filter (format: [groupId:]artifactId, case 
        sensitive contains):
        
<!--
        ...
        39: remote -> com.liferay.maven.archetypes:liferay-hook-archetype
        (Provides an archetype to create Liferay hooks.)
        40: remote -> com.liferay.maven.archetypes:liferay-layouttpl-archetype
        (Provides an archetype to create Liferay layout templates.)
        41: remote -> com.liferay.maven.archetypes:liferay-portlet-archetype
        (Provides an archetype to create Liferay portlets.)
        42: remote -> com.liferay.maven.archetypes:liferay-portlet-icefaces-archetype
        (Provides an archetype to create Liferay ICEfaces portlets.)
        43: remote -> com.liferay.maven.archetypes:liferay-portlet-jsf-archetype
        (Provides an archetype to create Liferay JSF portlets.)
        ...
        Choose a number or apply filter (format: [groupId:]artifactId,
        case sensitive contains):
-->
<!-- Output will look similar to this once GA1 artifacts are officially
available on Maven Central/ZIP files. Add similar output back, when available
-Cody -->

3. Choose a Liferay portlet archetype by entering its number. If you're using
the Liferay Repository, the newest archetype version is automatically selected.

<!--
3.  To find the right Liferay archetype for your project, you can either scroll
    up to find it or apply filters to narrow the set of results. Filtering on
    *liferay* as your group ID, and a plugin type (*portlet*, *hook*, *theme*,
    etc.) can help you focus on more applicable Liferay archetypes. 

    Entering `liferay:portlet` as a filter gives a listing of Liferay portlet
    archetypes: -->
<!-- Add back when filtering is relevant (using GA1 artifacts from Central -Cody
-->
<!--
        Choose a number or apply filter (format: [groupId:]artifactId, case
        sensitive contains): : liferay:portlet Choose archetype:
        1: remote -> com.liferay.maven.archetypes:liferay-portlet-archetype
        (Provides an archetype to create Liferay portlets.)
        2: remote ->
        com.liferay.maven.archetypes:liferay-portlet-icefaces-archetype (Pr
        ovides an archetype to create Liferay ICEfaces portlets.)
        3: remote -> com.liferay.maven.archetypes:liferay-portlet-jsf-archetype
        (Provide s an archetype to create Liferay JSF portlets.)
        4: remote ->
        com.liferay.maven.archetypes:liferay-portlet-liferay-faces-alloy-ar
        chetype (Provides an archetype to create Liferay Faces Alloy portlets.)
        5: remote ->
        com.liferay.maven.archetypes:liferay-portlet-primefaces-archetype (
        Provides an archetype to create Liferay PrimeFaces portlets.)
        6: remote ->
        com.liferay.maven.archetypes:liferay-portlet-richfaces-archetype (P
        rovides an archetype to create Liferay RichFaces portlets.) Choose a
        number or apply filter (format: [groupId:]artifactId, case sensitive co
        ntains): :

4.  Choose an archetype by entering its number.-->
<!-- Add back when step 3. is added back -->

<!--
5.  You're prompted to choose the archetype version. Enter the number
    corresponding to the Liferay version for the archetype. However, you're not
    required to select the archetype version that corresponds with your Liferay
    instance; older archetype versions are compatible with updated Liferay
    bundles. 

        Choose com.liferay.maven.archetypes:liferay-portlet-archetype version:
        1: 6.0.2
        2: 6.0.3
        3: 6.0.4
        4: 6.0.5
        5: 6.0.6
        6: 6.1.0
        7: 6.1.1
        8: 6.1.2
        9: 6.1.10
        10: 6.1.20
        11: 6.1.30
        12: 6.2.0-B1
        13: 6.2.0-B2
        14: 6.2.0-B3
        15: 6.2.0-M5
        16: 6.2.0-M6
        17: 6.2.0-RC1
        18: 6.2.0-RC2
        19: 6.2.0-RC3
        20: 6.2.0-RC4
        21: 6.2.0-RC5
        Choose a number: 21:
-->
<!-- Add back when GA1 artifacts are available from Central. --Cody -->

4.  Enter values for the *groupId*, *artifactId*, *version*, and *package*
    coordinates (properties) of your project. Here are some examples: 

        groupId: com.liferay.sample
        artifactId: sample-portlet
        version: 1.0-SNAPSHOT
        package: com.liferay.sample

    This process is illustrated in the snapshot below:

    ![Figure 1: When creating your portlet plugin, you must enter your *groupId*, *artifactId*, *version*, and *package* properties.](../../images/maven-portlet-plugin-settings.png)

    For more information on defining Maven coordinates, see
    [http://maven.apache.org/pom.html#Maven_Coordinates](http://maven.apache.org/pom.html#Maven_Coordinates).

5.  Enter the letter *Y* to confirm your coordinates.

    Maven's Archetype tool creates a Liferay plugin project directory with a new
    `pom.xml` file and source code. 

+$$$

**Note:** The archetype file is
downloaded and installed automatically to your local repository (e.g.,
`.m2/repository/com/liferay/maven/archetypes/[archetype]`). If you
configured a mirror pointing to your public repository on Nexus, the
plugin is installed there. 

$$$

Following these steps, you can use Archetype to generate all your Liferay plugin
projects! 

Plugin projects generated from a Liferay archetype are equipped with a POM
that's ready to work with a parent project. It inherits the values for
`liferay.version` and `liferay.auto.deploy.dir` properties from the parent. 

When your plugin is created, you can package and deploy your project to a
specified Liferay instance. You can even install and deploy the individual
plugin to a remote repository. 

## Related Topics

[Deploying Liferay Plugins with Maven](/develop/tutorials/-/knowledge_base/deploying-liferay-plugins-with-maven)

[Developing Liferay Theme Plugins with Maven](/develop/tutorials/-/knowledge_base/developing-liferay-theme-plugins-with-maven)

[Developing Liferay Layout Template Plugins with Maven](/develop/tutorials/-/knowledge_base/developing-liferay-layout-template-plugins-with-mav)

[Developing Liferay Plugins with Additional Maven Archetypes](/develop/tutorials/-/knowledge_base/developing-liferay-plugins-with-additional-maven-ar)

