package day35_Polymorphism.transportationTask;

public interface AutoPilot extends AutoPark{

    boolean hasAutoPilot = true;
    abstract void autoPilot();

}
/*
3. Create a sub interface of AutoPark named AutoPilot:

				abstract methods:
						autoPilot()
 */