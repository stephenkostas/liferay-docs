# Contributed Fragment Collections

In most cases, Page Fragments are created by web developers and imported 
through the Page Fragments interface, or created directly using the embedded 
tools. Page Fragments created like this can be updated and edited by any user 
with the necessary privileges and used however they want. This works for many 
cases, but you may have certain situations where you want to add fragments that
will be 100% static, and that cannot be modified. In this case you can create
a Contributed Fragment Collection.

Contributed Fragment Collections are deployable modules which contain Page 
Fragments. Those fragments can be used just like regular fragments, but are not 
contained in the database, and cannot be modified except by updating the module 
that they are deployed in.

## Creating Contributed Fragments

To create a Contributed Fragment Collection, a developer must,

1.  Create a module which will contain the necessary logic and the fragments.

2.  Extend the class `BaseFragmentCollectionContributor` with all the logic for
    reading the contributed fragments.

3.  Add fragments as resources in the module.

Once you deploy the module, any fragments contained in it will be available for use. 

