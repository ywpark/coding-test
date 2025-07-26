package baekjoon.T20250724;

import java.util.Scanner;

public class P2869 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        /**
         * 기본 로직
         *
         * 0 + A -> 0 + A - B -> 0 + A - B + A -> 0 + A - B + A - B.......
         * A -> A-B -> 2A - B -> 2A - 2B -> 3A - 2B .............
         *
         * 하루는 2번의 작업이 있다.
         *
         */

        /**
         *
         * 아래와 같이 하면 시간초과 된다
         * if 절 안에 있는 수식을 정리하면 아래와 같이 나옴
         *
         * int days = 1;
         * while(true) {
         *   if(days * A - (days-1) * B >= V) {
         *      break;
         *   }
         *   days++;
         *
         * }

         */

        int days = (V - B) / (A - B) + ((V - B) % (A - B) > 0 ? 1 : 0);

        System.out.println(days);
        sc.close();

    }
}
