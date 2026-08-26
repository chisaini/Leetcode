import java.util.ArrayList;
import java.util.HashMap;

public class L3 {
    public static int lengthOfLongestSubstring(String s) {
            int a=0;
            int b=1;
            int max=0;
            if(s.length()==1){
                return 1;
            }
            while (b<s.length()) {

                for (int i = a; i <b; i++) {
                    if (s.charAt(i)==s.charAt(b)) {
                        a=i+1;
                        break;
                    }
                }
                b++;
                max=Math.max(max,b-a);
            }
            return max;
            // HashMap<Character, Integer> lastSeen = new HashMap<>();
            // int a = 0;
            // int max = 0;

            // for (int b = 0; b < s.length(); b++) {
            //     char c = s.charAt(b);

            //     if (lastSeen.containsKey(c)) {
            //         a = Math.max(a, lastSeen.get(c) + 1);
            //     }

            //     lastSeen.put(c, b);
            //     max = Math.max(max, b - a + 1);
            // }

            // return max;
    }
    public static void main(String[] args) {
        String str="s";
        int ans=lengthOfLongestSubstring(str);
        System.out.println(ans);

    }
}