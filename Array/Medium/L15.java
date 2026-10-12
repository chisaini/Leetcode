import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (left < right) {
                int sum = (nums[i] + nums[left] + nums[right]);
                if (sum == 0) {
                    List<Integer> grp = new ArrayList<>();
                    grp.add(nums[i]);
                    grp.add(nums[left]);
                    grp.add(nums[right]);
                        ans.add(grp);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> ans = threeSum(arr);

        for (List<Integer> list : ans) {
            System.out.println();
            for (int num : list) {
                System.out.print(num);
                System.out.print(",");
            }
        }
    }
}
