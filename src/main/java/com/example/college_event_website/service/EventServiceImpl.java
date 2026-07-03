package com.example.college_event_website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.college_event_website.model.EventModel;
import com.example.college_event_website.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository repository;

    @Override
    public EventModel addEvent(EventModel event) {
        return repository.addEvent(event);
    }

    @Override
    public List<EventModel> getAllEvents() {
        return repository.getAllEvents();
    }

    @Override
    public EventModel getEventById(int id) {
        return repository.getEventById(id);
    }

    @Override
    public EventModel updateEvent(int id, EventModel event) {
        return repository.updateEvent(id, event);
    }

    @Override
    public boolean deleteEvent(int id) {
        return repository.deleteEvent(id);
    }
}