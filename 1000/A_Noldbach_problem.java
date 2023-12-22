import java.util.ArrayList;
import java.util.Scanner;

public class A_Noldbach_problem {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
       // tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt(), k = cin.nextInt();
        if (k == 0) {
            System.out.println("YES");
            return;
        }
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 2; i <= n; ++i) {
            if (isp(i)) {
                prime.add(i);
            }
        }
        int pn = prime.size();
        if(pn < k || n < 13) {
            System.out.println("NO");
            return;
        }
        int count = 0;
        for (int p : prime) {
            p -= 1;
            for (int i = 0; i < pn; ++i) {
                if (i == pn - 1) {
                    continue;
                }
                int sum = prime.get(i) + prime.get(i + 1);
                if (sum == p) {
                    ++count;
                } else if (sum < p) {

                } else {
                    break;
                }
            }
        }
        if (count >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isp(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}