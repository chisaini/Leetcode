package Strings.Medium;

public class L151 {
    public static  String reverseWords(String s) {
        char arr[]= new char[s.length()];
        int a=0;
        for (int i = s.length()-1; i>=0; i--) {
            if (s.charAt(i)==' ') {
                
                if (a<arr.length) {
                    arr[a++]=' ';
                }
                while (i>=0&&s.charAt(i)==' ') {
                    i--;
                }i++;
            }else{
                int j=i;
                while (j>-1&&s.charAt(j)!=' ') {
                    j--;
                }
                j++;
                i=j;
                while (j<s.length()&&s.charAt(j)!=' ') {
                   arr[a++]=s.charAt(j) ;
                   j++;
                }
            }
        }
        String result = new String(arr);
        
        return result.trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        String ans=reverseWords(s);
        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i));
        }
    }
}
