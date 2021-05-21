package Task;


import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        int n, i,  j,flag=0,flag1=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (a[i] == 0) {
                System.out.println("true");
                flag=1;
                break;
            }
            int sum=a[i];
            for (j = i + 1; j < n; j++) {
                sum = sum + a[j];
                if (sum == 0) {
                    System.out.println("true");
                    flag1=1;
                    break;

                }
            }

        }
        if(flag==0 && flag1==0)
            System.out.println("false");
    }
}