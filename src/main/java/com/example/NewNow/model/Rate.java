package com.example.NewNow.model;

public class Rate {
    private Long id;
    private Integer performance;
    private Integer soundAndLighting;
    private Integer venue;
    private Integer overallImpression;

    // Relationship
    private Review review;
}

