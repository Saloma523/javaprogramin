package day19_array;

public class maxNumber {

    public static void main(String[] args) {

        int[] number = {100,20,500,40,-10,30};

        int max = number[0];

        for (int i = 1; i < number.length; i++) {//1 2 3 4 5
            if(number[i] > max){
                max = number[i];
            }

        }
        System.out.println("max = " + max);
    }
}
