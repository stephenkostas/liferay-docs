# Using Analytics Cloud With User Segments

Analytics Cloud is a Liferay service that provides in depth information on who
is using your site, and how they are using. It can also be integrated with 
Segmentation to expand your ability to personalize content for your users. 
Analytics Cloud is a key component to fully utilizing Segments and 
Personalization, since it enables you to see the full picture of how users and 
visitors on your site are behaving and interacting with both standard and 
targeted content.

To get started, you'll need connect your DXP data source to Analytics Cloud and 
enable synchronization of user and analytics  For more information about 
Analytics Cloud, including instructions for connecting it with DXP, see the 
official [Analytics Cloud Documentation](link).

Once you're connected to Analytics Cloud, you can start working on creating 
Segments to analyze user behavior

## Creating a new Segment

Synchronization with Analytics Cloud is not instant, so once you have connected 
Analytics Cloud and Liferay DXP, you first must wait for the users to 
synchronize. After that completes you can create Segments in Analytics Cloud to 
capture data in DXP. First define the basic details of the Segment:

1.  Go to *Segments* and click *Create Segment.

2.  For the *Name* enter "Homepage Vistors" .

3.  For *Segment Type* select *Dynamic*.

![Figure X: The Segment definition interface is different on Analytics Cloud.](../../images/segments-ac-segment-definition.png)

Dynamic Segments are defined based on the specified criteria, and will include 
any users that meet that criteria, while Static segments are manually selected, 
and do not update dynamically.

Initially when you create a Segment in Analytics Cloud, there is a more limited 
set of criteria available. Once the Segment has been created and synced to DXP, 
you can define more detailed criteria. See the [Analytics Cloud 
documentation](link) for more information on Analytics Cloud Segments. Once a 
Segment is created, you can view the analytics data for that Segment. Since 
there is currently not criteria defined, the data will not be particularly 
interesting or useful.

![Figure X: You can view all of the analytics data for your new segment in Analytics Cloud.](../../images/sements-ac-analytics.png)

Next, you can use this Segment to define behaviors on your server.

## Getting Segment Analytics

After you create a Segment in Analytics Cloud, and it finishes syncing, you can view it in @product@, and customize it there as well.

1.  Go to the *Segments* page.

2.  Click on *Homepage Visitors*.

![Figure X: When you see Analytics Cloud Segments in the list of Segments, they will be marked with the Analytics Cloud icon.](../../images/segments-ac-list-item.png)

Now, let's define criteria for this segment, and view the analytics data.



