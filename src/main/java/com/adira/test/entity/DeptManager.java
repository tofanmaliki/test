package com.adira.test.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dept_manager")
@Entity
public class DeptManager {

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="emp_no", referencedColumnName="emp_no")
    private Employees employees;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dept_no", referencedColumnName="dept_no")
    private Departments departments;

    private Date from_date;
    private Date to_date;
    
}
