public class L509 {
    public static int fib(int n) {
        if (n==1) {
           return 1; 
        }
        int a=0;
        int b=1;
        int sum=0;
        for (int i = 3;i <= n+1;i++) {
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
