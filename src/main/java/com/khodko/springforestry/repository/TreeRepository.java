package com.khodko.springforestry.repository;

import com.khodko.springforestry.entity.Tree;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository extends CrudRepository<Tree, Long> {

}
