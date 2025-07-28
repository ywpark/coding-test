package baekjoon.T20250728;

import java.util.Scanner;

public class P24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        /**
         *
         * 실행 회수 : 시그마의 합으로 계산하여 정리를 하면 (n-2)(n-1)n / 6 이다
         * 차수 : n^3 이므로 3
         *
         */
        System.out.println((n-2)*(n-1)*n / 6);
        System.out.println(3);

        sc.close();
    }
}
