package com.zipcodewilmington.bakery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuffinRepository extends CrudRepository<Muffin, Long> {
}
