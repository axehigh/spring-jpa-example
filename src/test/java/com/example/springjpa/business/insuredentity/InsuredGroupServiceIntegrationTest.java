package com.example.springjpa.business.insuredentity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class InsuredGroupServiceIntegrationTest {

    @Autowired
    InsuredService insuredService;


    @Test
    void should_insert_row() {
        String entityGroupName = getRandomName("Insured");
        Insured insuredEntityGroupEntity = Insured.builder()
                .entityGroupName(entityGroupName)
                .build();

        Insured save = insuredService.save(insuredEntityGroupEntity);

        assertThat(save.getEntityGroupName()).isEqualTo(entityGroupName);
        insuredService.delete(save);
    }


    @Test
    public void should_insert_children() {
        List<InsuredChild> children = new ArrayList<>();

        InsuredChild child1 = InsuredChild.builder().entityCode(getRandomName("G:")).build();
        InsuredChild child2 = InsuredChild.builder().entityCode(getRandomName("G:")).build();
        children.addAll(Arrays.asList(child1, child2));

        String entityGroupName = getRandomName("w/children");
        Insured insured = Insured.builder()
                .entityGroupName(entityGroupName)
                .childs(children)
                .build();

        insuredService.save(insured);
        children.forEach(x -> {
            x.setInsured(insured);
            insuredService.saveChild(x);
        });

        insuredService.delete(insured);

        Optional<Insured> byId = insuredService.findById(insured.getId());
        assertThat(byId).isEmpty();
    }

    private String getRandomName(String text) {
        String s = text + ":" + Math.random();
        return s.substring(0, 19);
    }
}
