import java.util.Scanner;

public class A_Raising_Bacteria {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        // tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt(); int ans = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                ++ans;
            }
            n /= 2;
        }
        System.out.println(ans);
    }
}