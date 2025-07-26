package baekjoon.T20250724;

import java.util.Scanner;

public class P1193 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        /**
         *
         * layer 1 : 1/1 (1)
         * layer 2 : 1/2 (2) , 2/1 (3)
         * layer 3 : 1/3 (6), 2/2 (5), 3/1 (4)
         * layer 4 : 1/4 (7), 2/3 (8), 3/2 (9), 4/1 (10)
         * layer 5 : 1/5 (15), 2/4 (14), 3/3 (13), 4/2 (12), 5/1 (11)
         *
         * layer n : 1/n , 2/n-1 , ...... n-1/2 , n/1
         *
         * 이런식으로 숫자가 형성되고
         * n이 짝수 이면 왼쪽부터 start
         * n이 홀수 이면 오른쪽부터 start
         *
         * X 가 어느 layer 에 속하는지 확인하고 왼쪽 OR 오른쪽 방향을 정한 뒤에
         * 특정 숫자를 찾는다
         */

        if(X == 1) {
            System.out.println(1 + "/" + 1);
        }
        else {
            int layer = 1;
            int sum = 0; // X 가 속한 layer 까지의 전체 갯수
            while(true) {
                sum += layer;
                if(sum >= X) {
                    break;
                }
                layer++;
            }

            int startNumber = sum - layer + 1; // 각 layer 별 시작 번째 수
            int move = X - startNumber; // 시작번호 기준 X 로 이동해야 하는 횟수
            boolean leftStart = layer % 2 == 0 ? true : false; // 왼쪽 or 오른쪽 방향 정의
            if(leftStart) {
                System.out.println((move + 1) + "/" + (layer - move));
            }
            else {
                System.out.println((layer - move) + "/" +(move + 1));
            }
        }

        sc.close();
    }
}
