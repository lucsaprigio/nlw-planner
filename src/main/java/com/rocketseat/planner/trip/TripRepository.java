package com.rocketseat.planner.trip;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

//Aqui vai ser o local onde colocamos as funçõespara buscar no banco de dados (find, update).
public interface TripRepository extends JpaRepository<Trip, UUID> {

}
