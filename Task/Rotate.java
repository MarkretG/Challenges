package Task.Task;
import java.util.Scanner;

public class Rotate {
    public static  void main(String[] args)
    {
        int i, j, n,k,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("array elements");
        for(i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Rotate output");
        for(k=0;k<2;k++) {              //2 times rotate
             h=a[n-1];
            for (i = n - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = h;
        }
        for(j=0;j<n;j++)
        {
            System.out.println(a[j]);
        }
    }
}
