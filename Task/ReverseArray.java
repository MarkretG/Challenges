package Task;

import java.util.Scanner;

public class ReverseArray {
    public static  void main(String[] args)
    {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        n = sc.nextInt();
        int[] a=new int[n];
        System.out.println("array elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
