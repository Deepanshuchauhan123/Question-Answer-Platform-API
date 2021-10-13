package io.java.questionanswerapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.java.questionanswerapi.dto.Company;
import io.java.questionanswerapi.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@RequestMapping(method = RequestMethod.POST, value = "/company")
	public void addCompany(@RequestBody Company company) {
		companyService.addCompany(company);
	}

}
