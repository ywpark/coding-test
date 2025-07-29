package baekjoon.T20250729;

import java.util.Scanner;

public class P2231 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /**
         * N 이 어떤 수의 분해합인지 찾기
         * 여러 분해합 중 최소값을 찾고 없는 경우에는 0을 출력
         *
         * N = x + x[0] + x[1] + .... + x[length - 1]
         *
         * 1) x 값을 찾을 때 최소 N 보다는 작아야 함
         * 2) for 문을 돌면서 제일 먼저 찾는 값이 최소값
         *
         */

        int result = 0;
        for(int i = 1; i < N; i++) {

            String num = String.valueOf(i);
            int sum = i;
            for(char ch : num.toCharArray()) {
                sum += (ch - '0');
            }

            if(sum == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
        sc.close();

    }
}
