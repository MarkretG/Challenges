package Task.Task;

import java.util.Scanner;


public class ArraySegment {
    public static void main(String[] args) {
        int i, j, k, x, n,count=0,tot=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println("value of x");
        x = sc.nextInt();
        int[] a = new int[n];
        for(int m=0;m<n;m+=k)
        {
            tot++;
        }
        System.out.println(tot);
        System.out.println("array elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("output");
        for (i =0;i<n;i+=k) {
                for( j=0;j<k;j++) {
                    if (i+j<n && a[i + j] == x) {
                        count++;
                        break;
                    }
                }
              }

        if (count==tot)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
