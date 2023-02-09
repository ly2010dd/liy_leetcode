import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java0704SolutionRun {
    public static void main(String args[]) {
        System.out.println("arr: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strArr = line.split(",");
        int[] nums = stringArrToIntArr(strArr);
        //Arrays.stream(nums).forEach(System.out::println);

        System.out.println("target: ");
        int target = sc.nextInt();
        int pos = Java0704Solution.search(nums, target);
        System.out.println(pos);
    }

    public static int[] stringArrToIntArr(String[] strArr) {
        List<String> strList = Arrays.asList(strArr);
        return strList.stream().mapToInt(Integer::parseInt).toArray();
    }
}
