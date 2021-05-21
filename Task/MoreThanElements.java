package Task;

import java.util.Arrays;
import java.util.Scanner;

public class MoreThanElements {
    public static void main(String[] args)
    {
        int i,j,n,k,l,count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        n = sc.nextInt();
        System.out.println("enter k");
        k=sc.nextInt();
        int[] a=new int[n];
        System.out.println("array elements");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
            l=n/k;
            for(i=0;i<n;i++)
            {
                count=1;
                for(j=i+1;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        count++;
                    }
                }
                if(count>l)
                {
                    System.out.println(a[i]);
                }
            }
        }
    }

