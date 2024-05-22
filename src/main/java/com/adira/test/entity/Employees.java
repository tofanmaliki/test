package com.adira.test.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "employees")
@Entity
public class Employees {
    
    @Id
    @Column(length=11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emp_no;

    private Date birth_date;

    @Column(length = 14)
    private String first_name;

    @Column(length = 16)
    private String last_name;

    @Enumerated(EnumType.STRING)
    private Gender gender; 

    private Date hire_date;

}

enum Gender {
    M,F
}
