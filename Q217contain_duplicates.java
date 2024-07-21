import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
                return true;

            } else {
                j++;
                i++;
            }

        }
        return false;

    }
}