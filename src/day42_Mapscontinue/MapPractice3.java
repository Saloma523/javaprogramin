package day42_Mapscontinue;

import java.time.LocalDate;
import java.util.*;

public class MapPractice3 {

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

        Map<String, Object>[] arrayOfMaps = new Map[5];
        arrayOfMaps[0] = person1;
        arrayOfMaps[1] =person2;
        arrayOfMaps[2] =person3;
        arrayOfMaps[3] =person4;
        arrayOfMaps[4] =person5;
        //arrayOfMaps[5] = new LinkedHashMap<>(); // index out of bond exeption

        System.out.println(Arrays.toString(arrayOfMaps));

        arrayOfMaps[1].replace("salary" ,(Integer)arrayOfMaps[1].get("salary")+10000);

        arrayOfMaps[0].replace("name", "Hassan");

        System.out.println(Arrays.toString(arrayOfMaps));

        System.out.println("------------------------------------------------------");

        int count = 0;

        for (Map<String, Object> eachMap : arrayOfMaps) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("salary")){
                    double salary = (Integer) eachEntry.getValue();
                    if(salary < 10000){
                        count++;
                    }
                }

            }
            System.out.println(count);

        }




    }
}
