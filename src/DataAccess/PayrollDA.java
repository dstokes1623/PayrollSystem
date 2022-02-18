/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import domain.Payroll;
import java.util.ArrayList;

/**
 *
 * @author stoke
 */
public class PayrollDA {
     private static ArrayList<Payroll> payroll = new ArrayList<Payroll>();
     
      public static void initialize(){
       
    }
    public static ArrayList<Payroll> getTimecards(){
        return payroll;
    }
}
