
package Array.Medium;

import java.util.HashMap;

public class L3 {
    public static int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> lastSeen = new HashMap<>();
            int a = 0;
            int max = 0;

            for (int b = 0; b < s.length(); b++) {
                char c = s.charAt(b);

                if (lastSeen.containsKey(c)) {
                    a = Math.max(a, lastSeen.get(c) + 1);
                }

                lastSeen.put(c, b);
                max = Math.max(max, b - a + 1);
            }

            return max;
    }
    public static void main(String[] args) {
        String str="s";
        int ans=lengthOfLongestSubstring(str);
        System.out.println(ans);

    }
}