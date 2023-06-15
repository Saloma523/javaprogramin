package day16_loopContinue;

public class interviewQuetion {
    public static void main(String[] args) {
        String str = "aaabbccccdd";


        String result = "";
        for (int j = 0; j < str.length(); j++) {


            char eachCh = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == eachCh){
                    count++;
                }

            }
            if(!result.contains("" +eachCh) && !result.contains("" + count)){

            result += " " +count + " " + eachCh;
            }



        }
        System.out.println(result);


    }

    /*
    frequancy of caracters :

   aaaabbbbddd :  a4 b4 d3
     */
}
