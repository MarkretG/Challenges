package Task;

import java.util.Scanner;

public class MisAnotherWay {
    public static  void main(String[] args)
    {
        int i,n,tot,sum=0,mis;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        n = sc.nextInt();
        tot=n*(n+1)/2;
        int[] a = new int[n];
        System.out.println("array elements");
        for(i = 0; i < n-1; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Missing");
        for(i=0;i<n-1;i++)
        {
            sum=sum+a[i];
        }
        mis=tot-sum;
        System.out.println(mis);
    }
}
