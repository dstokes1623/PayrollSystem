/*
 * Class contains the main method for the application and will initialize the DAs as well as print out the information in the DAs
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
        ArrayList<Timecard> timecards;
        ArrayList<WithholdingType> withholdingTypes;
        ArrayList<Payroll> payroll;
        int i;
        
        PayrollSystemDA.initialize();
        
        employees = Employee.getEmployees();
        timecards = Timecard.getTimecards();
        withholdingTypes = WithholdingType.getWithholdingTypes();
        
        System.out.println("\nEMPLOYEES\n");
        for(i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i));
        }
        
        System.out.println("\nTIMECARDS\n");
        for(i = 0; i < timecards.size(); i++){
            System.out.println(timecards.get(i));
        }
        
        System.out.println("\nWITHHOLDING TYPES\n");
        for(i = 0; i < withholdingTypes.size(); i++){
            System.out.println(withholdingTypes.get(i));
        }
    }
}
