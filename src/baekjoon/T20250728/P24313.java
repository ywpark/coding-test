package baekjoon.T20250728;

import java.util.Scanner;

public class P24313 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        int fnResult = a1 * n0 + a0;
        int gnResult = c * n0;

        /**
         *
         * a1 <= c 조건이 들어가야 함
         * 공식에서 보면 fn <= c * gn 이다
         * fn = a1 * n + a0
         *
         * 이렇게 보면 c 와 a1 은 기울기가 되는데
         * a1 <= c 조건도 같이 성립해야만 한다
         * 
         * 반례는 아래와 같았다
         * 1 1
         * 1
         * 1
         *
         */
        System.out.println(fnResult <= gnResult && a1 <= c ? 1 : 0);

        sc.close();
    }
}
