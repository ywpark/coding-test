package baekjoon.T20250728;

import java.math.BigDecimal;
import java.util.Scanner;

public class P24264 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /**
         *
         * 수행 횟수 : n * n
         * 최고차항 : n^2 이기 떄문에 2
         */

        System.out.println(new BigDecimal(Math.pow(n, 2)).toPlainString());
        System.out.println(2);

        sc.close();

    }
}
