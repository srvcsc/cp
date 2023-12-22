import java.util.Scanner;

public class A_Theatre_Square {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        // tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt(), m = cin.nextInt(), a = cin.nextInt();
        if (n > m) {
            int t = n; n = m; m = t;
        }
        int l = n / a + (n % a == 0 ? 0 : 1);
        int r = m / a + (m % a == 0 ? 0 : 1);
        System.out.println(l * (long)r);
    }
}