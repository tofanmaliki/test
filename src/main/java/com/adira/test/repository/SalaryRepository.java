package com.adira.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adira.test.entity.Salaries;

public interface SalaryRepository extends JpaRepository<Salaries, Integer>{
}
