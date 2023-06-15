package day17_classAndObject_intro;

public class interviewTasksFindUnique3 {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);

            int frequancyCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ch){
                    frequancyCount++;
                }

            }
            if(result.contains("" + ch)){// if ch is add in the result
                continue;//skip the ch
            }
                result+= ch + "" + frequancyCount;



        }
        System.out.println(result);

    }
}
