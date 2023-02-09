import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Java0001SolutionRun {
    public static void main(String args[]) {
        System.out.println("arr: ");
        Scanner sc = new Scanner(System.in);
        String arrStr = sc.nextLine();
        String[] arr = arrStr.split(",");
        int[] nums = stringArrToIntArr(arr);

        while (true) {
            System.out.println("target: ");
            int target = sc.nextInt();

            //int[] ret = JavaSolution1.twoSum(nums, target);
            int[] ret = Java0001Solution2.twoSum(nums, target);

            for(int i = 0; i < ret.length; i++) {
                System.out.print(ret[i] + " ");
            }
            System.out.println();

        }
    }

    public static int[] stringArrToIntArr(String[] arrs) {
        List<String> strList = Arrays.asList(arrs);
        return strList.stream().mapToInt(Integer::parseInt).toArray();
        /*int[] ints = new int[arrs.length];
        for (int i = 0; i < arrs.length; i++) {
            ints[i] = Integer.parseInt(arrs[i]);
        }
        return ints;*/
    }
}
