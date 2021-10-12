package com.khodko.springforestry.repository;

import com.khodko.springforestry.entity.Village;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepository extends CrudRepository<Village, Long> {

}
