package Task.Task;

import java.math.BigInteger;
import java.util.Scanner;

public class  Factorial {

    public  static void main(String[] arg)
    {
        int n,i;
        BigInteger fac=new BigInteger("1");

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<=n;i++)
        {
            fac=fac.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fac);
    }
}
