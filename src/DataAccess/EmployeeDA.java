/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import domain.Employee;
import domain.HourlyEmployee;
import domain.SalaryEmployee;
import java.util.ArrayList;

/**
 *
 * @author stoke
 */
public class EmployeeDA {
    private static ArrayList<Employee> employees = new ArrayList<Employee>();
    
    public static void initialize(){
        //Salary employees
        Employee emp1 = new SalaryEmployee(57000, 101,"Brown", "Bob", 555551234);
        Employee emp2 = new SalaryEmployee(59000, 102,"Smith", "Angie", 123456789);
        
        Employee emp3 = new HourlyEmployee(18.50, 102,"Robinson", "Alex", 456123456);
        Employee emp4 = new HourlyEmployee(18.50, 102,"Madison", "Mikayla", 789015678);
        
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
    }
    public static ArrayList<Employee> getEmployees(){
        return employees;
    }
    public static void addEmployee(Employee emp){
        employees.add(emp);
    }
    public static ArrayList<Employee> getEmployeesByID(int empID){
            ArrayList<Employee> employeesByID = new ArrayList<Employee>();
    
            for(Employee employee : employees){
                if(employee.getEmployeeID() == empID){
                    employeesByID.add(employee);
                }
            }
            return employeesByID;
        }
    }
}
