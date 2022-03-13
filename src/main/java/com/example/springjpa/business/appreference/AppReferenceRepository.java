package com.example.springjpa.business.appreference;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppReferenceRepository extends CrudRepository<AppReferenceEntity, Integer> {
    @Override
    List<AppReferenceEntity> findAll();
}
