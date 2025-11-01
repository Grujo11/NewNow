package com.example.NewNow.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Comment {
    private Long id;
    private String text;
    private LocalDateTime createdAt;

    // Relationships
    private Review review;            // belongs to
    private Comment parentComment;    // replies to
    private List<Comment> replies = new ArrayList<>();
}

