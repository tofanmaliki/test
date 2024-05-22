package com.adira.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adira.test.entity.Employees;
import java.util.List;



public interface EmployeeRepository extends JpaRepository<Employees, Integer>{
}