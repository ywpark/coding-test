package baekjoon.T20250729;

import java.util.Scanner;

public class P2798 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        /**
         *  카드 N 장에서 M 에 최대한 가까운 값을 찾아야 한다.
         *  카드 3장의 합을 구하라
         *
         *  기준을 잡고 모든 경우의 합을 찾아 본다
         *  배열을 전체 돌아본다.
         *
         *  시간 복잡도 n^3 => 1,000,000 , 1초에 가능한 범위
         *
         */

        int[] cards = new int[N];
        for(int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        int result = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                for(int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum <= M && result < sum) {
                        result = sum;
                    }
                }
            }
        }


        System.out.println(result);
        sc.close();
    }
}
