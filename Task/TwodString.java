package Task;

import java.util.Scanner;

public class TwodString {
    public static void main(String[] args)
    {
        int i,j,count=0,count1=0;
        String[][]  str={{"Ram","Syam"},{"Akil","Syam"},{"Nikil","Ram"},{"Subhash","Ram"},{"Karthik","Akil"}};
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int num=sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(num==1&& s.equals(str[i][1]))
            {
                count++;
                System.out.println(str[i][0]);
            }
            if(num==2 && s.equals(str[i][1]))
            {
                for(j=0;j<5;j++)
                    if(str[j][1].equals(str[i][0]))
                    {
                        count1++;
                        System.out.println(str[j][0]);
                    }
            }

        }
        if(count!=0)
            System.out.println(count);
        else
            System.out.println(count1);

       // System.out.println(str[4][0]);
    }
}
