import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_Dragons {
    static Scanner cin = new  Scanner(System.in);
    public static void main(String[] args) {
        int tc = 1;
        // tc = cin.nextInt();
        while (tc > 0) {srvkr(); --tc;}
    }

    public static void srvkr() {
        long s = cin.nextLong(), n = cin.nextInt();
        ArrayList<Pair> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            arr.add(new Pair(cin.nextInt(), cin.nextInt()));
        }
        Collections.sort(arr);
        for (var v : arr) {
            if (s > v.first) {
                s += v.second;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

class Pair implements Comparable<Pair> {
    Integer first, second;
    Pair(Integer f, Integer s) {
        first = f;
        second = s;
    }
    Pair() {
        first = 0; second = 0;
    }
    public int compareTo(Pair other) {
        if (this.first > other.first) {
            return 1;
        } else {
            if (this.first == other.first) {
                if (this.second > other.second) {
                    return 1;
                } else if (this.second == other.second) {
                    return 0;
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }
}