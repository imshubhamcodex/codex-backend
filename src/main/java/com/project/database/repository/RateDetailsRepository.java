package com.project.database.repository;

import com.project.database.modal.RateDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RateDetailsRepository extends JpaRepository<RateDetails,Integer> {
    
}
