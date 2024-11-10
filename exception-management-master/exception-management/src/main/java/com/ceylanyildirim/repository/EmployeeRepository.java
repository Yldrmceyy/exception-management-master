package com.ceylanyildirim.repository;

import com.ceylanyildirim.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
