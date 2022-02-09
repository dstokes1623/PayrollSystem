/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import domain.Timecard;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author stoke
 */
public class TimecardDA {
     private static ArrayList<Timecard> timecards = new ArrayList<Timecard>();
     
      public static void initialize(){
        //Salary employees
        Timecard timecard1 = new Timecard(new Date(2022, 1, 25), 103, 45.5);
        Timecard timecard2 = new Timecard(new Date(2022, 1, 28), 103, 40);
        
        Timecard timecard3 = new Timecard(new Date(2022, 2, 1), 104, 42);
        Timecard timecard4 = new Timecard(new Date(2022, 1, 25), 104, 35);
        
        timecards.add(timecard1);
        timecards.add(timecard2);
        timecards.add(timecard3);
        timecards.add(timecard4);
    }
    public static ArrayList<Timecard> getTimecards(){
        return timecards;
    }
}
