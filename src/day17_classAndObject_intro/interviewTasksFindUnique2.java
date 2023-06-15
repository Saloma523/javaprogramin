package day17_classAndObject_intro;

public class interviewTasksFindUnique2 {
    public static void main(String[] args) {
        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequancyCount = 0;
            for (int i = 0; i < str.length(); i++){// cheks how many times ch appeared in the str
                if(str.charAt(i) == ch){//if the character has appeared in the string
                    frequancyCount++;// increase the frequancy buy 1
                }

                if(frequancyCount == 1){
                    unique+= ch;
                }

            }


        }
        System.out.println(unique);


    }
}
