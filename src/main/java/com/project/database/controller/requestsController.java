package com.project.database.controller;

import java.util.List;

import com.project.database.modal.Organization;
import com.project.database.modal.Provider;
import com.project.database.modal.RateDetails;
import com.project.database.modal.Services;
import com.project.database.service.OrganizationService;
import com.project.database.service.ProviderService;
import com.project.database.service.RateDetailsService;
import com.project.database.service.ServicesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api-pod8")
public class requestsController {

    @Autowired
    private OrganizationService organizationService;

    @Autowired
    private ProviderService providerService;

    @Autowired
    private RateDetailsService rateDetailsService;

    @Autowired
    private ServicesService servicesService;

    @GetMapping(value = "/")
    public String index() {
        return "Server is online, Enjoy your day!";
    }

    @GetMapping(value = "/get-all-organization")
    public List<Organization> getAllOrganizations() {
        return organizationService.getAllOrganization();
    }

    @GetMapping(value = "/get-all-providers")
    public List<Provider> getAllProviders() {
        return providerService.getAllProvider();
    }

    @GetMapping(value = "/get-all-rates")
    public List<RateDetails> getAllRateDetails() {
        return rateDetailsService.getAllRateDetail();
    }

    @GetMapping(value = "/get-all-services")
    public List<Services> getAllServices() {
        return servicesService.getAllService();
    }

    @PostMapping(value = "/set-provider")
    public String setProvider(@RequestBody final Provider provider) {
        return providerService.setProvider(provider);
    }

    @PostMapping(value = "/set-rate")
    public String setRateDetails(@RequestBody final RateDetails rateDetails) {
        return rateDetailsService.setRateDetails(rateDetails);
    }

    @PostMapping(value = "/set-organization")
    public String setOrganization(@RequestBody final Organization organization) {
        return organizationService.setOrganization(organization);
    }

}
