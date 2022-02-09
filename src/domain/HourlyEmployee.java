/*
 * This class is a subclass of Employee and will account for the employees that make an hourly rate rather than an annual salary
 */
package domain;

/**
 *
 * @author Dante Stokes
 */
public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double overtimeRate;

    public HourlyEmployee(double hourlyRate, int employeeID, String lastName, String firstName, long ssNumber) {
        super(employeeID, lastName, firstName, ssNumber);
        this.hourlyRate = hourlyRate;
        this.overtimeRate = hourlyRate * 1.5; 
        //instead of taking in overtime rate as a arg, set it mathematically so 
        //that the user doesn't have to do the math themselves. If they need to override default, setOvertimeRate can be used.
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Hourly Rate: " + hourlyRate + ", Overtime Rate: " + overtimeRate;
    }
}
