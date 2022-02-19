/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author stoke
 */
public class Payroll {
    private Date date;
    private int employeeID;
    private double grossPay;
    private double totalDeductions;
    private double netPay;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }
    
    public void calculatePayroll(Date weekEnding){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(weekEnding);

        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH)-6);
        Date weekBefore = calendar.getTime();
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Employee ID: " + employeeID + ", Gross Pay: " + grossPay + ", Total Deductions: " + totalDeductions + ", Net Pay: " + netPay;
    }
    
    
}
