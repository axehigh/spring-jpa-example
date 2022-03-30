package com.example.springjpa.business.insuredentity;

import com.example.springjpa.business.common.SkuldCrudRepository;
import com.example.springjpa.business.common.SkuldCrudService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class InsuredService extends SkuldCrudService {

    private final InsuredRepository insuredEntityGroupRepository;

    private final InsuredChildService insuredEntityGroupingService;

    public InsuredService(InsuredRepository insuredEntityGroupRepository, InsuredChildService insuredEntityGroupingService) {
        super(insuredEntityGroupRepository);
        this.insuredEntityGroupRepository = insuredEntityGroupRepository;
        this.insuredEntityGroupingService = insuredEntityGroupingService;
    }

    public List<Insured> findall() {
        return insuredEntityGroupRepository.findAll();
    }


    public Optional<Insured> findById(Integer reinsurerId) {
        return insuredEntityGroupRepository.findById(reinsurerId);
    }

    public Insured save(Insured entity) {
        return insuredEntityGroupRepository.save(entity);
    }

    public void delete(Insured entity) {
        insuredEntityGroupRepository.delete(entity);
    }

    public SkuldCrudRepository getRepository() {
        return insuredEntityGroupRepository;
    }

//    public void deleteChildren(Integer parentId) {
//        insuredEntityGroupingService.findByParentId(parentId).forEach(child -> insuredEntityGroupingService.delete(child));
//    }

    public InsuredChild saveChild(InsuredChild insuredChild) {
        return insuredEntityGroupingService.save(insuredChild);
    }
}
