package baekjoon.T20250723;

import java.util.Scanner;

public class P2903 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /**
         *
         * 윗변을 보면 점 과 점 사이의 선의 갯수가
         * 1 -> 2 -> 4 처럼 2^N 으로 증가하고 점의 갯수는 + 1 을 하면 됨
         * 그러면 윗변 점의 갯수가 나오고 정사각형의 총 점의 갯수는 제곱을 하면 됨
         *
         */

        double count = Math.pow(Math.pow(2, N) + 1, 2);
        System.out.println((int) count);
        sc.close();

    }
}
