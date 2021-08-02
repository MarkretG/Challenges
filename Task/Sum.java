package Task.Task;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args)
    {
        int i,j,arraysize,N,sum,k;
        Scanner sc=new Scanner(System.in);
        arraysize=sc.nextInt();
        int a[]=new int[arraysize];
        for(i=0;i<arraysize;i++)
            a[i]=sc.nextInt();
        System.out.println("enter sum");
        N=sc.nextInt();

        for(i=0;i<arraysize;i++) {
               sum=a[i];
                 if(sum==N)
                     System.out.println("{"+a[i]+"}");
                for (j = i + 1; j <arraysize; j++) {
                    sum = sum + a[j];
                    if (sum == N)
                    {
                        System.out.print("{");
                        for(k=i;k<=j;k++) {
                            System.out.print(a[k]+" ");
                        }
                        System.out.println("}");
                }
            }
        }

    }
}
