package day17_classAndObject_intro;

public class interviewTasksFindUnique1 {
    public static void main(String[] args) {
        String str = "aabcccd";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {// i -> index number of str
            char each = str.charAt(i);

            if(str.indexOf("" +each) == str.lastIndexOf("" + each)){
                // the if statment is the first time snd last time the character appeard
                unique+=each;
            }

        }
        System.out.println(unique);



    }

}

