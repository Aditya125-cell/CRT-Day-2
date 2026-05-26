class Solution {

    public void selectionSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] nums = {64, 25, 12, 22, 11};

        Solution obj = new Solution();

        obj.selectionSort(nums);

        System.out.println("Sorted array:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
