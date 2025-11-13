package com.example.NewNow.services;

import com.example.NewNow.model.dto.LocationDTO;

import java.util.Set;

public interface LocationService {
    LocationDTO createLocation(LocationDTO locationDTO);
    Set<LocationDTO> getAllLocations();
    LocationDTO getLocationById(Long id);
    Boolean deleteLocationById(Long id);
    LocationDTO updateLocationById(Long id,LocationDTO locationDTO);



}
