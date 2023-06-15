package day27_statics_AccessModifiers;

public class Car {
    public String made, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class Engine{//iner nested class

        public void method(){
            System.out.println(made);
            System.out.println(model);
        }


    }

    public static class staticINnerClass{// static class  can oly be nested clas /static class only accept static variables

        public void method(){
           // System.out.println(model);
            System.out.println(wheels);
        }
    }
}
