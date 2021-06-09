package com.project.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.project.database.modal.Organization;
import com.project.database.repository.OrganizationRepository;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;
    
    public List<Organization> getAllOrganization(){
        return organizationRepository.findAll();
    }

    public String setOrganization(Organization organization){
        organizationRepository.save(organization);
        return "Organization Saved";
    }
}
