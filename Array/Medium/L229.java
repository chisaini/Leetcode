import java.util.ArrayList;
import java.util.List;

public class L229 {
    public static  List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 1;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        int threshold = nums.length / 3;

        if (count1 > threshold) {
            ans.add(candidate1);
        }
        if (count2 > threshold) {
            ans.add(candidate2);
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr [] = {3,2,3};
        System.out.println(majorityElement(arr));
    }
}
