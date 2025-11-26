package com.example.NewNow.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDate createdAt;
    private String address;
    private Double totalRating;
    private String type;


    @OneToOne
    private User user;

    @OneToMany(mappedBy = "location")
    Set<Event> events = new HashSet<Event>();

    @OneToMany(mappedBy = "location")
    Set<Review> reviews = new HashSet<Review>();

}

