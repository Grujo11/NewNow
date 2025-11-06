package com.example.NewNow.model.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class UserDTO {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private LocalDate birthday;
    private String address;
    private String city;
}
