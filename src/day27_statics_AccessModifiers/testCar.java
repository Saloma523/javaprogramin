package day27_statics_AccessModifiers;

public class testCar {
    public static void main(String[] args) {
        
        Car obj1 = new Car();// Car object
        
        obj1.new Engine();// Engine object
        
       Car.staticINnerClass obj =  new Car.staticINnerClass();// static class object
        
        
    }
}
