import java.util.ArrayList;
import java.util.Scanner;

public class C_Traffic_Light {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt(); char cc = cin.next().charAt(0);
        String input = cin.next();
        if (cc == 'g') {
            System.out.println(0);
            return;
        }
        int[] dist = new int[n];
        boolean flag = true; int fgi = -1, lni = -1;
        for (int i = n - 1; i >= 0; --i) {
            if (input.charAt(i) == 'g') {
                dist[i] = 0; fgi = i;
                flag = false;
            } else {
                if (flag) {
                    dist[i] = -1; lni = i;
                } else {
                    dist[i] = dist[i + 1] + 1;
                }
            }
        }
        if (lni != -1) {
            for (int i = lni; i < n; ++i) {
                dist[i] = fgi + 1 + (n - (i + 1));
            }
        }
        ArrayList<Integer> options = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            if (input.charAt(i) == cc) {
                options.add(dist[i]);
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int option : options) {
            if (option > ans) {
                ans = option;
            }
        }
        System.out.println(ans);
    }
}