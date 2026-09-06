public class L287 {
    public static int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
        
        while (true) {
                
                slow=nums[slow];
                fast=nums[nums[fast]];

                if (slow==fast) {
                    
                    slow=0;
                    
                    while (slow!=fast) {
                        slow=nums[slow];
                        fast=nums[fast];
                        
                    }
                    
                    return fast;
                }
            
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        int ans=findDuplicate(arr);
        System.out.println(ans);
    }
}
