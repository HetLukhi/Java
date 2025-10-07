public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        leftRotateByOne(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void leftRotateByOne(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
    }
}
