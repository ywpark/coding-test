package baekjoon.T20250729;

import java.util.Scanner;

/**
 *
 * @TODO
 *
 * 좀 더 최적화 된 방식
 *
 */
public class P1018_UP {

    public static boolean[][] arr;
    public static int minPaint = 64; // 총 색칠 되어진 갯수

    public static void main(String[] args) {

        /**
         *
         * 1. 주어진 체스판에서 8x8 의 체스판을 찾아야한다
         *   그렇다면 체스판을 찾는 경우의 수는 어떻게 생각할 수 있을까.
         *   => row M 이고 cols N 일 때 총 나올 수 있는 체스판의 경우의 수는
         *     (M - 7) * (N -7) 이다.
         *     시작시점을 (0,0),(0,1)... 이렇게 생각해 보면 위의 공식이 나온다.
         *     예를 들어 9x9 인 경우 (0,0), (0,1), (1,0), (1,1) 에서 시작하는 체스판을 만들 수 있다.
         *
         *
         * 2. 첫번째 칸이 검은색 , 하얀색인 경우를 비교해야 한다.
         *   즉, 주어진 예제로 첫번째 칸이 검은색으로 시작하더라도 이 부분을 하얀색으로 변경하는게
         *     더 적은 색칠을 할 수도 있다.
         *   => 1번 의 조건과 합쳐서 생각해보면 최종 경우의 수는 2 * (M-7) * (N-7) 이 나온다.
         *     여기서 2 는 검은색, 하얀색인 경우다
         *
         */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new boolean[N][M];

        /**
         * 첫번쨰를 W 기준으로 하여 전체표를 나타낸다
         */
        for(int i = 0; i < N; i++) {
            String input = sc.next();
            for(int j = 0; j < M; j++) {
                if(input.charAt(j) == 'W') {
                    arr[i][j] = true; // 화이트 일때 true
                }
                else {
                    arr[i][j] = false; // 블랙 일때 false
                }
            }
        }

        // 시작 지점을 정의하여 for 문 진행
        int row = N - 7;
        int col = M - 7;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                find(i, j);
            }
        }

        System.out.println(minPaint);
        sc.close();
    }

    public static void find(int x, int y) {

        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        // 첫번째 칸의 색
        boolean TF = arr[x][y];

        /**
         * 시작 지점을 기준으로 체스판 8x8 비교
         */
        for(int i = x; i < end_x; i++) {
            for(int j = y; j < end_y; j++) {

                /**
                 * 좌표의 값을 첫번째 색깔을 기준으로 정답을 비교한다
                 */
                if(arr[i][j] != TF) {
                    count++;
                }

                /**
                 * 첫번쨰 값을 기준으로 오른쪽으로 이동시 반대 값이 정답이기에
                 * 반대로 값을 변경한다.
                 */
                TF = !TF;
            }

            /**
             * j 에서 마지막으로 TF 값이 변경된 상태에서 ROW 값이 변경되면서
             * 정답 데이터도 한번 더 반대로 변경해준다.
             */
            TF = !TF;
        }

        count = Math.min(count, 64 - count);
        minPaint = Math.min(minPaint, count);

    }
}
