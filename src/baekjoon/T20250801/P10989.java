package baekjoon.T20250801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @TODO
 * 카운팅 정렬의 활용 ( 시간 복잡도 O(n) 이다 )
 *   - Counting Sort , 계수 정렬
 *   - 정렬 알고리즘 중 엄청난 성능을 보여준다.
 *   - 대표적인 Quick Sort, Heap Sort, Merge Sort 들의 평균 시간 복잡도는 O(nlogn)
 *
 */
public class P10989 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] inputs = new int[N];
        int max = 0;
        for(int i = 0; i < N; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, inputs[i]);
        }

        // 카운팅 배열 생성
        int[] countings = new int[max+1];
        for(int i : inputs) {
            countings[i] += 1;
        }


        /**
         * 카운팅 배열을 각 값을 누적합으로 변환
         *
         * 누적합을 왜 구할까?
         *  입력 배열 : arr = [4, 2, 2, 8, 3, 3, 1]
         *  카운팅 배열 : count = [0, 1, 2, 2, 1, 0, 0, 0, 1]
         *   => count[n] = k 의 의미는 arr 배열에서 n 은 k 개 만큼 존재
         *   => 즉, 카운팅 배열만 가지고도 정렬된 배열을 만들 수 있다.
         *  누적합 배열 : count = [0, 1, 3, 5, 6, 6, 6, 6, 7]
         *   => count[n] = k 의 의미는 n 이하의 숫자는 총 k 개 이다
         *   => 1 이하의 숫자는 1개 , 2 이하의 숫자는 3개 ( 1, 2, 2 )
         *   => 누적합 - 1 의 의미는 정렬된 배열의 index 이다
         *   => 즉, 정렬된 배열에서 n 의 마지막 index 를 가리킨다
         *  최종적으로 arr 에 중복된 숫자 2, 3 이 같은 숫자이지만 이 숫자들의 순서를 유지하기 위해 누적합을 사용한다고 함.
         *   => [4, 2a, 2b, 8, 3a, 3b, 1] : 구분 짓기 위해 a,b 붙임
         *   => [1, 2a, 2b, 3a, 3b, 4, 8 ] : 누적합을 사용하면 arr 2a, 2b ,3a, 3b 의 순서가 유지되어 정렬됨
         *
         */
        for(int i = 1; i < countings.length; i++) {
            countings[i] = countings[i-1] + countings[i];
        }

        int[] result = new int[N];
        for(int i = N - 1; i >= 0; i-- ) {
            int val = inputs[i];
            countings[val] = countings[val] - 1;
            result[countings[val]] = val;
        }

        StringBuilder sb = new StringBuilder();
        for(int a : result) {
            sb.append(a).append("\n");
        }

        System.out.println(sb.toString());

        br.close();
    }
}
