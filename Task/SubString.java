package Task;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args)
    {
        int i,j,count=0;
        String str1,str2;
        Scanner sc=new Scanner(System.in);
        str1= sc.nextLine();
        str2= sc.nextLine();
        for(i=0;i<str1.length();i++)
        {
            for(j=0;j<str2.length();j++)
            {
                if((i+j)<str1.length() && str1.charAt(i+j)==str2.charAt(j))
                    count++;
                else
                    break;
            }
            if(count==str2.length()) {
                System.out.println(i);
                break;
            }
        }

        if(count!=str2.length())
            System.out.println("-1");
    }
}
