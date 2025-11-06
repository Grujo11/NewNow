package com.example.NewNow.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Table(name = "users")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Manages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;

    // Relationships
    //private User manager;     // user who manages
    //private Location location; // managed location

    // Manages → Administrator : N : 1
   /* @ManyToOne(optional = false)
    @JoinColumn(name = "admin_id")
    Administrator admin;

    // Manages → Location : N : 1
    @ManyToOne(optional = false)
    @JoinColumn(name = "location_id")
    Location location;*/
}

