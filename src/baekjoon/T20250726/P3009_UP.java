package baekjoon.T20250726;

import java.util.Scanner;

/**
 * @TODO 비트 연산자의 활용 체크
 *
 * 3009 문제를 비트 연산자를 통해 풀 수 있다.
 *
 */
public class P3009_UP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] x = new int[4];
        int[] y = new int[4];

        for(int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        x[3] = x[0] ^ x[1] ^ x[2];
        y[3] = y[0] ^ y[1] ^ y[2];


        System.out.printf("%d %d", x[3], y[3]);
        sc.close();
    }
}
