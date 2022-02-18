/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import domain.WithholdingType;
import java.util.ArrayList;

/**
 *
 * @author stoke
 */
public class WithholdingTypeDA {
    private static ArrayList<WithholdingType> withholdingTypes = new ArrayList<WithholdingType>();
     
      public static void initialize(){
        
        WithholdingType type1;
        WithholdingType type2;
        
        type1.setWithholdingID(123);
        
        withholdingTypes.add(type1);
        withholdingTypes.add(type2);
    }
    public static ArrayList<WithholdingType> getTimecards(){
        return withholdingTypes;
    }
}
