package com.example.NewNow.repositories;

import com.example.NewNow.model.entity.AccountRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRequestRepository extends JpaRepository<AccountRequest, Long> {
}
