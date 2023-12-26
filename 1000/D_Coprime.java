import java.util.HashSet;
import java.util.Scanner;

public class D_Coprime {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt(); int[] input = new int[n];
        for (int i = 0; i < n; ++i) {
            input[i] = cin.nextInt();
        }
        int ans = -1;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = n - 1; i >= 1; --i) {
            if (hs.contains(input[i])) {
                continue;
            } else {
                hs.add(input[i]);
            }
            int j = i;
            while (j >= 0 && gcd(input[i], input[j]) != 1) {
                --j;
            }
            if (j >= 0) {
                if (ans < (i + j + 2)) {
                    ans = i + j + 2;
                }
            }
        }
        System.out.println(ans);
    }
    public static int gcd(int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}