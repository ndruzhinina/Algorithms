import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] terms = new int[2];
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    terms[0] = i;
                    terms[1] = j;
                }
            }
        }
        return terms;
    }

    public static int[] twoSumFast(int[] nums, int target) {
        int[] terms = new int[2];
        HashMap<Integer, Integer> map = new HashMap();
        for (int k = 0; k < nums.length; k++) {
            int complement = target - nums[k];
            if (map.containsKey(complement)) {
                terms[0] = map.get(complement);
                terms[1] = k;
            } else map.put(nums[k], k);
        }
        return terms;
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] nums1 = {3, 2, 4};
        int target1 = 6;

        int[] nums2 = {3, 3};
        int target2 = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));

        System.out.println(Arrays.toString(twoSumFast(nums, target)));
        System.out.println(Arrays.toString(twoSumFast(nums1, target1)));
        System.out.println(Arrays.toString(twoSumFast(nums2, target2)));


    }
}
