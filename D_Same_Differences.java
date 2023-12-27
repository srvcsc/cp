import java.util.Scanner;

public class D_Same_Differences {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt(); int[] in = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            in[i] = cin.nextInt();
        }
        
    }
}