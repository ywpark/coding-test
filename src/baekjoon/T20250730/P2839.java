package baekjoon.T20250730;

import java.util.Scanner;

public class P2839 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /**
         *
         * 1. 5키로를 기준으로 바구니 수를 구한다. 단, 횟수는 N / 5 로 한다.
         *   N / 5 보다는 바구니 수를 가질 수 없기 떄문
         * 2. 1번에서 체크한 나머지 값을 3키로 바구니로 체크한다.
         *
         */

        int min = -1;
        for(int i = 0; i <= N/5; i++) {
            int a = 5 * i;
            int b = 0;
            for(int j = 1; j <= N/3; j++) {
                if((N - a) == 3 * j) {
                    b = j;
                    break;
                }
            }

            if(a + 3*b != N)
                continue;

            if(min == -1) {
                min = i + b;
            }
            else {
                min = Math.min(min, i+b);
            }
        }
        System.out.println(min);
        sc.close();
    }
}
