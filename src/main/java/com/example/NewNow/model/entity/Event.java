package com.example.NewNow.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Table(name = "users")
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

    // Relationships
    // private Location location; // belongs to
    //private List<Image> images = new ArrayList<>();

    // Event → User (organizer) : N : 1
   /* @ManyToOne(optional = false)
    @JoinColumn(name = "organizer_id")
    User organizer;

    // Event → Location ("at") : N : 1
    @ManyToOne(optional = false)
    @JoinColumn(name = "location_id")
    Location location;

    // Event ← Review : 1 : N  (Review je “for a” Event)
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Review> reviews = new ArrayList<>();

    // Event ← Comment : 1 : N  (Comment “belongs to” Event)
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Comment> comments = new ArrayList<>();

    // Event ↔ Image : 1 : 1 (0..1 slika po eventu; owning side je Image)
    @OneToOne(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    Image image;*/
}

