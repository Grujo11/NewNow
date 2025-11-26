package com.example.NewNow.services;
import com.example.NewNow.model.dto.EventDTO;

import java.util.Set;

public interface EventService {
    EventDTO createEvent(EventDTO eventDTO);
    Set<EventDTO> getAllEvents();
    EventDTO getEventById(Long id);
    Boolean deleteEventById(Long id);
    EventDTO updateEventById(Long id, EventDTO eventDTO);
}
