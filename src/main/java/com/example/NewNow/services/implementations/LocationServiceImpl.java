package com.example.NewNow.services.implementations;

import com.example.NewNow.model.dto.LocationDTO;
import com.example.NewNow.services.LocationService;

import java.util.Set;

public class LocationServiceImpl implements LocationService {
    @Override
    public LocationDTO createLocation(LocationDTO locationDTO) {
        return null;
    }

    @Override
    public Set<LocationDTO> getAllLocations() {
        return Set.of();
    }

    @Override
    public LocationDTO getLocationById(Long id) {
        return null;
    }

    @Override
    public Boolean deleteLocationById(Long id) {
        return null;
    }

    @Override
    public LocationDTO updateLocationById(Long id, LocationDTO locationDTO) {
        return null;
    }
}
