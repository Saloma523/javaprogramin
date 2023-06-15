package day11_StringIntro2;

public class StringMethods2 {
    public static void main(String[] args) {

        String s1 = "CYDEO SCHOOL";

        s1 = s1.toLowerCase();// cydeo school
        System.out.println(s1);

        System.out.println("------------------------");

        String s2  = "java programing";
       s2 = s2.toUpperCase();// JAVA PROGRAMMING
        System.out.println(s2);

        System.out.println("--------------------------");

        String word = "Wooden Spoon";
       word = word.toUpperCase();// new string "WOODEN SPOON"
       String word2 = word.toLowerCase();// wooden spoon
        System.out.println(word2);

        System.out.println("------------------------");

        String str1 = "        cydeo school";// empty space is called wight space

        str1 = str1.trim();//no wight spaces "cydeo school"

        System.out.println(str1);

        String sentence1 = "today is Sunday, and we have java class";

       int index1 = sentence1.indexOf('w');
        System.out.println(index1);

        String s = "I love java programing";

       int index2 =  s.indexOf('a');
        System.out.println(index2);

        int secondA = s.indexOf("a ");
        System.out.println(secondA);

        String s3 = "Java Python JavaScript Cydeo Python";
       int a1 =  s3.indexOf('a');
        System.out.println(a1);

        int a2 = s3.indexOf("a P");
        System.out.println(a2);

        int a3 = s3.indexOf("avaS");
        System.out.println(a3);

        int a4 = s3.indexOf("aS");
        System.out.println(a4);

        System.out.println("------------------------------");

        String w = "Java";
        System.out.println(w.indexOf('a'));
        System.out.println(w.lastIndexOf('a'));

        String w2 = "Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('P'));

        System.out.println("------------------------------------");







    }

}
