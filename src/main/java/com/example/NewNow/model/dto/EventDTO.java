package com.example.NewNow.model.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class EventDTO {
    private Long id;
    private String name;
    private String address;
    private String type;
    private LocalDate date;
    private Double price;
    private Boolean recurrent;
}
