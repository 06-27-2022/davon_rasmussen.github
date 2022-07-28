package com.revature.model;

import java.util.Objects;

public class Employee {

    private int id;
    private String empFirstName;
    private String empLastName;
    private int empAge;
    private String empCountry;

    public Employee() {
        super();
    }

    public Employee(int id, String empFirstName, String empLastName, int empAge, String empCountry) {
        super();
        this.id = id;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empAge = empAge;
        this.empCountry = empCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpCountry() {
        return empCountry;
    }

    public void setEmpCountry(String empCountry) {
        this.empCountry = empCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && empAge == employee.empAge && empFirstName.equals(employee.empFirstName)
                && empLastName.equals(employee.empLastName) && empCountry.equals(employee.empCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, empFirstName, empLastName, empAge, empCountry);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empAge=" + empAge +
                ", empCountry='" + empCountry + '\'' +
                '}';
    }
}
