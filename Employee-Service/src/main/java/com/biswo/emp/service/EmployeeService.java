package com.biswo.emp.service;

import java.util.List;

import com.biswo.emp.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> findAll();

	Employee findById(Long id);

	Employee updateEmployee(Long id, Employee updated);

	String deleteById(Long id);

}
