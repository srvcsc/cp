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
        int ans = 0;
        int[] lt = new int[26];
        for (char c : s.toCharArray()) {
            ++lt[c - 'a'];
            --arr[c - 'a'];
            ans = Math.max(ans, sum(arr, lt));
        }
        System.out.println(ans);
    }

    public static int sum(int[] left, int[] right) {
        int t1 = 0;
        for (var i : left) {
            if (i != 0) {
                ++t1;
            }
        }
        int t2 = 0;
        for (var i : right) {
            if (i != 0) {
                ++t2;
            }
        }
        return t1 + t2;
    }
}