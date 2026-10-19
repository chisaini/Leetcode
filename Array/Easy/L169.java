public class L169 {
    public static int leetcode(int[] nums) {
        int n=1;
        int a=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (n==0) {
                a=nums[i];
            }
            if (nums[i]==a) {
                n++;
            }else if(nums[i]!=a){
                n--;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,3};
        int ans=leetcode(arr);
        System.out.println(ans);
}
}
