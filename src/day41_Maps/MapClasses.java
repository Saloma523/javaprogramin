package day41_Maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();// random insertion order //  accept null as a key, multiple null values// the fastest

        hashMap.put("Daniel", 95000);
        hashMap.put("Emily",75000);
        hashMap.put("Ali",60000);
        hashMap.put("Ahmed",68000);
        hashMap.put("Osman",80000);
       // map1.put("Emily",100000); // dose not add new pare ,only changes the value of salary
        hashMap.put("Arron", 78000);
        hashMap.putIfAbsent("Chris",null);
        hashMap.put("Salma",null);
        hashMap.put(null,12000);
        hashMap.put(null,900000);

        System.out.println(hashMap);

        System.out.println("---------------------------------------------------------------------------------------------------------");

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();//maintains the insertion order //accept one null key, multiples values values

        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily",75000);
        linkedHashMap.put("Ali",60000);
        linkedHashMap.put("Ahmed",68000);
        linkedHashMap.put("Osman",80000);
        // linkedHashMap.put("Emily",100000); // dose not add new pare ,only changes the value of salary
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris",null);
        linkedHashMap.put("Salma",null);
        linkedHashMap.put(null,12000);
        linkedHashMap.put(null,900000);

        System.out.println(linkedHashMap);

        System.out.println("---------------------------------------------------------------------------------------");

        Map<String ,Integer> treeMap = new TreeMap<>();// sorted order // does not accept null as a key// value can be null

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily",75000);
        treeMap.put("Ali",60000);
        treeMap.put("Ahmed",68000);
        treeMap.put("Osman",80000);
        //treeMap.put("Emily",100000); // dose not add new pare ,only changes the value of salary
        treeMap.put("Arron", 78000);
        treeMap.putIfAbsent("Chris",null);
        treeMap.put("Salma",null);
        //treeMap.put(null,12000);
        //treeMap.put(null,900000);

        System.out.println(treeMap);

        System.out.println("--------------------------------------------------------------------------------");

        Map<String, Integer> hashTable = new Hashtable<>();//random order // does not accept null key, synchronized

        hashTable.put("Daniel", 95000);
        hashTable.put("Emily",75000);
        hashTable.put("Ali",60000);
        hashTable.put("Ahmed",68000);
        hashTable.put("Osman",80000);
        // hashTable.put("Emily",100000); // dose not add new pare ,only changes the value of salary
        hashTable.put("Arron", 78000);
       // hashTable.putIfAbsent("Chris",null);// values in hashtable can not be null
       // hashTable.put("Salma",null);// values in hashtable can not be null
       // hashTable.put(null,12000);// key can not be null
       // hashTable.put(null,900000);// key can not be null

        System.out.println(hashTable);


        try{
            hashTable.put("Daniel", 90000);
        }catch (RuntimeException e){

        }


    }
}
