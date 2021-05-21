package Task;

import java.util.Scanner;

public class Multiplication {
    public  static void main(String[] args)
    {
        int num1,num2,i,sum=0;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();

        for(i=0;i<num2;i++)
        {
            sum=sum+num1;
        }
        System.out.println(sum);
    }
}
