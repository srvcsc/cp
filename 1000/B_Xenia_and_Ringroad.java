import java.util.Scanner;

public class B_Xenia_and_Ringroad {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        // tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        int n = cin.nextInt(), m = cin.nextInt();
        int[] taskList = new int[m];
        for (int i = 0; i < m; ++i) {
            taskList[i] = cin.nextInt();
        }
        int lastCompletedTask = 1;
        long ans = 0;
        for (int i : taskList) {
            if (i >= lastCompletedTask) {
                ans = ans + (i - lastCompletedTask);
            } else {
                ans = ans + (n - lastCompletedTask + i);
            }
            lastCompletedTask = i;
        }
        System.out.println(ans);
    }
}