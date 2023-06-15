package day15_loopBranchesStatements;

public class warmupTask {
    public static void main(String[] args) {
        String str = "ssnnbbjjjjj";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains("" + (each))){
                result+= each;
            }
            System.out.println(result);

        }
    }
}
// find th duplicated character in a string


