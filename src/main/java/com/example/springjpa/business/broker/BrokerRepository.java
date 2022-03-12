package com.example.springjpa.business.broker;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BrokerRepository extends CrudRepository<BrokerEntity,Long> {

    @Override
    List<BrokerEntity> findAll();
}
