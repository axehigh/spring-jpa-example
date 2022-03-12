package com.example.springjpa.business.broker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BrokerServiceIntegrationTest {

    @Autowired
    BrokerService brokerService;

    @Test
    void should_find_all_brokers() {
        List<BrokerEntity> all = brokerService.findAll();
        assertThat(all).hasSizeGreaterThan(0);
    }
}
