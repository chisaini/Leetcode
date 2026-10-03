
public class L14 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            
            char curr = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length() || curr != strs[j].charAt(i)) {
                    return ans.toString();
                }
            }
            
                
            ans.append(curr);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String strs []= {"flower","flow","flight"};
        String ans=longestCommonPrefix(strs);
        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i));
        }
    }
}
