package com.example.springjpa.business.insuredentity;


import com.example.springjpa.business.common.SkuldCrudRepository;

import java.util.List;

public interface InsuredEntityGroupRepository extends SkuldCrudRepository<InsuredEntityGroupEntity, Integer> {

    @Override
    List<InsuredEntityGroupEntity> findAll();
}
