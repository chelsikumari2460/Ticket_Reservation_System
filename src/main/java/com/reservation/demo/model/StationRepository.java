package com.reservation.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, String> {
	
}
