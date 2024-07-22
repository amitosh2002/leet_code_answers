public class Q34 {

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];

        if (nums.length == 0) {
            ans[0] = -1;
            ans[1] = -1;
        }

        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int k = 0;
            if (nums[i] != target) {
                ans[0] = -1;
                ans[1] = -1;

            }

            if (nums[j] == target) {
                ans[1] = j;
            } else {
                j--;
            }

            if (nums[k] == target) {
                ans[0] = k;
                // break;
            } else {
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        int target = 1;
        int[] print = searchRange(nums, target);
        for (int i = 0; i < print.length; i++) {
            System.out.println(print[i]);

        }

    }

}