package baekjoon.T20250722;

import java.util.Scanner;

public class P2738 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] result = new int[N][M];

        for(int i = 0; i < 2*N; i++) {
            for(int k = 0; k < M; k++) {
                result[i%N][k] += sc.nextInt();
            }
        }

        for(int[] a : result) {
            for(int number : a) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
