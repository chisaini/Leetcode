public class L136 {
     public static int singleNumber(int[] nums) {
        int x=0;
        for (int i = 0; i < nums.length; i++) {
            x=x^nums[i];
        }
        return x;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3};
        int ans=singleNumber(arr);
        System.out.println(ans);

    }
}
