package com.biswo.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biswo.emp.entity.Employee;
import com.biswo.emp.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		
		return repo.findAll();
	}

	@Override
	public Employee findById(Long id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("No employee found"));
	}

	@Override
	public Employee updateEmployee(Long id, Employee updated) {
		Employee emp = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        emp.setName(updated.getName());
        emp.setDepartment(updated.getDepartment());
        emp.setSalary(updated.getSalary());
        return repo.save(emp);
	}

	@Override
	public String deleteById(Long id) {
		Employee e = repo.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
		repo.delete(e);
		return "Deleted Successfully...";
	}

}
