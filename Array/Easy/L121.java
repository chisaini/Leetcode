public class L121 {
    public static int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int min=0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[min]>prices[i]){
                min=i;
            }
            int pro=prices[i]-prices[min];
            if(pro>max){
                max=pro;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int prices []={7,1,5,3,6,4};
        int ans=maxProfit(prices);
        System.out.println(ans);

    }
}
