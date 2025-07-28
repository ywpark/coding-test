package baekjoon.T20250728;

import java.util.Scanner;

public class P14215 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         *
         * 길이를 마음대로 줄일 수 있는 막대 a,b,c
         *
         *  1. 막대 길이는 양수
         *  2. 넓이가 양수인 삼각형을 만듬
         *  3. 삼각형의 둘레를 최대
         *
         *  삼각형이 될 수 있는 조건 ::
         *   가장 큰 길이 보다 나머지 2 길이가 크다.
         */

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(Math.max(a,b), c);

        // max : 가장 큰 길이
        // a + b + c - max :: 나머지 2개 길이의 합
        if(max < a + b + c - max) {
            System.out.println(a + b + c);
        }
        else {
            /**
             * 가장 큰 길이를 나머지 2 길이의 합보다 - 1 한 것으로 한다.
             *
             *  a + b + c - max - 1 :: 가장 큰 길이 수정
             *
             *  삼각형 둘레는
             *   (a + b + c - max - 1) + (a + b + c - max)
             *
             */
            System.out.println(2 * (a + b + c - max) - 1);
        }

        sc.close();

    }
}
