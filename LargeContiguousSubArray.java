/*
 sub array does not have negative numbers

 */

package Task;
import java.util.Scanner;
public class LargeContiguousSubArray {
    public static void main(String[] args)
    {
        int n, i, j,max=0,start=0,end=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for(i=0;i<n;i++)
        {
            int sum=0;
            if(a[i]>0)
              sum=a[i];
            for(j=i+1;j<n;j++)
            {
                if(a[j]>0) {
                    start=i;
                    end=j;
                    sum = sum + a[j];
                }
                else
                    break;
            }
            if(sum>max) {
                max = sum;
            }
        }
        System.out.println(max);
        for(int k=start;k<=end;k++)
            System.out.println(a[k]);
    }
}

