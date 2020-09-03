package com.kentcarmine.springmicroservicesbrewery.web.controller;

import com.kentcarmine.springmicroservicesbrewery.services.BeerService;
import com.kentcarmine.springmicroservicesbrewery.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

//    private final BeerService beerService;

//    @Autowired
//    public BeerController(BeerService beerService) {
//        this.beerService = beerService;
//    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
//        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
        // TODO: Impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
//        BeerDto savedDto = beerService.saveNewBeer(beerDto);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString()); // TODO: Add hostname to url
//
//        return new ResponseEntity(headers, HttpStatus.CREATED);

        // TODO: Impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
//        beerService.updateBeer(beerId, beerDto);
//
//        return new ResponseEntity(HttpStatus.NO_CONTENT);

        // TODO: Impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

//    @DeleteMapping("/{beerId}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteBeer(@PathVariable("beerId") UUID beerId) {
//        beerService.deleteById(beerId);
//    }

}
