package day41_Maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02","josh");
        map.put("B03","Omer");
        map.put("A02","Salim");
        map.put("D09","Ahmed");
        map.put("C34","Mohamed");
        map.put("A88","Salma");
        map.put("A08","josh");
        map.put("C12","josh");
        map.put("D23","josh");

        System.out.println(map.size());

        System.out.println(map);

       map.put("A88","Saloma");

        System.out.println(map);

       map.get("A08");

        System.out.println(map);

        map.replace("D23","Saim");

        System.out.println(map);

       map.remove("A02");

        System.out.println(map);

        System.out.println(map.containsKey("A88"));
        System.out.println(map.containsKey("H22"));

        System.out.println(map.containsValue("Salma"));
        System.out.println(map.containsValue("Ali"));


        System.out.println(map.isEmpty());

        System.out.println(map.equals(map));

       map.clear();

        System.out.println(map);




    }
}
