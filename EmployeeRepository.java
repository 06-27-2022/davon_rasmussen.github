package com.revature.repository;

import com.revature.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAllEmployees();

//    Inserts a new record into the employee table on my db.
       void save(Employee employee);

       void update(Employee employee);

//       Finds a single employee record by its id.
       Employee findById(int id);



}
