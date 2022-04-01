package com.peralta.financenow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peralta.financenow.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
