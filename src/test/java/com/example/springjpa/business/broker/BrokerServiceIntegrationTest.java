package com.example.springjpa.business.broker;

import com.example.springjpa.business.appreference.AppReferenceService;
import com.example.springjpa.business.appreference.BrokerRoleEntity;
import com.example.springjpa.business.appreference.BrokerRoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BrokerServiceIntegrationTest {

    @Autowired
    BrokerService brokerService;

    @Autowired
    BrokerRoleRepository brokerRoleRepository;

    @Test
    void should_find_all_brokers() {
        List<BrokerEntity> all = brokerService.findAll();
        assertThat(all).hasSizeGreaterThan(0);
    }

    @Test
    public void should_save_broker() {

        List<BrokerRoleEntity> roles = brokerRoleRepository.findAll();

        BrokerEntity broker = new BrokerEntity();
        broker.setName("Unit Test Broker");
        broker.setBrokerRole(roles.get(0).getCode());
        broker.setRole(roles.get(1));

        brokerService.save(broker);
    }
}
