
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class TwoSumHashMap {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];

            if (map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSumHashMap solution = new TwoSumHashMap();
        System.out.println(Arrays.toString(
            solution.twoSum(nums, target)
        ));
    }
}
