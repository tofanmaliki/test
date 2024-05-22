package com.adira.test.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "titles")
@Entity
public class Titles {

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="emp_no", referencedColumnName="emp_no")
    private Employees employees;

    @Column(length=50,nullable=false)
    private String dept_name;

    private Date from_date;
    private Date to_date;

}
