package com.example.NewNow.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "users")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String path;

    // Relationship
    //private Event event; // belongs to


    // Image → Event : 0..1 : 1  (najviše jedna slika po eventu)
   /* @OneToOne
    @JoinColumn(name = "event_id", unique = true)
    Event event;

    // Image → Location : 0..1 : 1  (najviše jedna slika po lokaciji)
    @OneToOne
    @JoinColumn(name = "location_id", unique = true)
    Location location;*/
}

