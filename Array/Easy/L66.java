import java.util.Arrays;

public class L66 {
    public static int[] plusOne(int[] digits) {
      for (int i = digits.length-1; i >=0; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
      }
      int[] result = new int[digits.length + 1];
      result[0]=1;
      return result;
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1,0};
        int ans[]=plusOne(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}