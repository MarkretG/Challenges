package Task.Task;

import java.util.Scanner;

public class CountPairSum {
    public static void main(String[] args)
    {
        int i, j, n,count=0,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        n = sc.nextInt();
        sum=sc.nextInt();
        int[] a = new int[n];
        System.out.println("array elements");
        for(i = 0; i <n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("count pair sum");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((a[i]+a[j])==sum)
                {
                  ++ count;

                    System.out.println(a[i]+" , "+a[j]);
                }
            }
        }
        System.out.println(count);
    }
}
