import java.util.HashMap;

public class JavaSolution2 {
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> m = new HashMap<>(len - 1);
        m.put(nums[0], 0);
        for (int i = 1; i < len; i++) {
            int another = target - nums[i];
            if (m.containsKey(another)) {
                return new int[] {m.get(another), i};
            }
            m.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
