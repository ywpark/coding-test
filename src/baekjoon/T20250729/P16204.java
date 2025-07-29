package baekjoon.T20250729;

import java.util.Scanner;

public class P16204 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        /**
         *
         * 전체 카드 수 : N
         * 앞면이 O 카드 수 : M
         * 안편이 X 카드 수 : N-M
         *
         * 뒷면에 O 카드 수 : K
         * 뒷면에 X 카드 수 : N-K
         *
         * 앞면 과 뒷면이 같은 모양이 되는 카드의 최대 개수
         *
         * 4 3 2
         *
         * 전체 카드수 4
         * 앞면이 O = 3 / X = 1
         * 뒷면이 O = 2 / X = 2
         *
         * 전제 조건 무조건 O,X 순서대로 적는다
         *
         * 앞면을 관리하는 배열 boolean[4] true ( O ) / false  (x)
         * 뒷면을 관리하는 배역 boolean[4] true ( O ) / false  (x)
         *
         */

        boolean[] oCard = new boolean[N];
        boolean[] xCard = new boolean[N];

        for(int i = 0; i < M; i++) {
            oCard[i] = true;
        }

        for(int i = 0; i < K; i++) {
            xCard[i] = true;
        }

        int result = 0;
        for(int i = 0; i < N; i++) {
            if(oCard[i] == xCard[i]) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();

    }
}
