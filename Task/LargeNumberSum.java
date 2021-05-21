package Task;

import java.util.Scanner;

public class LargeNumberSum {
    public static void main(String[] args) {
        int a1size, a2size, i, j, m,k=0, carry = 0,size;
        Scanner sc = new Scanner(System.in);
        a1size = sc.nextInt();
        a2size = sc.nextInt();
        int[] a1= new int[a1size];
        int[] a2 = new int[a2size];
         for(i=0;i<a1size;i++)
             a1[i]=sc.nextInt();
         for(i=0;i<a2size;i++)
             a2[i]=sc.nextInt();
          size=Math.max(a1size,a2size);
         /*if(a1size>=a2size)
                 size=a1size;
         else
             size=a2size;*/
       int[] res = new int[size+1];
        for (i = a1size - 1, j = a2size - 1; i >= 0 && j >= 0; i--, j--) {
            m = a1[i] + a2[j]+carry;
            res[k]=m%10;
            carry=m/10;
            k++;
            }
        while (i>=0) {
            m=a1[i]+carry;
            res[k]=m%10;
            carry=m/10;
            i--;
            k++;
        }
        while (j>=0) {
            m = a2[j]+carry;
            res[k]=m%10;
            carry=m/10;
            j--;
            k++;
        }
        int last=k-1;
        if(carry!=0)
        {
            res[k]=carry;
            carry=0;
            last=k;
        }
        for(k=last;k>=0;k--)
           System.out.println(res[k]);
    }
}
