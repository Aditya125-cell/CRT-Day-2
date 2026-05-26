class Solution {

    public void mergeSort(int[] nums, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            merge(nums, left, mid, right);
        }
    }

    public void merge(int[] nums, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        int i = 0;
        while (i < n1) {
            L[i] = nums[left + i];
            i++;
        }

        int j = 0;
        while (j < n2) {
            R[j] = nums[mid + 1 + j];
            j++;
        }

        i = 0;
        j = 0;

        int k = left;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            } else {
                nums[k] = R[j];
                j++;
            }

            k++;
        }
        
        while (i < n1) {
            nums[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            nums[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {38, 27, 43, 3, 9, 82, 10};

        Solution obj = new Solution();

        obj.mergeSort(nums, 0, nums.length - 1);

        System.out.println("Sorted array:");

        int i = 0;
        while (i < nums.length) {
            System.out.print(nums[i] + " ");
            i++;
        }
    }
}
