package com.khodko.springforestry.repository;

import com.khodko.springforestry.entity.ForestType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForestTypeRepository extends CrudRepository<ForestType, Long> {

}
