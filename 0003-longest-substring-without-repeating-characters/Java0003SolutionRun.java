import java.lang.System;
import java.lang.String;
import java.lang.StringBuffer;
import java.util.Scanner;

public class Java0003SolutionRun {

    public static void main(String[] args) {
        System.out.println("String: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(Java0003Solution.lengthOfLongestSubstring(input));
    }
}
