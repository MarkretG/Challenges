package Task;

import java.util.Scanner;

public class MaxMin {
    public static  void main(String[] args)
    {
        int i,j,n,min,max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        n = sc.nextInt();
        int[] a=new int[n];
        System.out.println("array elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        max=a[0];
        min=a[0];                  //find Range of array=max-min;
        for(i=0;i<n;i++)           //coefficient range=(max-min)/(max+min)
        {
            if(min>a[i])
                min=a[i];
            if(max<a[i])
                max=a[i];
        }
        System.out.println("max" +max +"\t"+"min" +min);

    }
}
