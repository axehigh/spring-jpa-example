package com.example.springjpa.business.insuredentity;

import com.example.springjpa.business.common.SkuldCrudRepository;
import com.example.springjpa.business.common.SkuldCrudService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class InsuredEntityGroupingService extends SkuldCrudService {

    private final InsuredEntityGroupingRepository insuredEntityGroupingRepository;

    public InsuredEntityGroupingService(InsuredEntityGroupingRepository insuredEntityGroupingRepository) {
        super(insuredEntityGroupingRepository);
        this.insuredEntityGroupingRepository = insuredEntityGroupingRepository;
    }

    public List<InsuredEntityGroupingEntity> findall() {
        return insuredEntityGroupingRepository.findAll();
    }


    public Optional<InsuredEntityGroupingEntity> findById(Integer reinsurerId) {
        return insuredEntityGroupingRepository.findById(reinsurerId);
    }

    public void delete(InsuredEntityGroupingEntity entity) {
        insuredEntityGroupingRepository.delete(entity);
    }

    public SkuldCrudRepository getRepository() {
        return insuredEntityGroupingRepository;
    }

    public List<InsuredEntityGroupingEntity> findByParentId(Integer parentId) {
        return insuredEntityGroupingRepository.findByEntityGroupId(parentId);
    }
}
