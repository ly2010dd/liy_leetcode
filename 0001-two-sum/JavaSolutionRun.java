import java.util.Scanner;

public class JavaSolutionRun {
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
            int[] ret = JavaSolution2.twoSum(nums, target);

            for(int i = 0; i < ret.length; i++) {
                System.out.print(ret[i] + " ");
            }
            System.out.println();

        }
    }

    public static int[] stringArrToIntArr(String[] arrs) {
        int[] ints = new int[arrs.length];
        for (int i = 0; i < arrs.length; i++) {
            ints[i] = Integer.parseInt(arrs[i]);
        }
        return ints;
    }
}
