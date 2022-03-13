package com.example.springjpa.business.broker;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrokerService {

    final BrokerRepository brokerRepository;

    public BrokerService(BrokerRepository brokerCrud) {
        this.brokerRepository = brokerCrud;
    }

    public List<BrokerEntity> findAll() {
        return brokerRepository.findAll();
    }

    public BrokerEntity save(BrokerEntity broker) {
        return brokerRepository.save(broker);
    }
}
