package com.example.springjpa.business.insuredentity;


import com.example.springjpa.business.common.SkuldCrudRepository;

import java.util.List;

public interface InsuredRepository extends SkuldCrudRepository<Insured, Integer> {

    @Override
    List<Insured> findAll();
}
