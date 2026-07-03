package com.example.college_event_website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.college_event_website.model.EventModel;
import com.example.college_event_website.service.EventService;

@RestController
@RequestMapping("/events")
@CrossOrigin(origins = "*")
public class EventController {

    @Autowired
    private EventService eventService;

    // Add Event
    @PostMapping
    public EventModel addEvent(@RequestBody EventModel event) {
        return eventService.addEvent(event);
    }

    // Get All Events
    @GetMapping
    public List<EventModel> getAllEvents() {
        return eventService.getAllEvents();
    }

    // Get Event By ID
    @GetMapping("/{id}")
    public EventModel getEventById(@PathVariable int id) {
        return eventService.getEventById(id);
    }

    // Update Event
    @PutMapping("/{id}")
    public EventModel updateEvent(@PathVariable int id,
            @RequestBody EventModel event) {
        return eventService.updateEvent(id, event);
    }

    // Delete Event
    @DeleteMapping("/{id}")
    public boolean deleteEvent(@PathVariable int id) {
        return eventService.deleteEvent(id);
    }
}