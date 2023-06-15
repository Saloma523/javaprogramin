package day32_finalKyword;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

class  cydeoStudent{// parent class can not be final

    public final void language(){
        System.out.println("java programing language");
    }
}

public final class FinalKyword extends cydeoStudent{// child class can be final
    // @Override
  //  public void language() {
        //System.out.println("python programing language"); methods can not be override
   // }

    public static void main(String[] args) {


       final char gender = 'M';
        System.out.println(gender);

       // gender = 'F';

        System.out.println("---------------------------------------------------");

        final  LocalDate DOB = LocalDate.now();

        System.out.println(DOB);

       // DOB = DOB.plusYears(3);
        System.out.println(DOB);

        new cydeoStudent().language();
        new FinalKyword().language();

        System.out.println("---------------------------------");

       final String name = "salma";// can not be collected with garbage collection
        //name = null;// iligeble for garbage collection
       // name = "ahmed"; // iligeble for garbage collection


    }
}
