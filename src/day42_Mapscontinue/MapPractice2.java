package day42_Mapscontinue;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name","Salma");
        person1.put("gender","F");
        person1.put("age",33);
        person1.put("job_title","SDET");
        person1.put("salary",120000);
       person1.put("hired_date", LocalDate.of(2022,12,3));
        person1.put("married",true);

        System.out.println(person1);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name","Ahmed");
        person2.put("gender","M");
        person2.put("age",32);
        person2.put("job_title","Developer");
        person2.put("salary",150000);
        person1.put("hired_date", LocalDate.of(2021,12,15));
        person2.put("married",true);

        System.out.println(person2);

       ;
        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name","Omran");
        person3.put("gender","M");
        person3.put("age",35);
        person3.put("job_title","Developer");
        person3.put("salary",140000);
        person1.put("hired_date", LocalDate.of(2022,110,15));
        person3.put("married",false);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name","Omnia");
        person4.put("gender","F");
        person4.put("age",22);
        person4.put("job_title","QA");
        person4.put("salary",130000);
        person1.put("hired_date", LocalDate.of(2021,2,5));
        person4.put("married",false);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name","Manar");
        person5.put("gender","F");
        person5.put("age",32);
        person5.put("job_title","Developer");
        person5.put("salary",1450000);
        person1.put("hired_date", LocalDate.of(2022,1,15));
        person5.put("married",false);
        List<Map<String, Object>> listOfMaps = new ArrayList<>();
        listOfMaps.add(person1);
        listOfMaps.add(person5);
        
        listOfMaps.addAll(Arrays.asList(person1,person5,person3,person4,person5));

        System.out.println(listOfMaps);

        for (Map<String, Object> eachMap : listOfMaps) {
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);

            }
            
        }

        System.out.println("------------------------------------------------------");

        // display the names of the employee who are hired in the year 2022

        for (Map<String, Object> eachMap : listOfMaps) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("hired_date")){
                    if(((LocalDate)eachEntry.getValue()).getYear() == 2022){
                        System.out.println(eachMap.get("name"));
                    }
                }
            }

        }

        System.out.println("----------------------------------------------------------------");

        listOfMaps.get(0).replace("name","Vasyl");

        System.out.println(listOfMaps);

        listOfMaps.get(listOfMaps.size()-1).replace("salary" ,(Integer)listOfMaps.get(listOfMaps.size()-1).get("salary" + 50000));

        listOfMaps.get(1).replace("age",(Integer)listOfMaps.get(1).get("age") + 4);

        System.out.println(listOfMaps);

        System.out.println("-------------------------------------------------------");

        Map<String,Object> car1 = new LinkedHashMap<>();
        car1.put("brand","BMW");
        car1.put("model","x5");
        car1.put("year",2021);
        car1.put("color","red");
        car1.put("price",45000.5);

        Map<String,Object> car2 = new LinkedHashMap<>();
        car2.put("brand","honda");
        car2.put("model","x5");
        car2.put("year",2021);
        car2.put("color","red");
        car2.put("price",45000.5);

        Map<String,Object> car3 = new LinkedHashMap<>();
        car3.put("brand","tesla");
        car3.put("model","x5");
        car3.put("year",2021);
        car3.put("color","red");
        car3.put("price",45000.5);

        Map<String,Object> car4 = new LinkedHashMap<>();
        car4.put("brand","B");
        car4.put("model","x5");
        car4.put("year",2021);
        car4.put("color","red");
        car4.put("price",45000.5);



    }
}
