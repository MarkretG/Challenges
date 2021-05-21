package Task;

import java.util.Scanner;

public class Reverse
{
   public  static  void main(String[] args)
    {
        int i,j;
        String str;
        Scanner sc= new Scanner(System.in);
        str=sc.nextLine();
        String strarray[]=str.split(" ");
        int len=strarray.length;
        for(i=strarray.length-1;i>=0;i--)
            System.out.print(strarray[i]+" ");
    }
}
