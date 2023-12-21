import java.util.Scanner;

public class A_Chat_room {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
       // tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        String s = cin.next(), h = "hello";
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == h.charAt(i)) {
                ++i;
                if (i >= 5) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}