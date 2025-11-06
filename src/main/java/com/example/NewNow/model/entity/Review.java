package com.example.NewNow.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Table(name = "users")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createdAt;
    private Integer eventCount;
    private Boolean hidden;

    // Relationships
    //private User author;        // made by
    //private Location location;  // belongs to
    //private Rate rate;          // with rating (1-1)
    //private List<Comment> comments = new ArrayList<>();

    // Review → User (author) : N : 1
    /*@ManyToOne(optional = false)
    @JoinColumn(name = "author_id")
    User author;

    // Review → Event : N : 1  ("for a" Event)
    @ManyToOne(optional = false)
    @JoinColumn(name = "event_id")
    Event event;

    // Review ↔ Rate : 1 : 1 (svaki review ima tačno jedan rating)
    @OneToOne(mappedBy = "review", cascade = CascadeType.ALL, orphanRemoval = true, optional = false)
    Rate rate;*/
}

