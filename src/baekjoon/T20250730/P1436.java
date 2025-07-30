package baekjoon.T20250730;

import java.util.Scanner;

public class P1436 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        /**
         * 666 부터 시작해서 숫자를 하나씩 증가시키면서
         * 해당 숫자에 666 이 포함되어 있는지 체크하여 카운트를 센다
         */
        int cnt = 0;
        int start = 666;
        while(true) {

            if(String.valueOf(start).contains("666")) {
                cnt++;
            }
            if(cnt == N) {
                break;
            }
            start++;
        }

        System.out.println(start);
        sc.close();
    }
}
