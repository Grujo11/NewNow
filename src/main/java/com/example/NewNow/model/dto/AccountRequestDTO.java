package com.example.NewNow.model.dto;

import com.example.NewNow.model.entity.RequestStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AccountRequestDTO {
    private Long id;
    private String email;
    private String password;
    private String address;
    private RequestStatus status;
    private LocalDate createdAt;
    private String rejectionReason;
}
