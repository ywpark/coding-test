package baekjoon.T20250721;

import java.util.Scanner;

public class P10988 {
    public static void main(String[] args) {

        /**
         * 팰린드롬이란 앞으로 읽을 떄와 거꾸로 읽을 떄 똑같은 단어를 말한다.
         *
         */

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        StringBuffer reverse = new StringBuffer(input).reverse();

        System.out.println(input.equals(reverse.toString()) ? 1 : 0);
        sc.close();

    }
}
