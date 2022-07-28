package com.revature.repository;

import com.revature.model.Employee;
import com.revature.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{

    public List<Employee> findAllEmployees() {

        Connection conn = null;
        Statement stmt = null;
        ResultSet set = null;

        List<Employee> employees = new ArrayList<>();

        final String SQL = "select * from employee";


        try{
            // Connection to the db
            conn = ConnectionUtil.getNewConnection();

            stmt = conn.createStatement();
            // The ResultSet will store the results of running a query. ResultSet has to be extracted.
            set = stmt.executeQuery(SQL);

            while(set.next()) {
                //  while there is another record in the result set, lets print the contents of the rows.

                Employee employee = new Employee(set.getInt(1),
                        set.getString(2),
                        set.getString(3),
                        set.getInt(4),
                        set.getString(5));

                employees.add(employee);

            }

        }catch(SQLException e) {
            e.printStackTrace();
        }finally{

            try {
                assert conn != null;
                conn.close();
                assert stmt != null;
                stmt.close();
                assert set != null;
                set.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        return employees;
    }

    @Override
    public void save(Employee employee) {

        Connection conn = null;
        PreparedStatement stmt = null;
        final String SQL = "insert into employee values(default, ?, ?, ?, ?, ?)";
        try {
            conn = ConnectionUtil.getNewConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, employee.getEmpFirstName());
            stmt.setString(2, employee.getEmpLastName());
            stmt.setInt(3, employee.getEmpAge());
            stmt.setString(4, employee.getEmpCountry());
            stmt.execute();

        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                stmt.close();

            }catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void update(Employee employee) {
    Connection conn = null;
    PreparedStatement stmt = null;
    final String SQL = "update employee set empCountry = ? where id = ?";
        try{

            conn = ConnectionUtil.getNewConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, employee.getEmpCountry());
            stmt.setInt(2, employee.getId());
            stmt.execute();

        }catch(SQLException e){
           e.printStackTrace();
        }finally{
            try {
                conn.close();
                stmt.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public Employee findById(int id) {
       Employee employee = null;

       Connection conn = null;
       PreparedStatement stmt = null;
       ResultSet set = null;
        final String SQL = "Select * from employee where id = ?";
       try{
        conn = ConnectionUtil.getNewConnection();
        stmt = conn.prepareStatement(SQL);
        stmt.setInt(1, id);
        set = stmt.executeQuery();

        if(set.next()){
            employee = new Employee(set.getInt(1),
                    set.getString(2),
                    set.getString(3),
                    set.getInt(4),
                    set.getString(5));
        }

       }catch(SQLException e){
           e.printStackTrace();
       }finally {
           try{
               conn.close();
               stmt.close();
               set.close();
           }catch(SQLException e){
               e.printStackTrace();
           }
       }


        return employee;

    }

}

