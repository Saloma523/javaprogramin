package day42_Mapscontinue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueChar {

    public static void main(String[] args) {

        String str = "bbcccaaaaf";

        int count = 0;
        int maxCount = 0;

        char ch = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {

            if(str.substring(i).startsWith(ch + "")) {
            count++;

            }
        }
        System.out.println(count);



      /*  Map<Character,Integer> map = new LinkedHashMap<>();

        for(String each:str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

            if(frequency == 1)

            System.out.println(each + " : " + frequency);

            map.put(each.charAt(0),frequency);
        }

        System.out.println(map);

       */
    }
}
