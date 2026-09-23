package Array.Hard;

public class L42 {
    public static int trap(int[] height) {
          int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int count = 0;
        while(left<=right){
            if(height[left]<height[right]){
                if(leftMax>height[left]){
                    count += leftMax - height[left];
                }else{
                    leftMax = height[left];
                }
            left++;
            }else{
                if(rightMax>height[right]){
                    count+= rightMax - height[right];
                }else{
                    rightMax = height[right];
                }
                right--;
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int ans = trap(height);
        System.out.println(ans);

    }
}
