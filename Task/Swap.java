package Task.Task;
import java.util.Scanner;

public class Swap {
    static int swapping(String s)
    {
        int n,count=0,i,start,end;
        n=s.length();
        char[] str=s.toCharArray();
        for(i=0;i<n/2;i++)
        {
            start=i;
            end=n-start-1;
            while (start<end)
            {
                if(str[start]==str[end])
                    break;
                else
                    end--;
            }
            if(start==end)
                return -1;
            else
            {
                for(int j=end;j<n-start-1;j++)
                {
                    char temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s= sc.nextLine();
        int res=swapping(s);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
       int result=swapping(s);
            System.out.println(Math.max(res,result));


    }
}
