package com.example.carApp.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.carApp.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
