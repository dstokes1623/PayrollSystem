/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author stoke
 */
public class SalaryEmployee extends Employee {
    private double annualSalary;

    @Override
    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Annual Salary: " + annualSalary;
    }
    
}
