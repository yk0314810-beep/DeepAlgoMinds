class KthElement {
    public int findKthLargest(int[] nums, int k) {
        for (int count = 0; count < k - 1; count++) {
            int maxIndex = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
            }

            nums[maxIndex] = Integer.MIN_VALUE;
        }

        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        return nums[maxIndex];
    }
}