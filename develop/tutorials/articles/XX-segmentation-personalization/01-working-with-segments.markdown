# Working with segments

Segments are groups of Users or user-related entities (like Organizations) that 
meet a certain criteria. There is a large pool of criteria you can use to 
define Segments, ranging from a user's profile information, like their date of 
birth or job title, to context information, like their current browser or what 
page they last visited. You can also define a segment that is a static set of
manually selected members.

## Managing segments

The API to manage segments in Liferay is provided by the 
`com.liferay.segments.api module`. The `SegmentsEntryService` provides the methods to perform permission aware operations on segments. 
For instance, this code snippet retrieves an ordered range of active segments of user type, within a site identified by a groupId.

    List<SegmentsEntry> segmentsEntries = 
      segmentsEntryService.getSegmentsEntries(groupId, true, 
          User.class.getName(), 0, 10, orderByComparator);

For a complete reference of the segment services, review the Javadoc. [Pending]

### Assigning members to segments

The segmentsEntry criteria field determines the conditions that an entity must meet to be assigned to the segment. The conditions can be both profile- and context-based. 
Profile-based conditions work as search filters in the Liferay Index. For instance, a profile-based condition for user type segments filters users based on indexed fields such as jobTitle, organizationIds, etc. For further information, see UserIndexer.
To abstract the developer from the query language used by the search index engine, profile-based criteria queries are written in oData, the same filtering language used by the new headless APIs in Liferay 7.2.
The following snippet shows how to create an active segment that contains users whose jobTitle is ‘Developer’:

    Criteria criteria = new Criteria();

    criteria.addCriterion(
      "user", “(jobTitle eq 'Developer')”, Criteria.Conjunction.AND);

    segmentsEntryService.addSegmentsEntry(
      nameMap, descriptionMap, true, CriteriaSerializer.serialize(criteria),
      "segment-key", User.class.getName(), serviceContext);

The Criteria object allows to combine multiple criterion with AND, OR 
conjunctions to build a complex filters. In the above example, “user” is the key of the `SegmentsCriteriaContributor` that processes this type of query (User profile fields). For more information about `SegmentsCriteriaContributor`, see the Extending Segments section.

On the other hand, context-based conditions… [Pending]

Finally, the `SegmentsEntryRelService` allows assigning selected members to a 
segment. For instance, this code snipped assigns a user identified by a userId 
to a segment identified by a `segmentsEntryId`:

    segmentsEntryRelService.addSegmentsEntryRel(
    segmentsEntryId, _portal.getClassNameId(User.class), userId, serviceContext)

### Retrieving segment members

The API to query computed segment-member associations is available in the com.liferay.segments.api module. The SegmentsEntryProvider service provides methods to obtain the entities associated to a segment, and the segments associated to an entity,

The following snippet retrieves a range of primary keys of the entities associated to a segment identified by a segmentsEntryId:

    long[] segmentsEntryClassPKs =
      segmentsEntryProvider.getSegmentsEntryClassPKs(segmentsEntryId, 0, 10);

In order to obtain the total count of entities associated to a segment, you can 
use the getSegmentsEntryClassPKsCount method, as shown in the following snippet:

    int segmentsEntryClassPksCount =
	  segmentsEntryProvider.getSegmentsEntryClassPKsCount(segmentsEntryId);

Finally, method getSegmentsEntryIds obtains the reverse association (i.e. the segments associated to a specific entity). For example, this snippet returns the segments associated to a user identified by a userId:

    int segmentsEntryClassPksCount =
	  segmentsEntryProvider.getSegmentsEntryIds(User.class.getName(), userId);
