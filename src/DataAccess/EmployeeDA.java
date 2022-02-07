/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import domain.Employee;
import domain.SalaryEmployee;
import java.util.ArrayList;

/**
 *
 * @author stoke
 */
public class EmployeeDA {
    private static ArrayList<Employee> employees = new ArrayList<Employee>();
    
    public static void initialize(){
        Employee emp1;
        
        emp1 = new SalaryEmployee();
        emp1.setAnnualSalary(57000);
        emp1.setEmployeeID(101);
        emp1.setFirstName("Bob");
        emp1.setLastName("Brown");
        emp1.setSsNumber(555551234);
        
        employees.add(emp1);
    }
    public static ArrayList<Employee> getEmployees(){
        return employees;
    }
}
