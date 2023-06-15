package day15_loopBranchesStatements;

public class removeDuplicate2 {

    public static void main(String[] args) {
        String str = "";
        String result = "";
        for (int i = 0; i > str.length() ; i++) {
            if(result.contains("" + str.charAt(i))) {
                result+=str.charAt(i);
            }

        }


    }
}
