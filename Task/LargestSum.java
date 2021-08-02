package Task.Task;
import java.util.Scanner;

public class LargestSum {
    public static void main(String[] args) {
        int n, i, j,k=0,max=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (i = 0; i < n; i++) {
            int sum = a[i];
            for (j = i + 1; j < n; j++)
            {
                sum = sum + a[j];
                if(max<sum)
                    max=sum;
            }

        }
        System.out.println(max);



    }
}
