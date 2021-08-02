package Task.Task;

import java.util.Scanner;

public class AddEvenPositionSort {
    public static void main(String[] args)
    {
        int n,i,j,tem,k,l;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();

        for(i=0;i<n;i+=2) {
            for (j = i + 2; j < n; j += 2)
            {
                if (a[i] < a[j]) {
                    tem = a[j];
                    a[j] = a[i];
                    a[i] = tem;
                }
            }
        }

        for(k=1;k<n;k+=2) {
            for (l = k + 2; l< n; l += 2)
            {
                if (a[k] > a[l]) {
                    tem = a[l];
                    a[l] = a[k];
                    a[k] = tem;
                }
            }
        }

        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
