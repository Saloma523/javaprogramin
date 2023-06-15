package day04_concatenation;

public class primitiveTypeCastings {

    public static void main(String[] args) {

        // implicit casting is done automatically when assigning small to large primitive type

        byte a = 25;
        short b = a;
        System.out.println(b);
        // short b = (short)a;

        int c = a;
        //implicit casting

        long d = 3000L;
        float e= d;
        //implicit casting

        // explicit casting is done manually because small primitive is assigned to large p


        int x = 100;
        byte y = (byte)x;

        float z = 20.8f;
        short q = (short)z;
        System.out.println(q);

        double n1 = 2.5;
        byte n2 = (byte)n1;
        System.out.println(n2);

        System.out.println("--------------------------------------");

        int num = 500;
        byte result = (byte) num;
        System.out.println(result);

        int r = 5000;
        short t = (short) r;

        double u = 3000-5;
        int p = (int) u;

        int o = 100;
        double d1 = o;
        System.out.println(d1);




        }





    }

