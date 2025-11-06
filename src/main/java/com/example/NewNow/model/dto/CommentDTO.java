package com.example.NewNow.model.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CommentDTO {
    private Long id;
    private String text;
    private LocalDateTime createdAt;
}
