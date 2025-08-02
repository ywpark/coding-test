package baekjoon.T20250801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10989_UP {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /**
         * 카운팅 배열 생성
         * - 주어진 Array를 순회하면서 Array[index] 값을 Index 로 하고 카운팅 배열의 값을 1증가 시킨다.
         *   ( 중복이 나와도 1 증가 하면 된다 )
         * - 10,001 의 이유 ?
         *   문제의 조건이 10,000보다 작거나 같은 자연수 이기 때문에 Array 에서 가질 수 있는 값은
         *   1 ~ 10,000 이다
         *   여기서 가장 값을 큰 값은 10,000 이기 때문에 + 1 한 10,001 이 된다.
         *
         */
        int[] cnt = new int[10001];

        // 정렬해야 하는 갯수
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            /**
             * 입력받은 Array 를 활용할 필요가 없기 때문에 생성하는 것을 생략하고
             * 바로 카운팅 배열에 정보를 세팅한다.
              */
            cnt[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        // 0 은 의미가 없기 때문에 1 부터 시작
        for(int i = 1; i < 10001; i++) {

            /**
             * 중복 숫자가 나오더라도 현재 중복된 숫자 안에서
             * 순서가 중요하지 않기 때문에 누적합을 구하지 않고 바로 카운팅 배열에서 숫자를 정렬시킨다.
             */
            while(cnt[i] > 0) {
                sb.append(i).append("\n");
                cnt[i]--;
            }
        }
        System.out.println(sb);

    }
}
