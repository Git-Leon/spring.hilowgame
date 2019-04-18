package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.HighLowGame;
import org.springframework.data.repository.CrudRepository;

public interface HighLowGameRepositary extends CrudRepository<HighLowGame, Long> {
}
