package Task.Task;
import java.util.Scanner;

public class Given {
    public static void main(String[] args)
    {
        int i=0,j,ans;
        String s;
        char k;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        char[] str =s.toCharArray();
        int len= str.length;
        System.out.println(len);

        while(i<len)
        {

              if(str[i]>=48 && str[i]<=57)
              {
                  k = str[i - 1];
                  ans = 0;
                  while (i<len && str[i] >= 48 && str[i] <= 57)
                  {
                      ans = ans * 10 + (str[i] - 48);
                      ++i;
                  }
                  for (j = 0; j < ans; j++)
                      System.out.print(k);
              }
              else
                  i++;
        }

    }

}

