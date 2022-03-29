package com.example.springjpa.business.insuredentity;


import com.example.springjpa.business.common.SkuldCrudRepository;

import java.util.List;

public interface InsuredEntityGroupingRepository extends SkuldCrudRepository<InsuredEntityGroupingEntity, Integer> {

    List<InsuredEntityGroupingEntity> findByEntityGroupId(Integer entityGroupId);

    @Override
    List<InsuredEntityGroupingEntity> findAll();
}
