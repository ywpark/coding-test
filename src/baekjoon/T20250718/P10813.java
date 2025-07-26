package baekjoon.T20250718;

import java.util.Scanner;

public class P10813 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bucketSize = sc.nextInt();
        int count = sc.nextInt();

        int[] bucket = new int[bucketSize + 1];
        for(int i = 1; i <= bucketSize; i++) {
            bucket[i] = i;
        }

        for(int cnt = 0; cnt < count; cnt++) {
            int iBucket = sc.nextInt();
            int jBucket = sc.nextInt();

            int tmp = 0;
            tmp = bucket[iBucket];
            bucket[iBucket] = bucket[jBucket];
            bucket[jBucket] = tmp;
        }

        for(int i = 1; i < bucketSize + 1; i++) {
            System.out.printf("%d ", bucket[i]);
        }

        sc.close();

    }
}
