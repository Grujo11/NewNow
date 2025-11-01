package com.example.NewNow.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Location {
    private Long id;
    private String name;
    private String description;
    private LocalDate createdAt;
    private String address;
    private Double totalRating;
    private String type;

    // Relationships
    private List<Event> events = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();
}

