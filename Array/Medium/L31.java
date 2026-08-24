public class L31 {
    public static int [] nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while (i>=0&&nums[i]>=nums[i+1]) {
            i--;
        }
        if(i>=0){
            int j=n-1;
            while (nums[i]>=nums[j]) {
                j--;
            }
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;

        }
        int []ans=reverse(nums, i + 1, n - 1);
        return ans;
    }
    private static int [] reverse(int[] nums,int left,int right){
            while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
            return nums;
        }
    public static void main(String[] args) {
        int [] arr={1,3,2,4};
        int [] ans=nextPermutation(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}