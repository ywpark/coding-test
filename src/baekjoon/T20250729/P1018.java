package baekjoon.T20250729;

import java.util.Scanner;

public class P1018 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        /**
         *
         * 1. B , W 로 시작되는 8x8 정답표를 만든다. char 배열 사용
         * 2. 사용자가 입력한 inputs[][] 배열 생성
         * 3. B, W 로 시작하는 정답표를 각 각 돌려본다.
         *   (0,0) 체스판이 B 라고 해서 꼭 B로 시작해야 한다는 그런거는 없다
         *   이렇게 생각을 못해서 예제4 의 31 이 죽어도 안나옴 ( W 로 시작하면 나옴 )
         * 4. (0,0) 에서 시작하여 8x8을 검색 한 후에 좌표를 오른쪽 혹은 아래쪽으로 이동하여
         *   새로운 8x8 체스판을 검사한다.
         * 5. 오른쪽 하고 아래 쪽으로 이동이 안되면 검사는 끝.
         */

        // 답지 저장
        char[][] bAnswer = create('B');
        char[][] wAnswer = create('W');

        // 사용자 입력 저장
        char[][] inputs = new char[N][M];
        for(int i = 0; i < N; i++) {
            String text = sc.next();
            for(int k = 0; k < M; k++) {
                inputs[i][k] = text.charAt(k);
            }
        }

        int minRepaints = Integer.MAX_VALUE;

        for(int a = 0; a < 2; a++) {
            char[][] valid = null;
            if(a == 0)
                valid = bAnswer;
            else
                valid = wAnswer;

            // 첫 시작 포인트
            int row = 0;
            int col = 0;
            while(row + 7 < N && col + 7 < M) {

                int count = 0;
                for(int i = 0; i < 8; i++) {
                    int start_row = 0;
                    StringBuilder sb = new StringBuilder();
                    for(int k = 0; k < 8; k++) {
                        sb.append(inputs[row + i][col + k]);
                    }
                    count += check(sb.toString(), valid, start_row + i);
                }

                minRepaints = Math.min(minRepaints, count);

                if(col + 8 >= M) {
                    if(row + 8 < N) {
                        row++;
                        col = 0;
                    }
                    else {
                        break;
                    }
                }
                else {
                    col++;
                }

            }

        }

        System.out.println(minRepaints);
        sc.close();
    }

    public static char[][] create(char startChar) {

        char[][] answer = new char[8][8];
        answer[0][0] = startChar;

        for(int i = 0; i < 8; i++) {
            for(int k = 0; k < 8; k++) {

                if(i == 0 && k == 0)
                    continue;

                if(i-1>=0) {
                    // 위에 정사각형이 존재
                    if(answer[i-1][k] == 'B') {
                        answer[i][k] = 'W';
                    }
                    else {
                        answer[i][k] = 'B';
                    }
                }
                else {
                    // 위에 사각형이 없기 때문에 왼쪽 사각형 체크
                    if(answer[i][k-1] == 'B') {
                        answer[i][k] = 'W';
                    }
                    else {
                        answer[i][k] = 'B';
                    }
                }

            }
        }

        return answer;
    }

    /**
     * 색칠해야 하는 개수 리턴
     *
     */
    public static int check(String text, char[][] arr, int start_row) {

        int r = 0;
        for (int i = 0; i < 8; i++) {
            if (text.charAt(i) != arr[start_row][i]) {
                r++;
            }
        }
        return r;
    }

}
