import java.util.Arrays;

public class L62 {
    public static  int uniquePaths(int m, int n) {
        int arr[]=new int[n];
        Arrays.fill(arr, 1);
        for (int i = 1; i <m; i++) {
            for (int j =1 ; j < n; j++) {
                arr[j]+=arr[j-1];
            }
        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m, n));
    }
}
