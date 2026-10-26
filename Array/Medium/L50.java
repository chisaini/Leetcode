public class L50 {
    public static double myPow(double x, int n) {
        long N = n;
boolean negative = N < 0;

    if (negative) {
        N = -N;
    }

    double ans = 1.0;

    while (N > 0) {
        if ((N & 1) == 1) {
            ans *= x;
        }

        x *= x;
        N >>= 1;
    }

    return negative ? 1.0 / ans : ans;
        // long N=n;
        // if(N<0){
        //     N=-N;
        //     x=1/x;
        // }
        // double ans=1.0;
        // while (N>0) {
        //     if(N%2!=0){
        //         ans= ans*x;
                
        //     }
        //     x = x*x;
           
        //     N=N/2;
        // }
        // return ans;
    }
    public static void main(String[] args) {
        double x=3;
        int p=4;
    
        double   ans= myPow(x, p);
        System.out.println(ans);
    }
}

