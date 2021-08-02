package Task.Task;
import java.util.Scanner;

public class Rearrange{
    public static void main(String[] args){
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("array elements");
        for(i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("rearrange");
        for(j= 0; j< n ; j++) {
            if (a[j] < 0){
                System.out.println(a[j]);
            }
        }
        for(j= 0; j< n ; j++) {
            if (a[j] > 0)
            {
                System.out.println(a[j]);
            }
        }
    }
}