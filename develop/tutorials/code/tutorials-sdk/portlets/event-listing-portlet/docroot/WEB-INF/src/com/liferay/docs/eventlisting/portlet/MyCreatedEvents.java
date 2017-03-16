package com.liferay.docs.eventlisting.portlet;

import java.util.Calendar;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.docs.eventlisting.model.Event;
import com.liferay.docs.eventlisting.service.EventServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class MyCreatedEvents
 */
public class MyCreatedEvents extends MVCPortlet {

	public void deleteEvent(ActionRequest request, ActionResponse response)
			throws Exception {

		long eventId = ParamUtil.getLong(request, "eventId");

		EventServiceUtil.deleteEvent(eventId);

		sendRedirect(request, response);
	}

	public void updateEvent(ActionRequest request, ActionResponse response)
			throws Exception {

		_updateEvent(request);

		sendRedirect(request, response);
	}

	private Event _updateEvent(ActionRequest request) throws PortalException,
			SystemException {

		long eventId = ParamUtil.getLong(request, "eventId");
		String name = ParamUtil.getString(request, "name");
		String description = ParamUtil.getString(request, "description");
		long locationId = ParamUtil.getLong(request, "locationId");

		int year = ParamUtil.getInteger(request, "dateYear");
		int month = ParamUtil.getInteger(request, "dateMonth");
		int day = ParamUtil.getInteger(request, "dateDay");
		int hour = ParamUtil.getInteger(request, "dateHour");
		int minute = ParamUtil.getInteger(request, "dateMinute");
		int amPm = ParamUtil.getInteger(request, "dateAmPm");

		if (amPm == Calendar.PM) {
			hour += 12;
		}

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Event.class.getName(), request);

		Event event = null;

		if (eventId <= 0) {
			event = EventServiceUtil.addEvent(serviceContext.getScopeGroupId(),
					name, description, month, day, year, hour, minute,
					locationId, serviceContext);
		}
		else {
			event = EventServiceUtil.getEvent(eventId);

			event = EventServiceUtil.updateEvent(serviceContext.getUserId(),
					eventId, name, description, month, day, year, hour, minute,
					locationId, serviceContext);
		}

		return event;
	}

}
