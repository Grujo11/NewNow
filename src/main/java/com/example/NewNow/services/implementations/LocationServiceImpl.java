package com.example.NewNow.services.implementations;

import com.example.NewNow.model.dto.location.LocationCreateDTO;
import com.example.NewNow.model.dto.location.LocationDTO;
import com.example.NewNow.model.entity.Location;
import com.example.NewNow.repositories.LocationRepository;
import com.example.NewNow.services.LocationService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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
    public LocationDTO createLocation(LocationCreateDTO locationDTO) {

        Location location = new Location();
        location.setName(locationDTO.getName());
        location.setDescription(locationDTO.getDescription());
        location.setAddress(locationDTO.getAddress());
        location.setType(locationDTO.getType());

        location.setTotalRating(0.0);
        location.setCreatedAt(LocalDate.now());

        Location saved = locationRepository.save(location);
        return convertLocationToDTO(saved);
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
        if (id == null) {
            return false;
        }

        if (!locationRepository.existsById(id)) {
            return false;
        }

        locationRepository.deleteById(id);
        return true;
    }


    @Override
    public LocationDTO updateLocationById(Long id, LocationDTO locationDTO) {
        if (id == null || locationDTO == null) {
            return null;
        }

        Optional<Location> optionalLocation = locationRepository.findById(id);
        if (optionalLocation.isEmpty()) {
            return null;
        }

        Location location = optionalLocation.get();

        if (locationDTO.getName() != null) {
            location.setName(locationDTO.getName());
        }
        if (locationDTO.getDescription() != null) {
            location.setDescription(locationDTO.getDescription());
        }
        if (locationDTO.getAddress() != null) {
            location.setAddress(locationDTO.getAddress());
        }
        if (locationDTO.getType() != null) {
            location.setType(locationDTO.getType());
        }
        if (locationDTO.getTotalRating() != null) {
            location.setTotalRating(locationDTO.getTotalRating());
        }

        Location saved = locationRepository.save(location);
        return convertLocationToDTO(saved);
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
