package com.example.carApp.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.carApp.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
