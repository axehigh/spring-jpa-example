package com.example.springjpa.business.appreference;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppReferenceService {

    final AppReferenceRepository appReferenceRepository;

    public AppReferenceService(AppReferenceRepository appReferenceRepository) {
        this.appReferenceRepository = appReferenceRepository;
    }

    public List<AppReferenceEntity> findAll() {
        List<AppReferenceEntity> all = appReferenceRepository.findAll();
        return all;
    }
}
