package day21_multiDimensionalArray;

import java.util.Arrays;

public class iteratingMultiDimensionalArray {
    public static void main(String[] args) {

        // index of elements   0 1 2 3     0 1 2 3 4     0 1 2 3 4 5 6
        int [][] arr2D =     {{1,2,3,4} , {5,6,7,8,9} , {10,11,12,13,14}};
        // index of iD        0             1                2


        for(int i = 0 ; i < arr2D.length ; i++){// i index number of 1D array in aee2D
            int[] each2D = arr2D[i];
            System.out.println(Arrays.toString(each2D));

            for(int j = 0; j < each2D.length; j++){// j index number of elements in each iD array

                int eachElement =  each2D[j];
                System.out.println(eachElement);
            }
        }


        System.out.println("------------------------------------------------------------------------");

        for(int[] each1DArray:arr2D){
            System.out.println(Arrays.toString(each1DArray));

            for(int elements:each1DArray){
                System.out.println(elements);
            }
        }

        System.out.println("---------------------------------------------------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {

            for(int j = arr2D[i].length ; j >=0 ;j--){

                System.out.println(arr2D[i][j]);
            }


        }
    }

}
