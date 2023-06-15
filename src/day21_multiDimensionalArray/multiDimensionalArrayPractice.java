package day21_multiDimensionalArray;

import java.util.Arrays;

public class multiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"salma", "mohamed","hassan","ali"};
        String[] group2 = {"ahmed","rawaa","suad"};
        String[] group3 = {"israa","omer","judy","manar","omnia"};
        String[] group4 = {"settana"};

        String[][] groups = {{"salma", "mohamed","hassan","ali"} , {"ahmed","rawaa","suad"} , {"israa","omer","judy","manar","omnia"} , {"settana"}};

        System.out.println(Arrays.deepToString(groups));

        for(int i = 0; i < groups.length; i++){
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {

                String eachName = eachGroup[j];
                System.out.println(eachName);

            }
        }

        for(String[] eachGroup :groups){
            System.out.println(eachGroup);
            for(String echStudent: eachGroup){
                System.out.println();

            }
        }

        System.out.println("--------------------------------------------------------------");

        for (int i = groups.length-1; i >=0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for(String eachStudent: eachGroup){
                System.out.println(eachStudent);
            }


        }
    }
}
