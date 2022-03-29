package com.example.springjpa.business.common;


public class SkuldCrudService<T extends HasEnteredByUserId> {

    SkuldCrudRepository skuldCrudRepository;

    public SkuldCrudService(SkuldCrudRepository skuldCrudRepository) {
        this.skuldCrudRepository = skuldCrudRepository;
    }

}
