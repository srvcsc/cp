import java.util.Scanner;

public class D_Black_and_White_Stripe {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt(), k = cin.nextInt();
        String input = cin.next();
        int count = 0;
        for (int i = 0; i < k; ++i) {
            if (input.charAt(i) == 'W') {
                ++count;
            }
        }
        int ans = count;
        for (int i = k; i < input.length(); ++i) {
            if (input.charAt(i) == 'W') {
                ++count;
            }
            if (input.charAt(i - k) == 'W') {
                --count;
            }
            ans = Math.min(ans, count);
        }
        System.out.println(ans);
    }
}