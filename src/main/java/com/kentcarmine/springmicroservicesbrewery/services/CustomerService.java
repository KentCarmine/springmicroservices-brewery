package com.kentcarmine.springmicroservicesbrewery.services;

import com.kentcarmine.springmicroservicesbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
