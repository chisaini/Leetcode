public class L283 {
    public static int[] moveZeroes(int[] nums) {
      int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int ans[]=moveZeroes(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}
