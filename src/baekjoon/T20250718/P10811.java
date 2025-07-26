package baekjoon.T20250718;

import java.util.Scanner;

public class P10811 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bucketSize = sc.nextInt();
        int count = sc.nextInt();

        int[] bucket = new int[bucketSize + 1];
        for(int i = 1; i <= bucketSize; i++) {
            bucket[i] = i;
        }

        for(int i = 0; i < count; i++) {

            int from = sc.nextInt();
            int to = sc.nextInt();

            /**
             *
             * 나의 생각은 역순이 되는 범위에서 각 시작 부분과 끝 부분에 인덱스 정보를 관리한다.
             * switchCount 는 역순 작업을 진행할 때 몇 번의 교체 작업이 있는냐를 표현 한 것이다.
             *   즉, 1 ~ 4를 역순으로 한다고 하면 총 2번의 교체 작업만 하면 역순으로 할 수 있다
             *
             */
            int frontIdx = from, backIdx = to;
            int switchCount = ((to - from) + 1) / 2;
            for(int step = 0; step < switchCount; step++) {

                int tmp = bucket[frontIdx];
                bucket[frontIdx] = bucket[backIdx];
                bucket[backIdx] = tmp;

                frontIdx++;
                backIdx--;
            }
        }

        for(int i = 1; i < bucket.length; i++) {
            System.out.printf("%d ", bucket[i]);
        }

        sc.close();

    }
}
