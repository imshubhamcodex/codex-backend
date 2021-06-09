package com.project.database.service;

import java.util.List;

import com.project.database.modal.RateDetails;
import com.project.database.repository.RateDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateDetailsService {
    
    @Autowired
    private RateDetailsRepository rateDetailsRepository;
    
    public List<RateDetails> getAllRateDetail(){
        return rateDetailsRepository.findAll();
    }

    public String setRateDetails(RateDetails rateDetails){
        rateDetailsRepository.save(rateDetails);
        return "RateDetails Saved";
    }
}
