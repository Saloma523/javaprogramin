package day24_ArraylistContinue_JavaDateTime;

import java.util.Arrays;
import java.util.Collections;

public class frequancyOfCharactors {
    public static void main(String[] args) {

        String str ="ddbaaadeaa";
        String result = "";

        for(String each: str.split("")){

            int frequancy = Collections.frequency(Arrays.asList(str.split("")),each);
            if(!result.contains(each)){
                result+= each + frequancy;
            }
        }
    }
}
