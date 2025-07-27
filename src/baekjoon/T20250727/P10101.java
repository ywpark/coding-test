package baekjoon.T20250727;

import java.util.Scanner;

public class P10101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a + b + c != 180) {
            System.out.println("Error");
        }
        else {

            /**
             * a 와 b 가 같고 , b 와 c 가 같으면 당연히 a 와 c 는 같다
             * a 와 b 가 같거나 혹은 b 와 c 가 같으면 2 각이 같다 ( 이 것의 반례는  a 와 c 가 같은 경우 )
             * 그 외에는 같은 각 없음
             */

            boolean ab = (a == b);
            boolean bc = (b == c);
            boolean ac = (a == c);

            if(ab && bc) {
                System.out.println("Equilateral");
            }
            else if(ab || bc || ac) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }
        }

        sc.close();
    }
}
