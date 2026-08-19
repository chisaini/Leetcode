public class L88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int a=m-1;
        int b=n-1;
        int c=m+n-1;
        while (a>=0&&b>=0&&c>=0) {
            if(nums1[a]<=nums2[b]){
                nums1[c]=nums2[b];
                b--;
                c--;
            }
            else if(nums1[a]>nums2[b]){
                nums1[c]=nums1[a];
                nums1[a]=0;
                a--;
                c--;
            }
        }
        while (c>=0&&b>=0) {
            if(nums1[c]==0){
                nums1[c]=nums2[b];
                b--;
                c--;
            }
        }
        return nums1;
    }
    public static void main(String[] args) {
        int arr1[]={1,5,6,0,0,0};
        int arr2[]={2,3,6};
        int m=3;
        int n=3;
        int arr[]=merge(arr1, m, arr2, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
