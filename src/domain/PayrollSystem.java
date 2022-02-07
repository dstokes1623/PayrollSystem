/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import DataAccess.PayrollSystemDA;
import java.util.ArrayList;


public class PayrollSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Employee> employees;
        int i;
        
        PayrollSystemDA.initialize();
        
        employees = Employee.getEmployees();
        
        System.out.println("\nEMPLOYEES\n");
        for(i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i));
        }
    }
    
}
