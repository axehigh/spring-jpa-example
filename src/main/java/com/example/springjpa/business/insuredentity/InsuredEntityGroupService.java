package com.example.springjpa.business.insuredentity;

import com.example.springjpa.business.common.SkuldCrudRepository;
import com.example.springjpa.business.common.SkuldCrudService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class InsuredEntityGroupService extends SkuldCrudService {

    private final InsuredEntityGroupRepository insuredEntityGroupRepository;

    private final InsuredEntityGroupingService insuredEntityGroupingService;

    public InsuredEntityGroupService(InsuredEntityGroupRepository insuredEntityGroupRepository, InsuredEntityGroupingService insuredEntityGroupingService) {
        super(insuredEntityGroupRepository);
        this.insuredEntityGroupRepository = insuredEntityGroupRepository;
        this.insuredEntityGroupingService = insuredEntityGroupingService;
    }

    public List<InsuredEntityGroupEntity> findall() {
        return insuredEntityGroupRepository.findAll();
    }


    public Optional<InsuredEntityGroupEntity> findById(Integer reinsurerId) {
        return insuredEntityGroupRepository.findById(reinsurerId);
    }

    public void delete(InsuredEntityGroupEntity entity) {
        insuredEntityGroupRepository.delete(entity);
    }

    public SkuldCrudRepository getRepository() {
        return insuredEntityGroupRepository;
    }

    public void deleteChildren(Integer parentId) {
        insuredEntityGroupingService.findByParentId(parentId).forEach(child -> insuredEntityGroupingService.delete(child));
    }
}
