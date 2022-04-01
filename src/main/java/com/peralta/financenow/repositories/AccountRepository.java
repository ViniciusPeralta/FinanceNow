package com.peralta.financenow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peralta.financenow.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
}
