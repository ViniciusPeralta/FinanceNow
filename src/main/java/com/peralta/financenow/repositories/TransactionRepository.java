package com.peralta.financenow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peralta.financenow.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
}
