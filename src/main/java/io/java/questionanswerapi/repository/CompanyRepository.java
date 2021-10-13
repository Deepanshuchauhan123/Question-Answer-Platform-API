package io.java.questionanswerapi.repository;

import org.springframework.data.repository.CrudRepository;

import io.java.questionanswerapi.dto.Company;

public interface CompanyRepository extends CrudRepository<Company, Integer> {

}
