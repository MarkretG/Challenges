package Task;

import java.util.Scanner;

public class Missing {
    public static  void main(String[] args)
    {
        int i, j, n,mis=0,diff,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("array elements");
        for(i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Missing");
        diff=a[0];
        for(i=0;i<n;i++)
        {
            k=a[i]-i;

            if(diff!=k)
            {
                mis=a[i]-1;
                System.out.println(mis);
                break;
            }
        }

    }
}
