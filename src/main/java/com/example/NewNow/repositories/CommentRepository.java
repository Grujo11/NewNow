package com.example.NewNow.repositories;

import com.example.NewNow.model.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<Comment, Long> {
}
