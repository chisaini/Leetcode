public class L53 {
    public static int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxsum=nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum=Math.max(nums[i],sum+nums[i]);
            maxsum=Math.max(maxsum, sum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,-1,-2,2,1,-2,1,4,-5,4};
        int ans=maxSubArray(arr);
        System.out.println(ans);
    }
}
