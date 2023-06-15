package day42_Mapscontinue;

import javax.print.DocFlavor;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice5 {

    public static void main(String[] args) {

        Map<String,String> map = new LinkedHashMap<>();
        map.put("co2","josh");
        map.put("B03","Nora");
        map.put("A02","salma");
        map.put("D04","Ahmed");
        map.put("A03","Mohamed");

        map.forEach ((k,v) -> {
            System.out.println(k + " : " + v);
        });
    }
}
