package com.example.NewNow.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private Long id;
    private String name;
    private String address;
    private String type;
    private LocalDate date;
    private Double price;
    private Boolean recurrent;

    // Relationships
    private Location location; // belongs to
    private List<Image> images = new ArrayList<>();
}

