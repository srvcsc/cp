import java.util.Scanner;

public class A_Expression {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        // tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int a = cin.nextInt(), b = cin.nextInt(), c = cin.nextInt();
        int ans = Integer.MIN_VALUE;
        int[] arr = {a + b + c, a * b * c, (a + b) * c, a * (b + c)};
        for (var i : arr) {
            if (i > ans) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}