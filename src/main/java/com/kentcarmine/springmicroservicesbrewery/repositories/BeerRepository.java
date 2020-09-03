package com.kentcarmine.springmicroservicesbrewery.repositories;

import com.kentcarmine.springmicroservicesbrewery.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
