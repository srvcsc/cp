import java.util.Scanner;

public class B_Array_Recovery {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt(); int[] in = new int[n];
        for (int  i = 0; i < n; ++i) {
            in[i] = cin.nextInt();
        }
        int[] ans = new int[n]; ans[0] = in[0];
        for (int i = 1; i < n; ++i) {
            if (in[i] == 0) {
                ans[i] = ans[i - 1];
                continue;
            }
            int o = ans[i - 1] + in[i]; int oo = ans[i - 1] - in[i];
            if (oo >= 0) {
                System.out.println(-1);
                return;
            }
            ans[i] = o;
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}