# Extending segment criteria

The default segment association capabilities are powerful enough to cover most 
use cases, including integrating Segmentation and Personalization with third 
party applications.

**[I feel like these examples might be useful somewhere, but I'm not sure if this is the best spot]**

For instance, if you want to assign users to a segment based on an existing 3rd party segment or list (e.g. attendees to the latest company event) you can simply use the SegmentsEntryRelService service (or its REST API) as described in the Assigning members to segments section.

On the other hand, if you want to segment users based on a 3rd party provided field (e.g. their number of followers in Instagram), just contribute an indexable custom field to the User entity and fill it regularly with the 3rd party value using the Expando API. Your new field will automatically be available for its use as a profile-based criteria.

You will only need to develop a code extension if you need to create new profile-based criteria queries. These queries could be based either on existing model entities in Liferay or in custom model entities. (See `SegmentsCriteriaContributor`)

## Add a new profile-based field to the segmentable entity without using custom fields. [Pending]

## Add a new context-based field [Pending]

## SegmentsCriteriaContributor

SegmentsCriteriaContributor services provide a mechanism to extend the profile-based criteria query. Each SegmentsCriteriaContributor contributes a sub-query (or criterion) and the conjunction (AND, OR) to build the complete criteria query that defines the segment. They also provide a list of Field elements to be shown in the Segment Editor UI, as depicted in the figure:


The following properties determine certain aspects of a SegmentsCriteriaContributor:

* segments.criteria.contributor.key: the unique key that identifies the contributor.  

* segments.criteria.contributor.model.class.name: the type of entity the contributor targets.

* segments.criteria.contributor.priority: the order in which the fields and queries are contributed

By default Liferay provides SegmentsCriteriaContributor services to build User and Organization profile-based criteria (see UserSegmentsCriteriaContributor and OrganizationsSegmentCriteriaContributor). To create segments based on profile information of other entities (e.g. UserGroups), you’ll need to implement your own SegmentsCriteriaContributor.

Additionally, Liferay provides a SegmentsCriteriaContributor to combine User profile-based filter and Organization profile-based filter: the UserOrganizationSegmentsCriteriaContributor allows segmenting users that belongs to organizations meeting a certain criteria. Combining queries of different entity types (e.g. users that have written a blog recently) in another use case of SegmentsCriteriaContributor services.
