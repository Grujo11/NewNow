package com.example.NewNow.model;

import java.time.LocalDate;

public class AccountRequest {
    private Long id;
    private String email;
    private String password;
    private String address;
    private RequestStatus status;
    private LocalDate createdAt;
    private String rejectionReason;
}
