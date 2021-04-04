package com.project.database.repository;

import com.project.database.modal.Services;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Services,Integer> {
    
}
