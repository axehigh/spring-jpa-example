package com.example.springjpa.business.appreference;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class BrokerRoleRepositoryIntegrationTest {

     @Autowired
     BrokerRoleRepository brokerRoleRepository;

    @Test
    void should_find_all_broker_roles() {
        List<BrokerRoleEntity> all = brokerRoleRepository.findAll();
        assertThat(all).hasSize(2);
    }
}
