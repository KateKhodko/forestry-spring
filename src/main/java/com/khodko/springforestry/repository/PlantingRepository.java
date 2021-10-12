package com.khodko.springforestry.repository;

import com.khodko.springforestry.entity.Planting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantingRepository extends CrudRepository<Planting, Long> {

}
