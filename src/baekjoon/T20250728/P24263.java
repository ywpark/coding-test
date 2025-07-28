package baekjoon.T20250728;

import java.util.Scanner;

public class P24263 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         *
         * 수행 횟수는 n 만큼 된다
         * 최고 차항은  A[1] + A[2] + ..... A[n] 이고
         *            (A[1] + A[n]) * n / 2 이기 때문에 1 이다
         */

        System.out.println(sc.nextInt());
        System.out.println(1);

        sc.close();

    }
}
