package baekjoon.T20250726;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P3009 {
    public static void main(String[] args) {

        /**
         *
         * 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 문제
         *
         * 좌표로만 판단을 해보자
         * 결국 4개의 점은
         *   x축 좌표가 같은 2쌍의 점이 존재
         *   y축 좌표가 같은 2쌍의 점이 존재
         * 이렇게 존재해야 한다
         *
         */

        Scanner sc = new Scanner(System.in);

        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(xList.contains(x)) {
                xList.remove(Integer.valueOf(x));
            }
            else {
                xList.add(x);
            }

            if(yList.contains(y)) {
                yList.remove(Integer.valueOf(y));
            }
            else {
                yList.add(y);
            }

        }

        System.out.printf("%d %d", xList.get(0), yList.get(0));
        sc.close();
    }
}
