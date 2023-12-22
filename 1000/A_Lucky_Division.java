import java.util.Scanner;

public class A_Lucky_Division {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        //tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt();
        for (int i = 1; i * i <= n; ++i) {
            if (n % i == 0) {
                int o = n / i;
                if (isl(i) || isl(o)) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

    public static boolean isl(int n) {
        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            if (c != '4' && c != '7') {
                return false;
            }
        }
        return true;
    }
}