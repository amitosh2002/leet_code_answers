class Solution {
    public int searchInsert(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;

            if (target < arr[i]) {
                return i;
            }

        }
        return arr.length;
    }
}