import java.lang.String;
import java.lang.System;
import java.io.*;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.lang.IllegalArgumentException;

class TwoSumSolution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("cnt: ");
        //int cnt = sc.nextInt();
        //int[] nums = new int[cnt];

        System.out.println("arr: ");
        String arrStr = sc.nextLine();
        String[] arr = arrStr.split(",");
        int[] nums = stringArrToIntArr(arr);

        while (true) {

            System.out.println("target: ");
            int target = sc.nextInt();

            //int[] ret = twoSum(nums, target);
            int[] ret = twoSumOptimized(nums, target);

            for(int i = 0; i < ret.length; i++) {
                System.out.print(ret[i] + " ");
            }
            System.out.println();

        }
    }

    public static int[] stringArrToIntArr(String[] arrs) {
        int[] ints = new int[arrs.length];
        for(int i=0;i<arrs.length;i++) {
            ints[i] = Integer.parseInt(arrs[i]);
        }
        return ints;
    }

    public static int[] twoSum(int[]nums, int target) {
        int[] ret = new int[]{-1, -1};
        for ( int i = 0; i < nums.length; i++) {
            int j = i + 1, sum = 0;
            while ( j < nums.length ) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                //相等说明已经找到
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                } else {
                    j++;
                    continue;
                }
            }
        }
        return ret;
    }

    public static int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> num2Idx = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int remnant = target - nums[i];
            if (num2Idx.containsKey(remnant)) {
                return new int[] {num2Idx.get(remnant), i};
            }
            num2Idx.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
}
