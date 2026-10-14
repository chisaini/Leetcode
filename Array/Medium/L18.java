import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int j = 0; j < nums.length-3; j++) {
            if (j>0&&nums[j]==nums[j-1]) {
                continue;
            }
            for (int i = j+1; i < nums.length - 2; i++) {
                int left = i + 1;
                int right = nums.length - 1;
                if (i > j+1 && nums[i] == nums[i - 1]) {
                    continue;
                }
                while (left < right) {
                    long sum =(long) nums[j] +nums[i] +nums[left] +nums[right];
                    if (sum == target) {
                       ans.add(Arrays.asList(nums[j], nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                }

            }
        }
       
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 2, 2 };
        int target = 8;
        List<List<Integer>> ans = fourSum(arr, target);

        for (List<Integer> list : ans) {
            System.out.println();
            for (int num : list) {
                System.out.print(num);
                System.out.print(",");
            }
        }
    }
}
