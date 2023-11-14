package com.loxasoft.employeeservice.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.loxasoft.employeeservice.dto.DepartamentDTO;
import com.loxasoft.employeeservice.dto.ResponseDTO;
import com.loxasoft.employeeservice.entity.Employee;
import com.loxasoft.employeeservice.repository.EmployeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeService {
	
private final EmployeRepository employeRepository;
  
private final RestTemplate restTemplate;

public Employee saveEmploye(Employee employee) {
	  return employeRepository.save(employee);
  }


public ResponseDTO getEmployeById(Integer id) {
	
	ResponseDTO responseDTO = new ResponseDTO();
	Employee employee = new Employee();
	
	employee = employeRepository.findById(id).get();
	
     ResponseEntity<DepartamentDTO> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/departaments" + employee.getDepartamentId(), DepartamentDTO.class);
     
     DepartamentDTO departamentDTO=responseEntity.getBody();
     
     responseDTO.setEmployee(employee);
     
     responseDTO.setDepartamentDTO(departamentDTO);
     
     return responseDTO;
     
     
    		 
    		 
}


}
