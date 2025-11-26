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

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String type;
    private LocalDate date;
    private Double price;
    private Boolean recurrent;


    @ManyToOne
    private Location location;

    @OneToOne
    private Image image;

    @OneToMany(mappedBy = "event")
    private Set<Review> reviews = new HashSet<Review>();


}

