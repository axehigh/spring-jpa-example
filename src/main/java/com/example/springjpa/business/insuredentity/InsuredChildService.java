package com.example.springjpa.business.insuredentity;

import com.example.springjpa.business.common.SkuldCrudRepository;
import com.example.springjpa.business.common.SkuldCrudService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class InsuredChildService extends SkuldCrudService {

    private final InsuredChildRepository insuredEntityGroupingRepository;

    public InsuredChildService(InsuredChildRepository insuredEntityGroupChildRepository) {
        super(insuredEntityGroupChildRepository);
        this.insuredEntityGroupingRepository = insuredEntityGroupChildRepository;
    }

    public List<InsuredChild> findall() {
        return insuredEntityGroupingRepository.findAll();
    }


    public Optional<InsuredChild> findById(Integer reinsurerId) {
        return insuredEntityGroupingRepository.findById(reinsurerId);
    }

    public void delete(InsuredChild entity) {
        insuredEntityGroupingRepository.delete(entity);
    }

    public SkuldCrudRepository getRepository() {
        return insuredEntityGroupingRepository;
    }

    public InsuredChild save(InsuredChild insuredChild) {
        return insuredEntityGroupingRepository.save(insuredChild);
    }

//    public List<InsuredChild> findByParentId(Integer parentId) {
//        return insuredEntityGroupingRepository.findByEntityGroupId(parentId);
//    }
}
