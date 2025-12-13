package com.example.NewNow.services.implementations;

import com.example.NewNow.model.dto.EventDTO;
import com.example.NewNow.model.dto.location.EventCreateDTO;
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
    public EventDTO createEvent(EventCreateDTO eventDTO) {


        Event event = new Event();
        event.setName(eventDTO.getName());
        event.setAddress(eventDTO.getAddress());
        event.setType(eventDTO.getType());
        event.setDate(eventDTO.getDate());
        event.setPrice(eventDTO.getPrice()); // može biti null ako je besplatan
        event.setRecurrent(
                eventDTO.getRecurrent() != null ? eventDTO.getRecurrent() : false
        );

        Event saved = eventRepository.save(event);
        return convertEventToDTO(saved);
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
        if (id == null) {
            return false;
        }

        if (!eventRepository.existsById(id)) {
            return false;
        }

        eventRepository.deleteById(id);
        return true;
    }

    @Override
    public EventDTO updateEventById(Long id, EventDTO eventDTO) {
        if (id == null || eventDTO == null) {
            return null;
        }

        Optional<Event> optionalEvent = eventRepository.findById(id);
        if (optionalEvent.isEmpty()) {
            return null;
        }

        Event event = optionalEvent.get();

        if (eventDTO.getName() != null) {
            event.setName(eventDTO.getName());
        }
        if (eventDTO.getAddress() != null) {
            event.setAddress(eventDTO.getAddress());
        }
        if (eventDTO.getType() != null) {
            event.setType(eventDTO.getType());
        }
        if (eventDTO.getDate() != null) {
            event.setDate(eventDTO.getDate());
        }
        if (eventDTO.getPrice() != null) {
            event.setPrice(eventDTO.getPrice());
        }
        if (eventDTO.getRecurrent() != null) {
            event.setRecurrent(eventDTO.getRecurrent());
        }

        Event saved = eventRepository.save(event);
        return convertEventToDTO(saved);
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
