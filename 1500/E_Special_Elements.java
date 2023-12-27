import java.util.HashSet;
import java.util.Scanner;

public class E_Special_Elements {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int tc = 1;
        tc = cin.nextInt();
        while (tc > 0) {
            srvkr();
            --tc;
        }
    }

    public static void srvkr() {
        int n = cin.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; ++i) {
            input[i] = cin.nextInt();
        }
        if (n <= 2) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        HashSet<Integer> fd = new HashSet<>(), nfd = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            if (fd.contains(input[i])) {
                ++ans;
            } else if (nfd.contains(input[i])) {

            } else {
                if (ise(input[i], input)) {
                    ++ans;
                    fd.add(input[i]);
                } else {
                    nfd.add(input[i]);
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean ise(int n, int[] input) {
        int size = input.length;
        int j = 0, cs = 0;
        for (int i = 0; i < size; ++i) {
            cs += input[i];
            if (cs == n) {
                if (i - j >= 1) {
                    return true;
                }
            } else if (cs < n) {

            } else {
                while (cs > n) {
                    cs -= input[j];
                    ++j;
                }
                if (cs == n) {
                    if (i - j >= 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}