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


}
