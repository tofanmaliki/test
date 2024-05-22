package com.adira.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "departments")
@Entity
public class Departments {
    @Id
    @Column(length=4)
    private String dept_no;

    @Column(length=40,nullable=false)
    private String dept_name;
}
