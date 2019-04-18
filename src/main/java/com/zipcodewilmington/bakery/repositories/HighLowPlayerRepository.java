package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.HighLowPlayer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HighLowPlayerRepository extends CrudRepository<HighLowPlayer, Long> {
}
