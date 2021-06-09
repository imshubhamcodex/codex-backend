package com.project.database.service;

import java.util.List;

import com.project.database.modal.Services;
import com.project.database.repository.ServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesService {
    
    @Autowired
    private ServiceRepository serviceRepository;

    public List<Services> getAllService(){
        return serviceRepository.findAll();
    }
}
