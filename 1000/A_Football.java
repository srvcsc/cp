import java.util.HashMap;
import java.util.Scanner;

public class A_Football {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        // tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt();
        HashMap<String, Integer> hm = new HashMap<>();
        while (n > 0) {
            String t = cin.next();
            hm.put(t, hm.getOrDefault(t, 0) + 1);
            --n;
        }
        String ans = null; int maxCount = Integer.MIN_VALUE;
        for (var i : hm.entrySet()) {
            if (i.getValue() > maxCount) {
                maxCount = i.getValue();
                ans = i.getKey();
            }
        }
        System.out.println(ans);
    }
}