package com.example.carApp.Repositories;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.carApp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
