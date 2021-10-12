package com.khodko.springforestry.repository;

import com.khodko.springforestry.entity.Forestry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForestryRepository extends CrudRepository<Forestry, Long> {

}
