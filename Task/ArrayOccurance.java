package Task.Task;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOccurance {
    public static void main(String[] args) {
        int a1size, i, j;
        Scanner sc = new Scanner(System.in);
        a1size = sc.nextInt();
        int[] a1 = new int[a1size];
        for (i = 0; i < a1size; i++)
            a1[i] = sc.nextInt();

        Arrays.sort(a1);

        for(i=0;i<a1size;i++)
        {
            int count=1;
            if(a1[i]!=-1)
            {
                for (j = i + 1; j < a1size; j++) {
                    if (a1[i] == a1[j])
                    {
                        a1[j]=-1;
                        count++;
                    }
                }
                System.out.println(a1[i]+"-"+count);
            }

        }
    }
}
