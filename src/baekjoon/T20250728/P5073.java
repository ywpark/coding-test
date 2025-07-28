package baekjoon.T20250728;

import java.util.Scanner;

public class P5073 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        while(true) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == 0 && b == 0 && c == 0) {
                break;
            }
            /**
             *
             * 두 변의 길이가 같지만 삼각형 조건을 통과하지 못하는 경우 있음
             *
             */
            if( a == b && b == c) {
                sb.append("Equilateral").append("\n");
            }
            else {

                int max = Math.max(Math.max(a, b), c);
                if(a + b + c - max <= max) {
                    sb.append("Invalid").append("\n");
                }
                else if( a == b || b == c || a == c ) {
                    sb.append("Isosceles").append("\n");
                }
                else {
                    sb.append("Scalene").append("\n");
                }
            }
        }

        System.out.println(sb.toString());
        sc.close();

    }
}
