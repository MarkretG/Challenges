package Task;
import java.util.Scanner;
public class ReplaceDigit {
    static void replace(char[] str)
    {
        int i,num,initial=1,sum=0,digit=0;
        for(i=0;i<str.length;i++)
        {
            if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
            {
                num = i * 100;
                while (initial <= num)
                {
                    int count = 0, j = 2;
                    while (j <= initial / 2)
                    {
                        if (initial % j == 0)
                        {
                            count++;
                            break;
                        }
                        j++;
                    }
                    if (count == 0 && initial != 1)
                        sum = sum + initial;
                    initial++;
                }
                while (sum > 0 || digit> 9)
                {
                    if (sum == 0)
                    {
                        sum = digit;
                        digit = 0;
                    }
                    digit = digit + sum % 10;
                    sum = sum / 10;
                }
                System.out.print(digit);

            }
            else
                System.out.print(str[i]);
        }

    }
    public static void main(String[] args)
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char[] str=s.toCharArray();
        replace(str);
    }
}
