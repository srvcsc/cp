import java.util.Scanner;

public class D_Distinct_Split {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt(); String s = cin.next();
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            ++arr[c - 'a'];
        }
        int right = 0;
        for (var tp : arr) {
            if (tp != 0) {
                ++right;
            }
        }
        int ans = 0;
        int[] lt = new int[26];
        int left = 0;
        for (char c : s.toCharArray()) {
            ++lt[c - 'a'];
            --arr[c - 'a'];
            if (lt[c - 'a'] == 1) {
                ++left;
            }
            if (arr[c - 'a'] == 0) {
                --right;
            }
            ans = Math.max(ans, left + right);
        }
        System.out.println(ans);
    }
}