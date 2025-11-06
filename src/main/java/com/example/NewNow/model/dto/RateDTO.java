package com.example.NewNow.model.dto;

import lombok.Data;

@Data
public class RateDTO {
    private Long id;
    private Integer performance;
    private Integer soundAndLighting;
    private Integer venue;
    private Integer overallImpression;
}
