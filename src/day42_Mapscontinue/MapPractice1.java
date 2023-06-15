package day42_Mapscontinue;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String,String> employeeMap = new LinkedHashMap<>();
        employeeMap.put("Salma","F");
        employeeMap.put("Ahmed","M");
        employeeMap.put("Mohamed","M");
        employeeMap.put("Albagir","M");
        employeeMap.put("Rwaa","F");
        employeeMap.put("Suad","F");
        employeeMap.put("Omnia","F");
        employeeMap.put("Manar","F");
        employeeMap.put("Hassan","M");
        employeeMap.put("Nagmeldin","M");
        employeeMap.put("Judy","F");
        employeeMap.put("Sitana","F");
        employeeMap.put("Sella","F");

        System.out.println("-----------------------------------------------");

        // how many male and female in the map?

        int countMaleEmployee = 0;
        int countFemaleEmployee = 0;

        /*for (String name: employeeMap.keySet()) {
            String gender = employeeMap.get(name);

            if(gender.equals("M")){
                countMaleEmployee ++;

            }else {
                countFemaleEmployee++;
            }

          }

         */

        for (String eachValue : employeeMap.values()) {
            if(eachValue.equals("F")){
                countFemaleEmployee++;
            }else{
                countMaleEmployee++;
            }
        }

        System.out.println("Male Employee: " + countMaleEmployee);
        System.out.println("Female Employee: " + countFemaleEmployee);

        System.out.println("------------------------------------------------------------");

        //Display the names of all the female employees

        for (String name: employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("F")){
                System.out.println(name);
            }

        }

        System.out.println("---------------------------------------------------");

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }

        }


        System.out.println("-------------------------------------------------------");

        // ubdate all the "M" with "Male" , "F" with "Female"

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else{
                eachEntry.setValue("Female");
            }

        }

        System.out.println(employeeMap);

    }
}
