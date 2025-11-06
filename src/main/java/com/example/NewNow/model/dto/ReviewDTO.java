package com.example.NewNow.model.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ReviewDTO {
    private Long id;
    private LocalDateTime createdAt;
    private Integer eventCount;
    private Boolean hidden;
}
