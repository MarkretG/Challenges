package Task;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSum {
    public static void main(String[] args)
    {
        int n, i, j,temp,count=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        //sort
        /*for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }*/
        Arrays.sort(a);

        //
        int max=0;
        for(i=max;i<n;i++) {
            count = 1;
            for (j = i + 1; j < n; j++) {
                if (a[i] + j == a[j])
                    ++count;
            }
            if (max < count)
                max = count;

        }
        System.out.println(max );

    }
}
