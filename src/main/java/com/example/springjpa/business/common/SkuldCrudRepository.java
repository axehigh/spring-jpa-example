package com.example.springjpa.business.common;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SkuldCrudRepository<T extends HasEnteredByUserId, ID> extends CrudRepository<T, ID> {



}
