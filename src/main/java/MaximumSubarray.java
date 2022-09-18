
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int tmp = 0;
            for (int j = i; j < nums.length; j++) {
                tmp = tmp + nums[j];
                if (tmp > sum) {
                    sum = tmp;
                }

            }
            if (sum > max) {
                max = sum;
            }

        }
        return max;
    }

    public static int maxSubArrayKadane(int[] nums) {
        int length = nums.length;
        int local_max = 0;
        int global_max = 0;

        for (int i = 0; i < length; i++) {
            local_max = Math.max(local_max + nums[i], nums[i]);
            if (local_max > global_max) {
                global_max = local_max;
            }
        }
        return global_max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums1 = {1};
        int[] nums2 = {5, 4, -1, 7, 8};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArrayKadane(nums));

    }
}
