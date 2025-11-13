package com.example.NewNow.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Table (name = "users")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String name;
    private String phone_number;
    private LocalDate birthday;
    private String address;
    private String city;

    @OneToMany(mappedBy = "user")
    private Set<Review> reviews = new HashSet<Review>();

    @OneToOne(mappedBy = "user")
    private Image image;

    @OneToMany(mappedBy = "user")
    private Set<Comment> comments = new HashSet<Comment>();



    // User → Review : 1 : N  (review je "made by" korisnik)
   /* @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Review> reviews = new ArrayList<>();

    // User → Comment : 1 : N  (comment je "made by" korisnik)
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Comment> comments = new ArrayList<>();

    // User → Event : 1 : N  (event "belongs to" korisnik – kreator/organizator)
    @OneToMany(mappedBy = "organizer", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Event> events = new ArrayList<>();

    // User ↔ AccountRequest : 1 : 1
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    AccountRequest accountRequest;

    // User(Administrator) ↔ Location preko Manages : N : N (asocijativna klasa)
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Manages> manages = new ArrayList<>();*/
}
