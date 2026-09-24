package Array.Hard;

import java.util.ArrayDeque;
import java.util.Deque;

public class L239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ans=0;
        Deque<Integer> deque = new ArrayDeque<>();
        int resultIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            while (!deque.isEmpty()&&deque.peekFirst()<=i-k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty()&&nums[deque.peekLast()]<=nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i>=k-1) {
                result [ans++]=nums[deque.peekFirst()];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int ans[]=maxSlidingWindow(arr, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
