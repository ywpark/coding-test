package baekjoon.T20250717;

import java.util.Scanner;

public class P11022 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= count; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(String.format("Case #%d: %d + %d = %d", i, a, b, a + b)).append("\n");
        }

        System.out.println(sb.toString());
        sc.close();

    }
}
