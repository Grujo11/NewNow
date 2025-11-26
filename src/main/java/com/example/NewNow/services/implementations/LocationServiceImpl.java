package com.example.NewNow.services.implementations;

import com.example.NewNow.model.dto.LocationDTO;
import com.example.NewNow.model.entity.Location;
import com.example.NewNow.repositories.LocationRepository;
import com.example.NewNow.services.LocationService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }
    @Override
    public LocationDTO createLocation(LocationDTO locationDTO) {
        return null;
    }

    @Override
    public Set<LocationDTO> getAllLocations() {
        Set<LocationDTO> locationDTOSet = new HashSet<>();
        locationRepository.findAll();
        for (Location location : locationRepository.findAll()) {
            LocationDTO locationDTO = convertLocationToDTO(location);
            locationDTOSet.add(locationDTO);
        }
        return locationDTOSet;
    }

    @Override
    public LocationDTO getLocationById(Long id) {
        LocationDTO locationDTO = new LocationDTO();
        Optional<Location> location = locationRepository.findById(id);
        if (location.isPresent()) {
            locationDTO=convertLocationToDTO(location.get());
        }
        return locationDTO;
    }

    @Override
    public Boolean deleteLocationById(Long id) {
        return null;
    }

    @Override
    public LocationDTO updateLocationById(Long id, LocationDTO locationDTO) {
        return null;
    }

    public LocationDTO convertLocationToDTO(Location location) {
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setId(location.getId());
        locationDTO.setName(location.getName());
        locationDTO.setDescription(location.getDescription());
        locationDTO.setCreatedAt(location.getCreatedAt());
        locationDTO.setAddress(location.getAddress());
        locationDTO.setTotalRating(location.getTotalRating());
        locationDTO.setType(location.getType());
        return locationDTO;
    }
}
