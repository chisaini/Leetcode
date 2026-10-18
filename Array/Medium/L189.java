public class L189 {
    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        

    }

    public static int[] rotate(int[] nums, int k) {
        int f=k%(nums.length);
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, f-1);
        reverse(nums, f, nums.length-1);
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int ans[] = rotate(arr, 3);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}
