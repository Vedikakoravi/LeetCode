class RotateArray {
    // Main method: program starts here
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;

        // Create an object to call the non-static rotate method
        RotateArray obj = new RotateArray();
        obj.rotate(nums, k);

        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // Rotate method: shifts array elements to the right by k steps
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;

        k = k % nums.length;

        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        for (int i = k; i < nums.length; i++) {
            result[i] = nums[i - k];
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}
