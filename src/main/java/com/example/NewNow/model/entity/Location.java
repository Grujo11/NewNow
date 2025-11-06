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

    // Relationships
    //private List<Event> events = new ArrayList<>();
    //private List<Review> reviews = new ArrayList<>();


    // Location ← Event : 1 : N
   /* @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Event> events = new ArrayList<>();

    // Location ↔ Manages : 1 : N (mnogo zapisa ko-kada upravlja)
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Manages> managers = new ArrayList<>();

    // Location ↔ Image : 1 : 1 (0..1 slika po lokaciji; owning side je Image)
    @OneToOne(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true)
    Image image;*/
}

