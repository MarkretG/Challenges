package Task;

import java.util.Scanner;

public class Print {
    public static void main(String[] args)
    {
        int i,j,k,mid,m;
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        mid=s.length()/2;
        for(i=0;i<mid;i++)
        {

            for(k=0;k<s.length()*2+1;k++) {

                if (k == s.length() * 2 - (2 * i))
                {

                    for (j = 0; j<=i; j++) {
                        System.out.print(s.charAt(j));
                    }
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        //
        for(i=mid;i<s.length();i++)
        {

            for(k=0;k<s.length()*2+1;k++) {
                if(i==s.length()-1) {
                    for (m = 0; m <= i; m++)
                        System.out.print(s.charAt(m));
                    break;
                }
               if (k == (s.length() * 2) - ((2 * i)+1))
                {

                    for (j= 0; j<=i; j++) {
                        System.out.print(s.charAt(j));
                    }
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}