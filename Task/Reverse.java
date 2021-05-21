package Task;

import java.util.Scanner;

public class Reverse {
  /* public  static void rotate(String[] s,int len)
    {
        int i=0,j=len-1;
        if(i==j)
            break;
        else
            rotate(str[i]);

    }*/
    public  static  void main(String[] args)
    {
        int i,j;
        String str;
        Scanner sc= new Scanner(System.in);
        str=sc.nextLine();
        String strarray[]=str.split(" ");
        int len=strarray.length;
        /*for(i=strarray.length-1;i>=0;i--)
            System.out.print(strarray[i]+" ");*/


      /*  for(i=0,j=len-1;i<len&&j>=0;i++,j--)
        {
            if(i==j)
                break;
            else
                rotate(strarray[i],strarray[j]);
        }
        for(i=0;i<len-1;i++)
            System.out.println(strarray[i]);*/
    }
}
