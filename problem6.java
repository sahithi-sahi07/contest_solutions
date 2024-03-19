class Solution {
    public int maximumProduct(int[] nums) {
        final int length = nums.length;
        Arrays.sort(nums);
        int product1 = nums[length - 1] * nums[0] * nums[1];
        int product2 = nums[length - 1] * nums[length - 2] * nums[length - 3];
        return Math.max(product1, product2);
    }
}
