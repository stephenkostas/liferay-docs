# Retrieving Segments

Segments are groups of Users or user-related entities (like Organizations) that 
meet a certain criteria. There is a large pool of criteria you can use to 
define Segments, ranging from a user's profile information, like date of 
birth or job title, to context information, like the current browser or what 
last visited page. You can also define a segment that is a static set of
manually selected members.

## Segment Lifecycle

To develop with Segments, you must understand the lifecycle of how to process 
Segment criteria for displaying content.

1.  Retrieve the list of active Segments.

2.  Evaluate which (if any) Segments apply to the current user.

3.  Determine what content to display based on the Segment criteria.

To use Segments to personalize how assets are displayed to users, you must use 
Liferay's API provided by the `com.liferay.segments.api module`. Its 
`SegmentsEntryService` provides methods to perform permission aware operations 
on segments.

To better understand this, you'll create a simple application that displays relevant information for a partner portal. [??]

**[need a more concrete example with complete code]**

## Getting Segments

The first step is to retrieve the active segments. `SegmentEntryService` can 
provide a `List` of with an ordered range of active segments of user type, 
within a site identified by a groupId with a snippet like this:

    List<SegmentsEntry> segmentsEntries = 
      segmentsEntryService.getSegmentsEntries(groupId, true, 
          User.class.getName(), 0, 10, orderByComparator);


1.  Create a module.

2.  Paste in this code in this class:

[Code for Segment?]

## Displaying Content Based on Criteria 

**[Finish Example]**

You can see a complete list of services and how to best access them here 
[javadoc link].

