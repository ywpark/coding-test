package baekjoon.T20250731;

import java.util.Arrays;
import java.util.Scanner;

public class P25305 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        Integer[] jumsu = new Integer[N];
        for(int i = 0; i < N; i++) {
            jumsu[i] = sc.nextInt();
        }

        Arrays.sort(jumsu, (o1, o2) -> o2.compareTo(o1));
        System.out.println(jumsu[k - 1]);

        sc.close();

    }
}
