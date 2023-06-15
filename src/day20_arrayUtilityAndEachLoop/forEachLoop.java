package day20_arrayUtilityAndEachLoop;

public class forEachLoop {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        System.out.println("-------------------------------");

        for(int each: arr){
            System.out.println(each);
        }
    }
}
