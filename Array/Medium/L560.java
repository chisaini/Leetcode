import java.util.HashMap;

public class L560 {
    public static int subarraySum(int[] nums, int k) {
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix=0;
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            prefix+=nums[i];

            if (map.containsKey(prefix-k)) {
                count+=map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix,0) +1);
        }
        return count;
    }
    public static void main(String[] args) {
        int nums []= {1,2,1,2,1};
        int k = 3;
        int ans=subarraySum(nums, k);
        System.out.println(ans);
    }
    
}