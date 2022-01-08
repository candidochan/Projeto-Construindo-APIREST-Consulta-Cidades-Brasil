package com.github.candidochan.citiesapi.entities.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<Thread.State, Long> {
}