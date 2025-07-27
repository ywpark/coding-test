package baekjoon.T20250727;

import java.util.*;

public class P9063 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /**
         * 점 1개 : 직사각형을 만들 수 없음
         * 점 2개 이후 : 되는 경우가 있고 안되는 경우 존재
         *
         * 직사각형을 만들기 위해서는 x 좌표 중 최소값, 최대값
         * y 좌표 중 최소값, 최대값 을 구한다
         *
         * ( x 최대값 - x 최소값 ) * ( y 최대값 - y 최소값 )
         *
         */

        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        for(int i = 0; i < N; i++) {
            xSet.add(sc.nextInt());
            ySet.add(sc.nextInt());
        }

        int xMin = xSet.stream().min(Comparator.naturalOrder()).get().intValue();
        int xMax = xSet.stream().max(Comparator.naturalOrder()).get().intValue();

        if(xMax - xMin == 0) {
            System.out.println(0);
        }
        else {
            int yMin = ySet.stream().min(Comparator.naturalOrder()).get().intValue();
            int yMax = ySet.stream().max(Comparator.naturalOrder()).get().intValue();

            if(yMax - yMin == 0) {
                System.out.println(0);
            }
            else {
                System.out.println((xMax - xMin) * (yMax - yMin));
            }
        }
        sc.close();
    }
}
