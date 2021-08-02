package Task.Task;

import java.util.Scanner;

public class MisTwo {
    public static void main(String[] args)
    {
        int i, j, n,k,mis;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("array elements");
        for(i = 0; i <n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("missing");
        for(i=0;i<n-1;i++)
        {
            j=i+1;
            k=a[j]-a[i];
            if(k!=1)
            {
                mis=a[i]+1;
                System.out.println(mis);
            }
        }

    }
}
