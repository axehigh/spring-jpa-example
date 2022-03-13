package com.example.springjpa.business.appreference;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface BrokerRoleRepository extends Repository<BrokerRoleEntity,Long> {

    List<BrokerRoleEntity> findAll();


}
