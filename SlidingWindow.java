package Task;

import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        int k=3,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new  int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
                int max = a[i];
                for (int j = i; j < k; j++) {
                    if (a[j] > max)
                        max = a[j];
                }
                System.out.println(max);
                k++;
            if(k==n)
                break;
        }


    }
}
