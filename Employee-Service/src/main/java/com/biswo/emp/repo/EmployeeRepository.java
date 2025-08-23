package com.biswo.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biswo.emp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
