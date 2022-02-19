/*
 *This class is a superclass that serves as an interface for hourly and salary employees
 */
package domain;

import DataAccess.EmployeeDA;
import java.util.ArrayList;

/**
 *
 * @author Dante Stokes
 */
public abstract class Employee {
    private int employeeID;
    private String lastName;
    private String firstName;
    private long ssNumber;

    public Employee(int employeeID, String lastName, String firstName, long ssNumber) {
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssNumber = ssNumber;
    }

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
    
    public double getHourlyRate(){
        return 0.0;
    }
    
    public void setHourlyRate(){
    }
    
    public double getOvertimeRate(){
        return 0.0;
    }

    public void setOvertimeRate(){}

    public double calculateGrossPay(){
        return 0.0;
    }
    public double calculateGrossPay(double hoursWorked, double overtimeHours){
        return 0.0;
    }
    
    public static ArrayList<Employee> getEmployees(){
        return EmployeeDA.getEmployees();
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeID + ", Last Name: " + lastName + ", First Name: " + firstName + ", Social Security Number: " + ssNumber;
    }
}
