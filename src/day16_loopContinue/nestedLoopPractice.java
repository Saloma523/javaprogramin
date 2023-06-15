package day16_loopContinue;

public class nestedLoopPractice {
    public static void main(String[] args) {
        String str = "aaaffddgg";

        String result = "";

        for (int j = 0; j <str.length() ; j++) {


            char ch = str.charAt(j);//each character from the string
            int count = 0;
            for (int i = 0; i < str.length(); i++) {/*compais ch with each character og the str and return the frequancy of ch*/
                if(str.charAt(i) == ch){
                    count++;
                }
                if(count == 2 && !result.contains( "" + ch)){

                    result+=ch;
                }

                System.out.println(result);

                // this is an interview task


            }



        }
    }
}
