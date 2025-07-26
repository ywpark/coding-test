package baekjoon.T20250719;

import java.util.Scanner;

public class P9086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++) {

            String text = sc.next();
            sb.append(String.valueOf(text.charAt(0)) + String.valueOf(text.charAt(text.length() - 1)))
                    .append("\n");
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
