package com.employee.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.api.dto.InputRequest;
import com.employee.api.model.Employee;
import com.employee.api.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody InputRequest<Employee> request) {
		return employeeService.saveEmployee(request);
	}

	@PutMapping("/updateEmployee/{id}/{salary}")
	public String updateEmployeeSalary(@PathVariable int id, @PathVariable double salary,
			@RequestBody InputRequest<Employee> request) {

		return employeeService.updateEmployee(id, salary, request);

	}
}
