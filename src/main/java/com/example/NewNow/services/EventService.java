package com.example.NewNow.services;
import com.example.NewNow.model.dto.EventDTO;
import com.example.NewNow.model.dto.location.EventCreateDTO;

import java.util.Set;

public interface EventService {
    EventDTO createEvent(EventCreateDTO eventDTO);
    Set<EventDTO> getAllEvents();
    EventDTO getEventById(Long id);
    Boolean deleteEventById(Long id);
    EventDTO updateEventById(Long id, EventDTO eventDTO);
}
