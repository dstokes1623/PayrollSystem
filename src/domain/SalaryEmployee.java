/*
 * This class is a subclass of Employee and will account for the employees that make an annual salary rather than an hourly rate
 */
package domain;

import java.text.NumberFormat;

/**
 *
 * @author Dante Stokes
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
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String annualSalary = formatter.format(this.annualSalary);
        return super.toString() + ", Annual Salary: " + annualSalary;
    }

    public SalaryEmployee(double annualSalary, int employeeID, String lastName, String firstName, long ssNumber) {
        super(employeeID, lastName, firstName, ssNumber);
        this.annualSalary = annualSalary;
    }
    
    @Override
    public double calculateGrossPay(){
        return this.annualSalary / 52;
    }
}
