public class L344 {
    public static char[] reverse(char [] s){
        int left=0;
        int right=s.length-1;
        while (left<right) {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        return s;
    }
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverse(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
