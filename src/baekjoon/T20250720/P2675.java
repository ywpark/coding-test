package baekjoon.T20250720;

import java.util.Scanner;

public class P2675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i = 0; i < count; i++) {

            int repeatCount = sc.nextInt();
            String input = sc.next();

            StringBuilder sb = new StringBuilder();
            for(int k = 0; k < input.length(); k++) {
                char ch = input.charAt(k);
                sb.append(String.valueOf(ch).repeat(repeatCount));
            }

            System.out.println(sb.toString());
        }
    }
}
