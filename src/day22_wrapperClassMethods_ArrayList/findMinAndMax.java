package day22_wrapperClassMethods_ArrayList;

public class findMinAndMax {
    public static void main(String[] args) {

       int[][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

       int max = array[0][0];
        int min = array[0][0];

       for(int[] each1d : array){
           for(int eachElement: each1d){
               if(eachElement > max){
                   max = eachElement;
               }

               if(eachElement < min){
                   min = eachElement;
               }
           }

       }
        System.out.println("maximum number is " + max);
        System.out.println("minimum number is " + min);







    }
}
/*
 Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000


 */
