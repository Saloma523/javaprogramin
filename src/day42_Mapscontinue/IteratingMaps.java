package day42_Mapscontinue;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {

    public static void main(String[] args) {

        Map<String, Integer> map =  new LinkedHashMap<>();
        map.put("Omnia",95000);
        map.put("Manar",100000);
        map.put("Judy",84000);
        map.put("Hassan",120000);
        map.put("Israa",78000);
        map.put("Mohamed",75000);
        map.put("Bella",89000);

        System.out.println(map);

        // ITERATING THE MAP BY THE KEY

        for (String eachKey : map.keySet()) {
            System.out.println(eachKey);
            map.replace(eachKey,map.get(eachKey) * 2);

        }

        System.out.println(map);

        System.out.println("----------------------------------------------------------------------");

        // Iterating the map by values

        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);

        }

        System.out.println("---------------------------------------------------------");

        // Iterating the map by the entries

       for(Map.Entry<String, Integer> eachEntry: map.entrySet()){
           System.out.println(eachEntry);
       }

        System.out.println("--------------------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();

            eachEntry.setValue(eachValue + 10000);

            System.out.println(eachKey + " : " + eachValue) ;

        }


    }
}
