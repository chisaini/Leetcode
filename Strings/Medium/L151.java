package Strings.Medium;

public class L151 {
    public static  String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i=s.length()-1;
        while (i>=0) {
            while (i>=0&&s.charAt(i)==' ') {
                i--;
            }
            
            int j=i;
            while (j>=0&&s.charAt(j)!=' ') {
                j--;
            }
            
                ans.append(' ');
            
            ans.append(s,j+1,i+1);
            
            i=j;

        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        String ans=reverseWords(s);
        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i));
        }
    }
}
