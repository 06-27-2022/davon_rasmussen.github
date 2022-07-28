package com.revature;


import com.revature.model.Employee;
import com.revature.repository.EmployeeRepositoryImpl;

import java.util.List;


public class JDBCOverview {


    public static void main(String[] args) {

        EmployeeRepositoryImpl employeeRepository = new EmployeeRepositoryImpl();

        Employee newEmployee = new Employee(0, "James", "London", 27, "South Africa");
//        employeeRepository.save(newEmployee);
        List<Employee> employees = employeeRepository.findAllEmployees();

           for(Employee individual : employees) {
               System.out.println(individual);
           }

//           Employee employeeToUpdate = new Employee(11, "James", "London", 28, "Brazil");
//                employeeRepository.update(employeeToUpdate);

        Employee retrieveEmployee = employeeRepository.findById(3);
           System.out.print(retrieveEmployee);

    }

}
