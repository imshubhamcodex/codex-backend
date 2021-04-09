package com.project.database.controller;

import java.util.List;

import com.project.database.modal.Provider;
import com.project.database.modal.RateDetails;
import com.project.database.modal.Services;
import com.project.database.repository.ProviderRepository;
import com.project.database.repository.RateDetailsRepository;
import com.project.database.repository.ServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")
public class requestsController {
    
    @Autowired
    ProviderRepository providerRepository;

    @Autowired
    RateDetailsRepository rateDetailsRepository;

    @Autowired
    ServiceRepository serviceRepository;

    @GetMapping(value ="/")
    public String index(){
        return "Server is online, Enjoy your day!";
    }

    @GetMapping(value = "/getAllProviders")
    public List<Provider> getAllProviders(){
        return providerRepository.findAll();
    }

    @GetMapping(value = "/getAllRateDetails")
    public List<RateDetails> getAllRateDetails(){
        return rateDetailsRepository.findAll();
    }

    @GetMapping(value = "/getAllServices")
    public List<Services> getAllServices(){
        return serviceRepository.findAll();
    }

    @PostMapping(value = "/setProvider")
    public String setProvider(@RequestBody final Provider provider){
        providerRepository.save(provider);
        return "Provider Saved";
    }

    @PostMapping(value = "/setRateDetails")
    public String setRateDetails(@RequestBody final RateDetails rateDetails){
        rateDetailsRepository.save(rateDetails);
        return "RateDetails Saved";
    }


}
