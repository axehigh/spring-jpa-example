package com.example.springjpa.business.insuredentity;


import com.example.springjpa.business.common.SkuldCrudRepository;

import java.util.List;

public interface InsuredChildRepository extends SkuldCrudRepository<InsuredChild, Integer> {

//    List<InsuredChild> findByEntityGroupId(Integer entityGroupId);

    @Override
    List<InsuredChild> findAll();
}
