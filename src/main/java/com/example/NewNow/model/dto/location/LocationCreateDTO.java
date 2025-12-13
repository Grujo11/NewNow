package com.example.NewNow.model.dto.location;

import lombok.Data;
import jakarta.validation.constraints.NotNull;



@Data
public class LocationCreateDTO {
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String address;
    @NotNull
    private String type;
}
