package day41_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();

        person1.put("name","Auther");
        person1.put("gender",'M');
        person1.put("age",32);
        person1.put("job title","Developer");
        person1.put("salary",120000);
        person1.put("married",true);

        System.out.println(person1);

        System.out.println(person1.get("name"));
        System.out.println(person1.get("salary"));
        System.out.println(person1.get("job title"));
        System.out.println(person1.get("married"));

    }
}
