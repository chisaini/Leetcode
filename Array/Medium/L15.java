import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
           int j=i+1;
           int k=nums.length-1;
           
           while (j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else if (sum==0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    
                        ans.add(triplet);
                    
                    k--;
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
           }
        }
        return ans;
    }
    public static void main(String[] args) {

       int arr []={-1,0,1,2,-1,-4};

        List<List<Integer>> ans=threeSum(arr);
        
        for (List<Integer> list : ans) {
            System.out.println();
            for (int num : list) {
                System.out.print(num);
                System.out.print(",");
            }
        }
    }
}
