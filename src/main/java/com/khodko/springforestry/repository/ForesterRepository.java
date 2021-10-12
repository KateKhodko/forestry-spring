package com.khodko.springforestry.repository;

import com.khodko.springforestry.entity.Forester;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForesterRepository extends CrudRepository<Forester, Long> {

}
