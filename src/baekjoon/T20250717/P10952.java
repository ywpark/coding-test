package baekjoon.T20250717;

import java.util.Scanner;

public class P10952 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while(a != 0 && b != 0) {

            sb.append(a + b).append("\n");

            a = sc.nextInt();
            b = sc.nextInt();
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
