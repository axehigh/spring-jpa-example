package com.example.springjpa.business.appreference;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrokerRoleService {

    final BrokerRoleRepository brokerRoleRepository;

    public BrokerRoleService(BrokerRoleRepository brokerRoleRepository) {
        this.brokerRoleRepository = brokerRoleRepository;
    }

    public List<BrokerRoleEntity> findAll() {
        return brokerRoleRepository.findAll();
    }
}
