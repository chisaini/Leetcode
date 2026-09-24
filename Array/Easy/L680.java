public class L680 {
    public static  boolean helperPalindrome(String s,int i,int j){
        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static  boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)) {
                return (helperPalindrome(s, i+1, j)||helperPalindrome(s, i, j-1));
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(validPalindrome(s));


    }
}
