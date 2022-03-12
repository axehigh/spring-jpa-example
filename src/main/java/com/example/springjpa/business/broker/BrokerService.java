package com.example.springjpa.business.broker;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrokerService {

    final BrokerRepository brokerCrud;

    public BrokerService(BrokerRepository brokerCrud) {
        this.brokerCrud = brokerCrud;
    }

    public List<BrokerEntity> findAll() {
        return brokerCrud.findAll();
    }

}
