/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

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
    
    public Payroll(Date date, int employeeID, double grossPay, double totalDeductions, double netPay) {
        this.date = date;
        this.employeeID = employeeID;
        this.grossPay = grossPay;
        this.totalDeductions = totalDeductions;
        this.netPay = netPay;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Employee ID: " + employeeID + ", Gross Pay: " + grossPay + ", Total Deductions: " + totalDeductions + ", Net Pay: " + netPay;
    }
    
    
}
