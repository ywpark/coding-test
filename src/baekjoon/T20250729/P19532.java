package baekjoon.T20250729;

import java.util.Scanner;

public class P19532 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        /**
         * 연립 방정식을 풀어보면
         * x = (bf-ec) / (bd-ae)
         * y = (c-ax) / b
         *
         * 아래의 경우처럼 조건을 안 걸려면 y 를 구하는 근의 공식을 x 에
         * 대입하여 식을 정리하면 된다 그렇게 하면
         *
         * x = (c*e - b*f) / (a*e - b*d)
         * y = (c*d - a*f) / (b*d - a*e)
         *
         *
         * 1. bd - ae = 0 일 수 있다
         * 2. b 가 0 일 수 있다. 하지만 e 까지 0 일 수는 없다
         * 3. b 가 0 인데 a 까지 0 일 수는 없다.
         */

        int x = 0;
        int y = 0;

        if(b == 0) {
            x = c / a;
            y = (f - d * x) / e;
        }
        else if(a*e == b*d) {
            for(int i = -999; i <= 999; i++) {
                boolean isPossible = (c - a * i) % b == 0 ? true : false;
                if(isPossible) {
                    int r = (c - a * i) % b;
                    if(r >= -999 && r <=999) {
                        x = i;
                        y = r;
                        break;
                    }
                }
            }
        }
        else {
            x = (b*f-e*c) / (b*d-a*e);
            y = (c - a*x) / b;
        }

        System.out.printf("%d %d", x ,y);
        sc.close();

    }
}
