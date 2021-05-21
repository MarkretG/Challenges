package Task;

import java.util.Scanner;

public class NonRepeat {
    public static  void main(String[] args)
    {
        int n, i, j,res=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for(i=0;i<n;i++)
            res=res^a[i];
        System.out.println(res);
    }
}
