package com.example.NewNow.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Review {
    private Long id;
    private LocalDateTime createdAt;
    private Integer eventCount;
    private Boolean hidden;

    // Relationships
    private User author;        // made by
    private Location location;  // belongs to
    private Rate rate;          // with rating (1-1)
    private List<Comment> comments = new ArrayList<>();
}

