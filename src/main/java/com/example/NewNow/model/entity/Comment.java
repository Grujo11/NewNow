package com.example.NewNow.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Table(name = "users")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private LocalDateTime createdAt;

    // Relationships
    //private Review review;            // belongs to
    //private Comment parentComment;    // replies to
    //private List<Comment> replies = new ArrayList<>();


    // Comment → User (author) : N : 1
   /* @ManyToOne(optional = false)
    @JoinColumn(name = "author_id")
    User author;

    // Comment → Event : N : 1  ("belongs to" Event)
    @ManyToOne(optional = false)
    @JoinColumn(name = "event_id")
    Event event;

    // Comment ↔ Comment (replies to) : N : 1 (opcioni roditelj)
    @ManyToOne
    @JoinColumn(name = "parent_id")
    Comment parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Comment> replies = new ArrayList<>();*/
}

