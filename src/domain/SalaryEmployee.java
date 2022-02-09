/*
 * This class is a subclass of Employee and will account for the employees that make an annual salary rather than an hourly rate
 */
package domain;

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
        return super.toString() + ", Annual Salary: " + annualSalary;
    }

    public SalaryEmployee(double annualSalary, int employeeID, String lastName, String firstName, long ssNumber) {
        super(employeeID, lastName, firstName, ssNumber);
        this.annualSalary = annualSalary;
    }
    
}
