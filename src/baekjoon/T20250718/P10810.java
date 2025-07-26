package baekjoon.T20250718;

import java.util.Scanner;

public class P10810 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bucketSize = sc.nextInt();
        int count = sc.nextInt();

        int[] result = new int[bucketSize];
        for(int i = 0; i < count; i++) {

            int from = sc.nextInt();
            int to = sc.nextInt();
            int value = sc.nextInt();

            for(int j = from; j <= to; j++) {
                result[j-1] = value;
            }
        }

        for(int n : result) {
            System.out.printf("%d ", n);
        }

        sc.close();
    }
}
