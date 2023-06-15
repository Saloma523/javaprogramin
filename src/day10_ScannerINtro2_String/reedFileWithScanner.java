package day10_ScannerINtro2_String;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class reedFileWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_ScannerINtro2_String/Test.txt"));

        System.out.println(scan.next());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        
        scan.close();

    }
}
