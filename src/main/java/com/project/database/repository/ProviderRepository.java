package com.project.database.repository;

import com.project.database.modal.Provider;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider,Integer> {
    
}
