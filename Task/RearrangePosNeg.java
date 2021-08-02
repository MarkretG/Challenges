package Task.Task;

import java.util.Scanner;

public class RearrangePosNeg {
    public static void main(String[] args)
    {
        int i,j,k,n,m,remove;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Array elements");
        for(i=0;i<n;i++)
         a[i]=sc.nextInt();

        for(k=0;k<n;k++)
        {
            if (a[k]>0 && k%2==0)
            {
                for (j = k + 1; j < n; j++)
                {
                    if (a[j] < 0)
                    {
                        remove = a[j];
                        while (j > k)
                        {
                            a[j] = a[j - 1];
                            j--;
                        }
                        a[k] = remove;
                        break;
                    }
                }
            }

                if (a[k]<0 && k%2!=0)
                {
                    for(j=k+1;j<n;j++)
                    {
                        if(a[j]>0)
                        {
                            remove=a[j];
                            while (j>k)
                            {
                                a[j]=a[j-1];
                                j--;
                            }
                            a[k]=remove;
                            break;
                        }

                    }
                }
            System.out.println(a[k]);
        }

    }
}
