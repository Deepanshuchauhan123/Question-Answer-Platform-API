package io.java.questionanswerapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.questionanswerapi.dto.Company;
import io.java.questionanswerapi.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	public void addCompany(Company company) {
		companyRepository.save(company);
	}

}
