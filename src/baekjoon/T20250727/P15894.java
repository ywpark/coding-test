package baekjoon.T20250727;

import java.math.BigDecimal;
import java.util.Scanner;

public class P15894 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        /**
         *
         * 실선의 길이를 구하라
         *
         * n = 1 -> 4
         * n = 2 -> 8
         * n = 3 -> 12
         *
         * 위 와 아래의 길이는 같다. 즉, 밑변의 길이의 2배는 위, 아래 실선의 길이가 나온다
         * 좌, 우는 n 과 같다. 즉, 좌 + 우 길이의 합은 2n 이다
         *
         * 총 실선의 합은 4n 과 같다
         *
         */
        System.out.println(new BigDecimal(4*n).toPlainString());
        sc.close();

    }
}
