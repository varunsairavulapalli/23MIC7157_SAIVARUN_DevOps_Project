package com.example.college_event_website.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.college_event_website.model.EventModel;

@Repository
public class EventRepository {

    private final List<EventModel> eventList = new ArrayList<>();

    // Add Event
    public EventModel addEvent(EventModel event) {
        eventList.add(event);
        return event;
    }

    // Get All Events
    public List<EventModel> getAllEvents() {
        return eventList;
    }

    // Get Event By Id
    public EventModel getEventById(int id) {

        for (EventModel event : eventList) {

            if (event.getId() == id) {

                return event;

            }
        }

        return null;
    }

    // Update Event
    public EventModel updateEvent(int id, EventModel updatedEvent) {

        for (int i = 0; i < eventList.size(); i++) {

            if (eventList.get(i).getId() == id) {

                eventList.set(i, updatedEvent);

                return updatedEvent;

            }
        }

        return null;
    }

    // Delete Event
    public boolean deleteEvent(int id) {

        EventModel event = getEventById(id);

        if (event != null) {

            eventList.remove(event);

            return true;

        }

        return false;
    }

}