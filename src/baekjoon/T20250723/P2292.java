package baekjoon.T20250723;

import java.util.Scanner;

/**
 * @TODO 다시 한번 생각해 볼 필요 있음
 */
public class P2292 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /**
         *
         * 1을 중심으로 숫자들이 둘러싸인 것은 layer로 구분한다.
         * 각 layer 별로 시작 ~ 끝 숫자의 범위가 존재한다.
         *
         * 시작 번호는 2 이후에는 6의 배수로 증가함
         * 끝 번호는 2 이후에는 6 만큼 차이가 벌어짐
         *
         * layer 0 : 1
         * layer 1 : 2 ~ 7
         * layer 2 : 8 ~ 19
         * layer 3 : 20 ~ 37
         * layer 4 : 38 ~ 61
         *
         *
         * n > 0 : layer n : layer n - 1 의 최소값 + 6 * n
         *
         * 위와 같은 공식으로 구할 수 있음
         *
         * 입력된 수가 어느 범위에 포함되는지를 알면 몇 개의 방을 지나는지 알수 있다.
         *
         * [[ 결론 ]]
         *
         * 시작 과 종료 값을 알 필요가 없고 최소값만 가지고도 충분히 예측할 수 있으며
         * 공식을 너무 복잡하게 안해도 됨
         *
         */

        if(N == 1) {
            System.out.println(1);
        }
        else {

            int layer = 1;
            int startNumber = 2;
            while(N >= startNumber) {
                startNumber = startNumber + (6 * layer);
                layer++;
            }

            System.out.println(layer);
            sc.close();

        }

    }

}
