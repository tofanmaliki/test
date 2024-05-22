package com.adira.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adira.test.entity.Employees;
import com.adira.test.entity.Salaries;
import com.adira.test.repository.EmployeeRepository;
import com.adira.test.repository.SalaryRepository;



@RestController
@RequestMapping(value = "/salaries")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SalaryController {

    @Autowired
	private SalaryRepository salaryRepository;
    @Autowired
	private EmployeeRepository employeeRepository;

    @PostMapping("/add/{emp_no}")
	public Salaries addDepartement(@PathVariable Integer emp_no,@RequestBody Salaries salaries) { 
		return salaryRepository.save(salaries);
	}

    
    @GetMapping("/get/all")
	public List<Salaries> getDataEmployees() {
		return salaryRepository.findAll();
	}
    
}
