package day27_statics_AccessModifiers;

public class instanceInitializationBlock {

    public String name;
    public int age;

    {// its not the best practice
        name = "james";
        age = 50;
    }

    public static void main(String[] args) {
        instanceInitializationBlock obj1 = new instanceInitializationBlock();
        instanceInitializationBlock obj2 = new instanceInitializationBlock();

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
