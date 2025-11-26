package com.example.NewNow.repositories;

import com.example.NewNow.model.entity.Manages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ManagesRepository extends JpaRepository<Manages, Integer> {
}
