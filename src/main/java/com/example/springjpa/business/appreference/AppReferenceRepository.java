package com.example.springjpa.business.appreference;

import com.example.springjpa.business.broker.BrokerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppReferenceRepository extends CrudRepository<AppReferenceEntity, Integer> {
    @Override
    List<AppReferenceEntity> findAll();
}
