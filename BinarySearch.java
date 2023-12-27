public class BinarySearch {

    public static int binary(int[] num ,int n, int s, int e)
    {
        if(s>e)
        {
            return -1;
        }

        int m=(s+e)/2;

        if(num[m]==n)
        {
            return m;
        }
        if(num[m]<n)
        {
            return binary(num, n, m+1,e);
        }

        return binary(num,n,s,m-1);
    }

    public static void main(String[] args) {

        int num[]={1,3,5,6,88,99};
        int target=6;
        System.out.println("Element is present at index "+binary(num,target,0,num.length-1));
        
    }
    
}
