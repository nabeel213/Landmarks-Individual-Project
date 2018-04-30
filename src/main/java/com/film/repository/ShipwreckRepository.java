package com.film.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.film.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
