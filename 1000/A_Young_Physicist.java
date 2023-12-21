import java.util.Scanner;

public class A_Young_Physicist {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
       // tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt();
        int[][] input = new int[n][3];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 3; ++j) {
                input[i][j] = cin.nextInt();
            }
        }
        for (int j = 0; j < 3; ++j) {
            long sum = 0;
            for (int i = 0; i < n; ++i) {
                sum = sum + input[i][j];
            }
            if (sum != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}