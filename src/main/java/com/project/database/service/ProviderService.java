package com.project.database.service;

import java.util.List;

import com.project.database.modal.Provider;
import com.project.database.repository.ProviderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {
    
    @Autowired
    private ProviderRepository providerRepository ;

    public List<Provider> getAllProvider(){
        return providerRepository.findAll();
    }

    public String setProvider(Provider provider){
        providerRepository.save(provider);
        return "Provider Saved";
    }
}
