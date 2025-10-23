package com.varunraom.esp_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varunraom.esp_System.model.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {

}
