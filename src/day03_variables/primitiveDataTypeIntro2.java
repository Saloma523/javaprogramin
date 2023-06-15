package day03_variables;

public class primitiveDataTypeIntro2 {

    public static void main(String[] args) {

        char a = '@';
        char b = '!';
       // char ab = 'ab'; do not work
        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------");

        char ch3 = 9000;
        System.out.println(ch3);

        System.out.println("---------------------------");

        int sum = 'A' + 'B';
        System.out.println(sum);
        // char is for all single charectars
        System.out.println("-----------------------------");

        boolean r4 = true;
        boolean r5 = false;
        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1; // false

        System.out.println(r6);
        System.out.println(r7);


    }

}
