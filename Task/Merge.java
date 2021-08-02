package Task.Task;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args)
    {
        int k=0,l=0,a1size,a2size,i,m=0;
         Scanner sc=new Scanner(System.in);
        a1size=sc.nextInt();
        a2size=sc.nextInt();
        int a1[]=new int[a1size];
        int a2[]=new int[a2size];
        for(i=0;i<a1size;i++)
          a1[i]= sc.nextInt();
        for(i=0;i<a2size;i++)
            a2[i]= sc.nextInt();
        while(k<a1size && l<a2size)
        {
            if(a1[k]<a2[l])
                System.out.println(a1[k++]);
            if(a1[k]>a2[l])
                System.out.println(a2[l++]);
            else
            {
                System.out.println(a1[k++]);
                l++;
            }
        }
        while(k<a1size)
            System.out.println(a1[k++]);
        while (l<a2size)
            System.out.println(a2[l++]);

    }
}
