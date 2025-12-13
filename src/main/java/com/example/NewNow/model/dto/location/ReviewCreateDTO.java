package com.example.NewNow.model.dto.location;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReviewCreateDTO {
    @NotNull
    private Integer eventCount;
    @NotNull
    private Boolean hidden;
}
