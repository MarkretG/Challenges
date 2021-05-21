package Task;

import java.util.Scanner;

public class Union {
    public static void main(String[] args)
    {
        int i,j=0,k=0;
        int a1size,a2size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        a1size = sc.nextInt();
        a2size=sc.nextInt();
        int[] a1=new int[a1size];
        int[] a2=new int[a2size];
        System.out.println("array elements");
        for (i = 0; i < a1size; i++) {
            a1[i] = sc.nextInt();
        }
        for (i= 0; i< a2size; i++) {
            a2[i] = sc.nextInt();
        }
        System.out.println("union");
         while(j<a1size&&k<a2size)
        {
            if(a1[j]<a2[k])
            {
                System.out.println(a1[j++]);
            }
            else if(a1[j]>a2[k])
            {
                System.out.println(a2[k++]);
            }
            else {
                System.out.println(a1[j++]);
                k++;
            }
        }
         while(j<a1size)
             System.out.println(a1[j++]);
         while (k<a2size)
             System.out.println(a2[k++]);
        System.out.println("intersection");
        for(j=0;j<a1size;j++)
        {
            for(k=0;k<a2size;k++)
            {
                if(a1[j]==a2[k])
                    System.out.println(a1[j]);
            }
        }
    }
}
