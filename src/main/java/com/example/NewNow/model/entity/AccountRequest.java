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

public class AccountRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String address;
    private RequestStatus status;
    private LocalDate createdAt;
    private String rejectionReason;


   // @OneToOne(optional = false)
    //@JoinColumn(name = "user_id", unique = true)
   // User user;
}
