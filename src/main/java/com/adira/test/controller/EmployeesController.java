package com.adira.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adira.test.entity.Employees;
import com.adira.test.repository.EmployeeRepository;

@RestController
@RequestMapping(value = "/employees")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeesController {
    

    @Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("/add")
	public Employees addEmployees(@RequestBody Employees employees) {
		return employeeRepository.save(employees);
	}

    @GetMapping("/get/all")
	public List<Employees> getDataEmployees() {
		return employeeRepository.findAll();
	}

    @PutMapping("/update/{emp_no}")
	String updateDataEmployee(@PathVariable Integer emp_no,@RequestBody Employees employees) {
        employees.setEmp_no(emp_no);
		if (!employeeRepository.existsById(emp_no)) {
			return "Employee dengan " + emp_no + "tidak ada";
		}
		employeeRepository.save(employees);
        return "Employee dengan " + emp_no + " berhasil di update";
	}


    @DeleteMapping("/delete/{emp_no}")
	String deleteDataEmployee(@PathVariable Integer emp_no) {
		if (!employeeRepository.existsById(emp_no)) {
			return "Employee dengan " + emp_no + "gagal dihapus";
		}
		employeeRepository.deleteById(emp_no);
        return "Employee dengan " + emp_no + " berhasil dihapus";
	}

}
