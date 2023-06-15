package day28_OOP_Encapsulation;

public class Student {

    private String name;

    private int age;

    public String getName() {
        if(name == null){
            System.err.println("name has not ben set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        boolean hasDigit = false, hasSpecialChar = false;
        for(char each: name.toCharArray()){
            if(Character.isDigit(each)){
                hasDigit =true;
                break;
            }
        }
        if(hasDigit){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public void setAge(int age){

        if(age < 1){
            System.err.println(" invalid age: " + age);
            System.exit(1);
        }

        this.age = age;
    }

    public int getAge(){

        if(age == 0){
            System.out.println("age has not ben set");
            System.exit(1);
        }
        return  age;
    }


}
