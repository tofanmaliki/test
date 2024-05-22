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

import com.adira.test.entity.Departments;
import com.adira.test.repository.DepartementRepository;

@RestController
@RequestMapping(value = "/departement")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DepartementController {

    @Autowired
	private DepartementRepository departementRepository;

    @PostMapping("/add")
	public Departments addDepartement(@RequestBody Departments departments) {
		return departementRepository.save(departments);
	}

    @GetMapping("/get/all")
	public List<Departments> getDataDepartemen() {
		return departementRepository.findAll();
	}


    @PutMapping("/update/{dept_no}")
	String updateDataEmployee(@PathVariable String dept_no,@RequestBody Departments departments) {
        departments.setDept_no(dept_no);
		if (!departementRepository.existsById(dept_no)) {
			return "Departement dengan dept_no " + dept_no + "tidak ada";
		}
		departementRepository.save(departments);
        return "Departement dengan dept_no " + dept_no + " berhasil di update";
	}

    @DeleteMapping("/delete/{dept_no}")
	String deleteDataEmployee(@PathVariable String dept_no) {
		if (!departementRepository.existsById(dept_no)) {
			return "Departement dengan dept_no " + dept_no + "gagal dihapus";
		}
		departementRepository.deleteById(dept_no);
        return "Departement dengan dept_no " + dept_no + " berhasil dihapus";
	}
}
