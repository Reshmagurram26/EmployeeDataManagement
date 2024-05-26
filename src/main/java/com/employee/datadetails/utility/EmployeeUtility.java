package com.employee.datadetails.utility;
import org.springframework.stereotype.Component;
@Component
public class EmployeeUtility {
    public String convertSatenameToStatecode(String StateCode){
        if(StateCode==null){
            throw new IllegalArgumentException("State not null");
        }
        switch (StateCode){
            case "Alaska" :
                return  "AK";
            case "Texas" :
                return "TX";
            case "Florida":
                return "FL";
            case "Georgia" :
                return "GA";
            case "Arkansas":
                return "AR";
            default:
                throw new IllegalArgumentException("No state such state was found");
        }
    }
}
