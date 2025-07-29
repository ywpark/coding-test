package baekjoon.T20250729;

import java.util.Scanner;

public class P2231_UP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /**
         * N 이 어떤 수의 분해합인지 찾기
         * 여러 분해합 중 최소값을 찾고 없는 경우에는 0을 출력
         *
         * N = x + x[0] + x[1] + .... + x[length - 1]
         *
         * 위의 식에서 x[0] + ... + x[length -] 의 값은 각 자리 별로 올 수 있는 최대 값은 9이다
         * 그래서 분해합이 123 처럼 3자리 인 경우 9 + 9 + 9 이렇게 하여 1 ~ 27 까지의 합을 구할 수 있다.
         *
         * 따라서, 시작 시점을 123 - 27 = 96 부터 하면 더 빠르게 찾을 수 있다.
         *
         *
         */

        String num = String.valueOf(N);

        int result = 0;
        for(int i = N - (num.length() * 9); i < N; i++) {

            int sum = i;
            int number = i;

            while(number != 0) {
                sum = sum + (number % 10);
                number = number / 10;
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
