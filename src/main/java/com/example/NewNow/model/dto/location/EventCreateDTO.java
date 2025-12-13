package com.example.NewNow.model.dto.location;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
@Data
public class EventCreateDTO {
    @NotNull
    private String name;
    @NotNull
    private String address;
    @NotNull
    private String type;
    @NotNull
    private LocalDate date;
    @NotNull
    private Double price;
    @NotNull
    private Boolean recurrent;
}
