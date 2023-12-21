import java.util.Scanner;

public class A_String_Task {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
       // tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        String s = cin.next();
        StringBuilder ans = new StringBuilder();
        for (var c : s.toCharArray()) {
            if (isVowel(c)) {

            } else {
                ans.append(c);
            }
        }
        String ss = new String(ans).toLowerCase();
        for (char c : ss.toCharArray()) {
            System.out.print(".");
            System.out.print(c);
        }
    }

    public static boolean  isVowel(char c) {
        char ch = Character.toLowerCase(c);
        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u': case 'y': return true;
            default: return false;
        }
    }
}