public class L74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int si=0;
        int ei=matrix.length-1;
        int i=0;
        while (si<=ei) {
            i = si + (ei - si) / 2;
            if(matrix[i][matrix[0].length-1]==target){
                return true;
            }
            else if (matrix[i][matrix[0].length-1]<target) {
                si=i+1;
            }else{
                ei=i-1;
            }
        }
        i=si;
        
        i = si;

        if (i == matrix.length) {
            return false;
        }
        int s=0;
        int e=matrix[i].length-1;
        
        while (s<=e) {
            int t = s + (e - s) / 2;
            if(matrix[i][t]==target){
                return true;
            }
            else if (matrix[i][t]<target) {
                s=t+1;
            }else{
                e=t-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=16;
        boolean ans = searchMatrix(arr, target);
        System.out.println(ans);
    }   
}
