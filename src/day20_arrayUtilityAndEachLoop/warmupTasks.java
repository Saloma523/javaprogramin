package day20_arrayUtilityAndEachLoop;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class warmupTasks{
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                continue;

            }
            numbers[i] = numbers[i] * 2;

        }
        System.out.println(Arrays.toString(numbers));


        System.out.println("--------------------------------------------------------------");



        int[] arr1 = {1,2,3,4,};
        int[] arr2 = {5,6};

        int[] arr3 = new int[arr1.length + arr2.length];//to contain thr elements of arr1 and arr2

        int k = 0; // for third arr index number

        for (int i = 0; i < arr1.length; i++, k++) {// i is fo the first arr index number
          arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++, k++) {// i is for the second arr index number

            arr3[k] = arr2[i];

        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------------------------------------");

        int[] r1 = {1,2,3,4,5,6,7,};
        int[] r2 = {8,9,10};

        int[] r3 = ArraysUtilities.merge(r1,r2);

        System.out.println("-----------------------------------------------------------");


        double[] d1 = {1,2,3,4,5,6,7,};
        double[] d2 = {8,9,10};

        double[] d3 = ArraysUtilities.merge(d1,d2);

        System.out.println("----------------------------------------------------------");

        char[] c1 = {'a', 'b', 'c','d'};
        char[] c2 = {'e','f','g'};

        char[] c3 = ArraysUtilities.merge(c1,c2);

        System.out.println("----------------------------------------------");

        String[] s1 = {"salma" , "mohamed", "ahmed"};
        String[] s2 = {"nagmeldin", "hassan"};

        String[] s3 = ArraysUtilities.merge(s1,s2);




    }


    
}
/*
1. write a program that can multiply each odd number of an integer array by 2
		            ex:
		            	array = [1,2,3,4,5];

	                output:
	                	array =[2,2,6,4,10]

	2. write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}


	3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
 */
