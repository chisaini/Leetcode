import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
          List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length-3; i++) {
                if (i>0&&nums[i]==nums[i-1]) {
                    continue;
                }
                for (int i2 = i+1; i2 < nums.length-2; i2++) {
                    if (i2>i+1&&nums[i2]==nums[i2-1]) {
                    continue;
                    }
                    int j=i2+1;
                    int k=nums.length-1;
           
                    while (j<k) {
                        long sum=(long)nums[i]+nums[i2]+nums[j]+nums[k];
                
                        if(sum>target){
                            k--;
                        }
                        else if(sum<target){
                            j++;
                        }
                        else if (sum==target){
                            List<Integer> squad = new ArrayList<>();
                            squad.add(nums[i]);
                            squad.add(nums[i2]);
                            squad.add(nums[j]);
                            squad.add(nums[k]);

                            ans.add(squad);
                    
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
            }
            return ans;
    }

    public static void main(String[] args) {
        int arr []={2,2,2,2,2};
        int target=8;
        List<List<Integer>> ans=fourSum(arr,target);
        
        for (List<Integer> list : ans) {
            System.out.println();
            for (int num : list) {
                System.out.print(num);
                System.out.print(",");
            }
        }
    }
}
