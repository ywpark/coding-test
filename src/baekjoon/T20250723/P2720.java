package baekjoon.T20250723;

import java.util.Scanner;

public class P2720 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] r = {25, 10, 5, 1};

        /**
         *
         * 거스름돈을 입력 받는다 ( 단위 : 센트 )
         * 쿼터 (0.25) 다임 (0.10) 니켈 (0.05) 페니 (0.01)
         *
         */
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++) {

            int cent = sc.nextInt();
            for(int k = 0; k < 4; k++) {
                int a = cent / r[k];
                cent -= r[k] * a;
                sb.append(a + " ");
            }
            sb.append("\n");

        }

        System.out.println(sb.toString());

        sc.close();

    }
}
