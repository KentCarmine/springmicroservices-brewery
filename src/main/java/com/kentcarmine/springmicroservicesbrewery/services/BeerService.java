package com.kentcarmine.springmicroservicesbrewery.services;

import com.kentcarmine.springmicroservicesbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
