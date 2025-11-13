package com.example.NewNow.repositories;

import com.example.NewNow.model.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location, Long> {
}
