package day11_StringIntro2;

public class StringMethods3 {
    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programing language, and Python is in the high demand";

       sentence = sentence.replace("Python", "Java");

        System.out.println(sentence);

        String word = "java";

       word = word.replace('a', 'e');

        System.out.println(word);

        System.out.println("-------------------------");

        String sentence2 = "I love java, java is cool";

        sentence2 = sentence2.replaceFirst("java", "python");

        System.out.println(sentence2);

        //-----------------------------------

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        sentence3 = sentence3.replaceFirst(", Java", ", python");

        System.out.println(sentence3);

        //----------------------------------

        String sentence4 = "I love Java programming";

        String languageName = sentence4.substring(7,10+1);

        System.out.println(languageName);

        //---------------------------------------

        String sentence5 = "Today is sunday, Tommorw is Monday";
        //                  0123456789....14

        String today = sentence5.substring(9,14+1);

        System.out.println(today);

        //---------------------------------------------------------

        String email = "cydeoschoolJavaProgramming@yahoo.com";
        int beginingIndex = email.indexOf('@')+1;
        int endingIndex = email.lastIndexOf('.');

        String domain = email.substring(beginingIndex,endingIndex);
        System.out.println(domain);

        //----------------------------------------------------------

        String sentence6 = "I love Java programming";

        String r1 = sentence6.substring(7);

        System.out.println(r1);

        //-------------------------------------------------------
        String sentence7 = "Today is Sunday, Tomorrow  is Monday";

        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ')+1);

        System.out.println(tomorrow);

        //---------------------------------------------
        String sentence8 = "I study at cydeo school";

        String schoolName = sentence8.substring(11);

        System.out.println(schoolName);

        //-----------------------------------------------

        String str = "Python";
        String result = (str + "\n").repeat(10);
        System.out.println(result);


    }
}
