package com.kentcarmine.springmicroservicesbrewery.services;

import com.kentcarmine.springmicroservicesbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Bob Smith")
                .build();
    }
}
