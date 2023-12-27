public class fibonacci {

    public static void main(String[] args) {

       int ans=fibo(4);
        System.out.print(ans);
    }
    
    public static int fibo(int n)
    {
        if(n<2)
        {
            return 1;
        }

        return n*fibo(n-1);
    }
}
