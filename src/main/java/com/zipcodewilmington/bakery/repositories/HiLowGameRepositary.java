package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.HiLowGame;
import org.springframework.data.repository.CrudRepository;

public interface HiLowGameRepositary extends CrudRepository<HiLowGame, Long> {
}
