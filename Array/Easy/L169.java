public class L169 {
    public static int leetcode(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,3};
        int ans=leetcode(arr);
        System.out.println(ans);
}
}
