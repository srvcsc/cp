import java.util.Scanner;

public class A_cAPS_lOCK {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        // tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        StringBuilder input = new StringBuilder(cin.next());
        int len = input.length();
        if (len == 1) {
            if (Character.isUpperCase(input.charAt(0))) {
                System.out.println(input.toString().toLowerCase());
            } else {
                System.out.println(input.toString().toUpperCase());
            }
            return;
        }
        int lower = 0, upper = 0;
        for (char ch : input.toString().toCharArray()) {
            if (Character.isUpperCase(ch)) {
                ++upper;
            } else {
                ++lower;
            }
        }
        if (upper == len) {
            System.out.println(input.toString().toLowerCase());
        } else if (lower == 1 && Character.isLowerCase(input.charAt(0))) {
            System.out.println(Character.toUpperCase(input.charAt(0)) + "" + input.substring(1).toLowerCase());
        } else {
            System.out.println(input.toString());
        }
    }
}