/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import DataAccess.EmployeeDA;
import java.util.ArrayList;

/**
 *
 * @author stoke
 */
public abstract class Employee {
    private int employeeID;
    private String lastName;
    private String firstName;
    private long ssNumber;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getSsNumber() {
        return ssNumber;
    }

    public void setSsNumber(long ssNumber) {
        this.ssNumber = ssNumber;
    }
    
    public double getAnnualSalary(){
        return 0.0;
    }
    
    public void setAnnualSalary(double a){
        
    }
    
    public static ArrayList<Employee> getEmployees(){
        return EmployeeDA.getEmployees();
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeID + ", Last Name: " + lastName + ", First Name: " + firstName + ", Social Security Number: " + ssNumber;
    }
}
