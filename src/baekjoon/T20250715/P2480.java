package baekjoon.T20250715;

import java.util.Scanner;

public class P2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c) {
            System.out.println(10000 + a * 1000);
            return;
        }

        if( a == b ) {
            System.out.println(1000 + a * 100 );
        }
        else if(b == c) {
            System.out.println(1000 + b * 100 );
        }
        else if(a == c) {
            System.out.println(1000 + a * 100 );
        }
        else {

            int k = Math.max(Math.max(a, b), c);
            System.out.println(100 * k);
        }

        sc.close();

    }
}
