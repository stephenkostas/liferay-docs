# Audience Targeting [](id=audience-targeting)

Liferay's Audience Targeting application shows relevant content to users based 
on criteria you define. You can organize them into user segments, target 
specific content to those user segments, and create campaigns to expose user segments to a certain set of assets. Visit the
[Targeting Content to your Audience](/discover/portal/-/knowledge_base/7-1/targeting-content-to-your-audience)
section for more information on Audience Targeting and how to use it.

Although the Audience Targeting app can be used to do all this without any 
customization, it is also designed as a framework to be extended by
developers.

There are a set of extensions that can be easily hooked by creating other
hot-deployable plugins. 

These extension points include,

* Rule Types
* Report Types
* Report Metrics

Audience Targeting extensions are created using OSGi modules. There are
convenient Blade CLI templates for creating these projects, but you can create
the modules any way you want. To use the templates, see the
[Blade CLI tutorials](/develop/tutorials/-/knowledge_base/7-1/blade-cli).

In this section's tutorials, you'll learn how to create these extension points
for your Audience Targeting application.

+$$$

**Important:** Not all Audience Targeting features will function using the embedded HSQL database, so developers will need to configure MySQL or another database to make full use of Audience Targeting features.

$$$
