package com.adira.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adira.test.entity.Departments;

public interface DepartementRepository extends JpaRepository<Departments, String>{

}