package baekjoon.T20250717;

import java.util.Scanner;

public class P2438 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int depth = sc.nextInt();

        for(int i = 1; i <= depth; i++) {
            /**
             *
             *  repeat() 함수는 java 11 부터 지원
             *
             *  대부분이 이중 for 문을 활용하여 * 찍었지만 단순 시간복잡도만 생각하면
             *  아래 방식처럼 생각도 할 수 있을듯
             *
             *  String a = "*";
             *  a += "*"
             *
             */
            System.out.println("*".repeat(i));
        }

        sc.close();
    }
}
