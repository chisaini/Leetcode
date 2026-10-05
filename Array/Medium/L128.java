
import java.util.HashSet;

public class L128 {
    public static  int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int max=0;
        for (int num:set) {
            if (!set.contains(num-1)) {
                int count=0;
                int curr=num;
                while (set.contains(curr)) {
                    curr++;
                    count++;
                }
                max=Math.max(max, count);
            }
            
        }
        return max;
    }

    public static void main(String[] args) {
        int arr []={0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
}
