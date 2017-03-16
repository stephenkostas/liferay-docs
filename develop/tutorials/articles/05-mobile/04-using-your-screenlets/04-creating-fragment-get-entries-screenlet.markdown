# Creating a Fragment for Get Entries Screenlet [](id=creating-a-fragment-for-get-entries-screenlet)

Using a fragment for Get Entries Screenlet lets you swap out part of 
`GuestbookActivity`'s contents without recreating the entire activity from 
scratch each time a guestbook is selected. Your app doesn't currently have any 
fragments, though. In this article, you'll create this fragment and then add it 
to `GuestbooksActivity`. When you finish, you'll be ready to use Get Entries 
Screenlet. 

## Creating the Fragment [](id=creating-the-fragment)

To create the fragment, right click the `com.liferay.docs.liferayguestbook` 
package and select *New* &rarr; *Fragment* &rarr; *Fragment (Blank)*. In the 
wizard, check only the box for *Create layout XML?*, name the fragment 
`EntriesFragment`, and then click *Finish*. The following screenshot illustrates 
this: 

![Figure 1: Create a new blank fragment for the entries.](../../../images/android-create-fragment.png)

This creates the `EntriesFragment` class and its layout file 
`fragment_entries.xml`. Replace the class's contents with the following code: 

    package com.liferay.docs.liferayguestbook;

    import android.os.Bundle;
    import android.support.v4.app.Fragment;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;

    public class EntriesFragment extends Fragment {

        private long _guestbookId;

        public EntriesFragment() {
            // Required empty public constructor
        }

        public static EntriesFragment newInstance(long guestbookId) {
            EntriesFragment entriesFragment = new EntriesFragment();
            Bundle args = new Bundle();
            args.putLong("guestbookId", guestbookId);
            entriesFragment.setArguments(args);

            return entriesFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_entries, container, false);
            _guestbookId = getArguments().getLong("guestbookId");

            return view;
        }

    }

This fragment's `_guestbookId` variable lets you create the fragment using the 
guestbook ID required by Get Entries Screenlet. This sets the guestbook Get 
Entries Screenlet retrieves entries from. If you have experience with Android 
fragments, then you're likely familiar with the empty constructor and 
`newInstance` method. When the screen orientation changes or the user switches 
apps, Android must restore the fragment. Instead of recreating the fragment from 
scratch, the `newInstance` method lets Android restore it with the proper 
`guestbookId`. The `onCreateView` method uses the bundle arguments set in 
`newInstance` to set the fragment's `_guestbookId`. See 
[this blog post](http://www.androiddesignpatterns.com/2012/05/using-newinstance-to-instantiate.html) 
for more information on using a `newInstance` method to manage fragments. 

Next, you'll add this fragment to `GuestbooksActivity`. 

## Adding the Fragment to GuestbooksActivity [](id=adding-the-fragment-to-guestbooksactivity)

Now that `EntriesFragment` exists, you're ready to add the fragment to 
`GuestbooksActivity`. To do this, you must put a fragment container in the 
layout you want the fragment to appear in. In short, a fragment container is a 
layout used to hold a fragment. For more information, see 
[Android's documentation on adding fragments at runtime](http://developer.android.com/training/basics/fragments/fragment-ui.html#AddAtRuntime). 
Since you want Get Entries Screenlet to appear in `GuestbooksActivity`, your 
first thought might be to put the fragment container directly in 
`activity_guestbooks.xml`. Don't do this. Recall that Android Studio's 
Navigation Drawer Activity template created the layout `content_guestbooks.xml` 
to hold the activity's main body content. Open `content_guestbooks.xml` and 
place the following fragment container inside the `RelativeLayout`. This 
fragment container should be the only other element inside the `RelativeLayout`:

    <FrameLayout
        android:id="@+id/fragment_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

Next, you must write the `GuestbooksActivity` code that handles 
`EntriesFragment`. Specifically, you must display the fragment when a guestbook 
is selected in Get Guestbooks Screenlet. You'll do this with a 
[fragment transaction](http://developer.android.com/guide/components/fragments.html#Transactions). 
In short, a fragment transaction adds, removes, or replaces a fragment in an 
activity. Recall that Get Guestbooks Screenlet calls the `onItemClicked` method 
in `GuestbooksActivity` when a guestbook is selected. Currently, this method 
sets the Action Bar's title to the selected guestbook's name and then closes 
the navigation drawer. You'll update this method to also perform the fragment 
transaction. Replace `onItemClicked` with the following updated version: 

    @Override
    public void onItemClicked(final GuestbookModel guestbook) {
        actionBar.setTitle(guestbook.getName());

        EntriesFragment entriesFragment = EntriesFragment.newInstance(guestbook.getGuestbookId());
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, entriesFragment);
        transaction.commit();

        drawer.closeDrawers();
    }

This code also requires you to import 
`android.support.v4.app.FragmentTransaction`. The new `onItemClicked` method's 
`actionBar.setTitle` and `drawer.closeDrawers` calls are the same as before. 
Only the fragment code is new. In it, you first use `newInstance` to create a 
new `EntriesFragment` instance that contains the selected guestbook's ID. A 
fragment transaction then adds this fragment to the fragment container. 

Fantastic! Now you have a fragment to put Get Entries Screenlet in, and the code 
that displays this fragment in `GuestbooksActivity`. Next, you'll put Get 
Entries Screenlet to work. 
