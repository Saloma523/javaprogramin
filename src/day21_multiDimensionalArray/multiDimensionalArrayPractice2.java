package day21_multiDimensionalArray;

import java.util.Arrays;

public class multiDimensionalArrayPractice2 {
    public static void main(String[] args) {

        int[][] arr1 = {{1,2,3,4} , {5,6,7}};
        int[][] arr2 = {{12,13,14},{0,3,45,5},{23,45,5}};
        int[][] arr3 = {{3,45,32,4,2}};

        int[][][] arr3D = {{{1,2,3,4} , {5,6,7}}, {{12,13,14},{0,3,45,5},{23,45,5}}, {{3,45,32,4,2}}};
        // [index of 2d][index of 1d][index of elements]

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[0][1]));
        System.out.println(Arrays.toString(arr3D[1][0]));
        System.out.println(arr3D[1][2][2]);


        for (int i = 0; i < arr3D.length; i++) {// i inex of 2d array
            int[][] each2D = arr3D[i];
            System.out.println(Arrays.deepToString(each2D));

            for (int j = 0; j < each2D.length ; j++) {

                int[] each1D = each2D[j];
                System.out.println(Arrays.toString(each1D));

                for (int k = 0; k < each1D.length; k++) {

                    int eachElement = each1D[k];
                    System.out.println(eachElement);

                }

            }

        }

    }
}
