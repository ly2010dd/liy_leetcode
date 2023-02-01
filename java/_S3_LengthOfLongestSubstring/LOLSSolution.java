import java.lang.System;
import java.lang.String;
import java.lang.StringBuffer;
import java.util.Scanner;

public class LOLSSolution {

    public static void main(String[] args) {
        System.out.println("String: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(String.valueOf(lengthOfLongestSubstring(input)));
    }

    public static int lengthOfLongestSubstring(String s) {
        int retLength = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            while ( sb.indexOf(String.valueOf(s.charAt(i))) != -1 ) {
                retLength = sb.length() > retLength ? sb.length() : retLength;
                sb.delete(0, 1);
            }
            sb.append(s.charAt(i));
       }
       retLength = sb.length() > retLength ? sb.length() : retLength;
       return retLength;
    }
}
