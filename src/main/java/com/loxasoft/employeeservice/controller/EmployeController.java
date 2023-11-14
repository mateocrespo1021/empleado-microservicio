package com.loxasoft.employeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loxasoft.employeeservice.dto.ResponseDTO;
import com.loxasoft.employeeservice.entity.Employee;
import com.loxasoft.employeeservice.service.EmployeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employes")
@AllArgsConstructor
public class EmployeController {
   private final EmployeService employeService;
   

   @PostMapping
   public Employee saveEmploye(@RequestBody Employee employee) {
	   return employeService.saveEmploye(employee);
   }
   
   @GetMapping("/{id}")
   public ResponseDTO getEmployeById(@PathVariable Integer id) {
	   return employeService.getEmployeById(id);
   }
   
   
   
   
}
