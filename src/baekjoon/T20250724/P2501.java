package baekjoon.T20250724;

import java.util.Scanner;

public class P2501 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[K];
        int pos = 0;
        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                arr[pos] = i;
                pos++;
                if(pos >= K) {
                    break;
                }
            }
        }

        System.out.println(arr[K - 1]);
        sc.close();
    }
}
