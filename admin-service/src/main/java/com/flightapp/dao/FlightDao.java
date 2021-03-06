package com.flightapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.entity.Flight;

@Repository
public interface FlightDao extends JpaRepository<Flight, Integer> {
	

}
