package com.example.NewNow.services;

import com.example.NewNow.model.dto.location.LocationCreateDTO;
import com.example.NewNow.model.dto.location.LocationDTO;

import java.util.Set;

public interface LocationService {
    LocationDTO createLocation(LocationCreateDTO locationDTO);
    Set<LocationDTO> getAllLocations();
    LocationDTO getLocationById(Long id);
    Boolean deleteLocationById(Long id);
    LocationDTO updateLocationById(Long id,LocationDTO locationDTO);



}
