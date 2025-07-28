package baekjoon.T20250728;

import java.util.Scanner;

public class P24266 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /**
         *
         * 삼중 for 문
         *
         * 실행횟수 : n ^ 3
         * 차수 : 3
         */

        // 정수를 정확하게 표현하기 위해서는 long 타입을 활용한다.
        //System.out.println(new BigDecimal(Math.pow(n, 3)).toPlainString());
        System.out.println((long) n * n * n);
        System.out.println(3);

        sc.close();

    }
}
