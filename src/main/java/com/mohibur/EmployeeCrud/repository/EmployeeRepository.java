package com.mohibur.EmployeeCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohibur.EmployeeCrud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
