public class FindDuplicates {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        int result = findDuplicates(nums);
        System.out.println("The duplicate element is " + result);
    }

    private static int findDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] != i + 1) {
                if (nums[i] != nums[nums[i] - 1]) {
                    swap(nums, i, nums[i] - 1);
                } else {
                    return (nums[i]);
                }
            } else {
                i++;
            }

        }
        return -1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
