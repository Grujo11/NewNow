package com.example.NewNow.controllers;


import com.example.NewNow.model.dto.LocationDTO;
import com.example.NewNow.services.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;


@RestController
@RequestMapping("/locations")
public class LocationController {
    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public ResponseEntity<Set<LocationDTO>> getAllLocations() {
        Set<LocationDTO> locations = locationService.getAllLocations();
        return new ResponseEntity<>(locations, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<LocationDTO> getLocationById(@PathVariable Long id) {
        LocationDTO locationDTO = locationService.getLocationById(id);
        if (locationDTO == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(locationDTO, HttpStatus.OK);

    }
}
