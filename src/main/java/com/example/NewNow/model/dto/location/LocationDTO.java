package com.example.NewNow.model.dto.location;

import lombok.Data;

import java.time.LocalDate;
@Data
public class LocationDTO {
    private Long id;
    private String name;
    private String description;
    private LocalDate createdAt;
    private String address;
    private Double totalRating;
    private String type;
}
