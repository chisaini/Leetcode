
public class L11 {
    public static int maxArea(int[] height) {
        int a=0;
        int b=height.length-1;
        int maxvol=0;
        while (a!=b) {
            int vh=Math.min(height[a],height[b]);
            int vb=b-a;
            int vol=vh*vb;
            maxvol=Math.max(maxvol, vol);
            if(height[a]>=height[b]){
                b--;
            }else{
                a++;
            }
        }
        return maxvol;

    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int ans=maxArea(arr);
        System.out.println(ans);

    }
    
}