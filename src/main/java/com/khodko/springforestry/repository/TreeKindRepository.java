package com.khodko.springforestry.repository;

import com.khodko.springforestry.entity.TreeKind;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeKindRepository extends CrudRepository<TreeKind, Long> {

}
