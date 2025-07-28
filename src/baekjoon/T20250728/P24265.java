package baekjoon.T20250728;


import java.util.Scanner;

public class P24265 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        /**
         * 수행 횟수 : ( n - 1) * ( 1 + 2 + 3..... + n - 1 ) = ( n - 1 ) * ((n-1) + 1) /2
         *       : n(n-1)/2
         *
         * 시간복잡도 : 최고차항 뺴고 무시하면 2
         *
         */

        // 아래와 같이 하면 오류 남 n ( n - 1 ) /2 가 이미 int 범위를 넘어가서 소용없음
        //System.out.println(new BigDecimal(n * (n-1) / 2).toPlainString());
        System.out.println(n * (n - 1L) / 2L);
        System.out.println(2);

        sc.close();
    }
}
