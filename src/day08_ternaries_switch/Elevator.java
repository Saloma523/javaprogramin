package day08_ternaries_switch;
public class Elevator{
    public static void main(String[] args) {

        int floorNumber = 3;
        String result = "";

        if(floorNumber >= 1 && floorNumber <= 3){
            if(floorNumber == 1){
                result = "Floor 1 selevted. Companies: Lobby, version, Starbucks";
            }else if(floorNumber == 2){
                result = "Floor 2 selected. Companies: Cydeo, NASA, Intelsat";
            }else{
                result = "Floor 3 is selected. Companies: Lyft, BofA, Stake house";
            }

        }else{
            result = "Invalid floor";
        }
        System.out.println(result);
    }
    /*
    Warmup task:
	1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"
     */

}
