package com.example.NewNow.model;

import java.time.LocalDate;

public class Manages {
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;

    // Relationships
    private User manager;     // user who manages
    private Location location; // managed location
}

