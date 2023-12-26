import java.util.Scanner;

public class Main {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n;  ++i) {
            input[i] = cin.nextInt();
        }

    }

    public static int gcd(int a, int b) {
        
    }
}