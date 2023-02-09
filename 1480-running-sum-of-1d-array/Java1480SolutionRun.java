import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java1480SolutionRun {
    public static void main(String args[]) {
        System.out.println("arr: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strArr = line.split(",");
        int[] nums = stringArrToIntArr(strArr);
        Arrays.stream(nums).forEach(System.out::println);
        //Arrays.stream(Java1480Solution.runningSum(nums)).forEach(System.out::println);

    }

    public static int[] stringArrToIntArr(String[] strArr) {
        List<String> strList = Arrays.asList(strArr);
        return strList.stream().mapToInt(Integer::parseInt).toArray();
    }
}
