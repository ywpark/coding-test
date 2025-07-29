package baekjoon.T20250729;

import java.util.Scanner;

public class P16204_UP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        /**
         *
         * Math.min(M, K) : 양쪽에 O 가 그려진 카드 수
         * Math.min(N-M, N-K) : 양쪽에 X 가 그려진 카드 수
         *
         */
        int result = Math.min(M, K) + Math.min(N-M, N-K);

        System.out.println(result);
        sc.close();

    }
}
