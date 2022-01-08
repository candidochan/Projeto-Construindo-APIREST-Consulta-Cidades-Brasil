package com.github.candidochan.citiesapi.entities.repositories;

import com.github.candidochan.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
