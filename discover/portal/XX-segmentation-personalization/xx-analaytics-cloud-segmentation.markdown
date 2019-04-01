# Using Analytics Cloud With User Segments

Analytics Cloud is a Liferay service that provides in depth information on who
is using your site, and how they are using. It can also be integrated with 
Segmentation to expand your ability to personalize content for your users.

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

## Defining Segment Criteria in Analytics Cloud

The Segment criteria for Analytics Cloud is different than the Segment criteria 
for creating Segments in @product@. See the [Analytics Cloud 
documentation](link) for more information. Now, define the criteria for your
segment:
    
1.  Click *Create Criteria*.

2.  For the criteria type, select *Individuals with Behavior* and leave the 
    second selector as *Has*.

3.  Click *Select Activity* and select *Visited*.

4.  Click *Select Asset* and select your *Welcome Page*.

5.  Click *Since* and select *7 Days Ago*.
    
6.  Click Create.

You will see a preview of the number of users as you create the segment. From 
here you can view a customizable collection of analytics data for the 
users in your segments.

![Figure X: You can view all of the analytics data for your new segment in Analytics Cloud.](../../images/sements-ac-analytics.png)

Next, you can use this Segment to define behaviors on your server.

## Getting Segment Analytics

After you create a Segment in Analytics Cloud, and it finished syncing, you can view it in @product@, and customize it there as well.

1.  Go to the *Segments* page.

2.  Click on *Homepage Visitors*.

![Figure X: When you see Analytics Cloud Segments in the list of Segments, they will be marked with the Analytics Cloud icon.](../../images/segments-ac-list-item.png)

So far this Segment is blank, since while you defined criteria for analytics, 
you have not defined any specific behavior to define it for this specific portal. [need more specific data on the usage here]

