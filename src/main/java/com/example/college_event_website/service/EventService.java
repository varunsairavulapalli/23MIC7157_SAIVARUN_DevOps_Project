package com.example.college_event_website.service;

import java.util.List;

import com.example.college_event_website.model.EventModel;

public interface EventService {

    // Add Event
    EventModel addEvent(EventModel event);

    // Get All Events
    List<EventModel> getAllEvents();

    // Get Event By ID
    EventModel getEventById(int id);

    // Update Event
    EventModel updateEvent(int id, EventModel event);

    // Delete Event
    boolean deleteEvent(int id);

}