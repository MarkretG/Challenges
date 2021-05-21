package Task;

import java.util.Scanner;

public class Sinx {
    /*static void cal(float rad,float res,int n)
    {
        int count,sign=1;
        for(count=1;count<=n;count++)
        {
            res = res + sign * ((Math.pow(rad, count) / (double) factorial(count)));
            sign*=-1;
        }
        System.out.println(res);
    }
    static void factorial(double num) {
        int count1;
        double sum = 1;
        for (count1 = 1; count1 <= num; count1++)
            sum = sum * count1;
        System.out.println(sum);
    }*/

    public static void main(String[] args)
    {
        double a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=Math.toRadians(a);
        System.out.println(Math.sin(b));
        /*float res=0,rad;
        int x,n;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        n=sc.nextInt();
        rad= (float) (x*(3.14159/180));
        cal(rad,res);*/
    }
}
