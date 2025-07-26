package baekjoon.T20250717;

import java.util.Scanner;

/**
 * 
 * https://www.acmicpc.net/problem/2562
 * 
 * 문제를 제대로 읽자
 *  9개의 서로 다른 자연수가 주어진다고 언급함
 * 
 */
public class P2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pos = 1;
        int largePos = 0;
        int largeNumber = 0;
        while(sc.hasNext()) {
            int number = sc.nextInt();
            if(number > largeNumber) {
                largeNumber = number;
                largePos = pos;
            }
            pos++;
        }

        System.out.println(largeNumber);
        System.out.println(largePos);

        sc.close();

    }
}
