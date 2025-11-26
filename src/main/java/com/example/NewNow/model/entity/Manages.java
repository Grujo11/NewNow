package com.example.NewNow.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


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


    @OneToOne
    private Location location;

    @OneToOne
    private User user;


}

