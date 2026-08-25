import java.util.ArrayList;
import java.util.Arrays;

public class L56 {  
    public static int[][] merge(int[][] intervals) {
         Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        int i=0;
        ArrayList<int[]> arr=new ArrayList<>();
        while(i<n){
          int start=intervals[i][0];
          int end=intervals[i][1];
          
          int j=i+1;
          while(j<n && intervals[j][0]<=end){
            end=Math.max(end,intervals[j][1]);
            j++;
          }
          arr.add(new int[]{start,end});
          i=j;
        }
        return arr.toArray(new int[arr.size()][]);
    }
    public static void main(String[] args) {
        int arr[][]={{0,2},{1,4},{3,5}};
        
        int[][]ans=merge(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+",");
            }System.out.println();
        }
        
        
    }
}
