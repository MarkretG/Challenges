package Task.Task;

import java.util.Scanner;

public class XFormat {
    static  void xFormat(String s,int len)
    {
        int i, j, k;
        for (i = 0; i <len; i++) {
            j=len-1-i;
            for(k=0;k<len;k++)
            {
                if (k == i|| k==j)
                    System.out.print(s.charAt(k));
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }



        //another way

        /*for (i = 0; i <len; i++) {
            for(j=0;j<len;j++)
            {
                if (i == j|| (i+j)==len-1)
                    System.out.print(s.charAt(j));
                else
                    System.out.print(" ");
            }
            System.out.println("");*/
    }
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int len = s.length();
        xFormat(s,len);

    }
}


