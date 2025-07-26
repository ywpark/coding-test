package baekjoon.T20250726;

import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {

        /**
         *
         * 직사각형 내부의 한 점에 한수가 위치해 있으면 직사각형의 경계선까지의 거리는
         * 아래와 같이 생각할 수 있다 ( 총 4가지 )
         *
         * x 축 기준 : x or w - x
         * y 축 기준 : y or h - y
         *
         * 위 값들 중에 최소값을 구하면 될거 같다
         *
         */

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int min = 0;

        if(x > w-x) {
            min = w-x;
        }
        else {
            min = x;
        }

        if(y > h-y) {
            min = min > h-y ? h-y : min;
        }
        else {
            min = min > y ? y : min;
        }

        System.out.println(min);
        sc.close();


    }
}
