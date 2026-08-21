
public class L75 {
    public static int[] sortColors(int[] nums) {
        int a=0;
        int b=nums.length-1;
        int i=0;
        while(i<=b){
                        
            if(nums[i]==2){
                int temp=nums[b];
                nums[b]=nums[i];
                nums[i]=temp;
                b--;
            }
            else if(nums[i]==0){
                int temp=nums[a];
                nums[a]=nums[i];
                nums[i]=temp;
                a++;
                i++;
            }
            else if(nums[i]==1){
                i++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={2,1,2};
        int ans[]=sortColors(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}