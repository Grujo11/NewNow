package com.example.NewNow.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


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



    @ManyToOne
    private User user;

    @ManyToOne
    private Location location;

    @ManyToOne
    private Event event;

    @OneToOne
    private Comment comment;

    @OneToOne
    private Rate rate;

}

