
public class L2965 {
     public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n =grid.length;
        int [] freq = new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }
        int missing = 0;
        int repeated = 0;
        for(int i =1;i<=n*n;i++){
            if(freq[i]==2){
                repeated = i;
            }if(freq[i]==0){
                missing = i;
            }
        }
        return  new int []{repeated,missing};
    }
    public static void main(String[] args) {
        int mat[][]={{1,3},{2,2}};
        int arr[]=findMissingAndRepeatedValues(mat);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}