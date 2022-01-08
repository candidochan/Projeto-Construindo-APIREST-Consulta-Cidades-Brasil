package com.github.candidochan.citiesapi.entities.resources;

import com.github.candidochan.citiesapi.entities.Country;
import com.github.candidochan.citiesapi.entities.repositories.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryResource {
    private final CountryRepository repository;

    public CountryResource(final CountryRepository repository){
        this.repository=repository;
    }
    @GetMapping("/countries")
    public List<Country> countries() {

        return repository.findAll();
    }
}
