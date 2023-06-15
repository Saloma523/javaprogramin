package day11_StringIntro2;

import java.sql.SQLOutput;

public class StringMethods4 {
    public static void main(String[] args) {

        String str = "          ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println(r2);
        System.out.println(r3);

        System.out.println("--------------");

        String str1 = "cydeo";
        String str2 = new String("cydeo");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("Cydeo");

        System.out.println(str2.equals(str3));

        System.out.println("---------------");

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("------------------");

        String stydents = "Hassan Natan Sumeve Nataliia";

        boolean hasAhmed = stydents.contains("Ahmed");

        System.out.println(hasAhmed);

        String sentence = "My favorite programming language is java";

        boolean hasJava = sentence.toUpperCase().contains("java");

        System.out.println("has java = " + hasJava);

        System.out.println("-----------------------");

        String name = "Micheal";

        boolean l = name.startsWith("Da");

        System.out.println(l);

        String url = "www.cydeo.com";

        boolean valid = url.startsWith("www.");

        System.out.println(valid);

        boolean t = url.endsWith(".com");

        System.out.println(t);

        System.out.println("---------------------");

        String email = "cydeoschool.gmail.com";

        boolean isGmail= email.endsWith("gmail.com");
        boolean iYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println(isGmail);
        System.out.println(iYahoo);
        System.out.println(isHotmail);




    }
}
