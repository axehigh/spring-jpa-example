package com.example.springjpa.business.appreference;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppReferenceServiceIntegrationTest {

    @Autowired
    AppReferenceService appReferenceService;

    @Test
    void should_find_all() {
        List<AppReferenceEntity> all = appReferenceService.findAll();
        assertThat(all).hasSizeGreaterThan(1);
    }
}
