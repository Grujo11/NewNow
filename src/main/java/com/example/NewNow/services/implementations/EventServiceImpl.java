package com.example.NewNow.services.implementations;

import com.example.NewNow.model.dto.EventDTO;
import com.example.NewNow.model.entity.Event;
import com.example.NewNow.repositories.EventRepository;
import com.example.NewNow.services.EventService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }
    @Override
    public EventDTO createEvent(EventDTO eventDTO) {
        return null;
    }
    @Override
    public Set<EventDTO> getAllEvents() {
        Set<EventDTO> eventDTOSet = new HashSet<>();
        for (Event event : eventRepository.findAll()) {
            EventDTO eventDTO = convertEventToDTO(event);
            eventDTOSet.add(eventDTO);
        }
        return eventDTOSet;
    }
    @Override
    public EventDTO getEventById(Long id) {
        EventDTO eventDTO = new EventDTO();
        Optional<Event> event = eventRepository.findById(id);
        if (event.isPresent()) {
            eventDTO = convertEventToDTO(event.get());
        }
        return eventDTO;
    }
    @Override
    public Boolean deleteEventById(Long id) {
        return null;
    }
    @Override
    public EventDTO updateEventById(Long id, EventDTO eventDTO) {
        return null;
    }

    public EventDTO convertEventToDTO(Event event) {
        EventDTO eventDTO = new EventDTO();
        eventDTO.setId(event.getId());
        eventDTO.setName(event.getName());
        eventDTO.setAddress(event.getAddress());
        eventDTO.setType(event.getType());
        eventDTO.setDate(event.getDate());
        eventDTO.setPrice(event.getPrice());
        eventDTO.setRecurrent(event.getRecurrent());
        return eventDTO;
    }

}
