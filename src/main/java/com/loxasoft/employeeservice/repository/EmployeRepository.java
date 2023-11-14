package com.loxasoft.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loxasoft.employeeservice.entity.Employee;

public interface EmployeRepository extends JpaRepository<Employee, Integer>{

}
