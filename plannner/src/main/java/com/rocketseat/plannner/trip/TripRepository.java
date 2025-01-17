package com.rocketseat.plannner.trip;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface TripRepository extends JpaRepository<Trip, UUID> {
}
