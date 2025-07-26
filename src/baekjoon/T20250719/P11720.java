package baekjoon.T20250719;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String text = sc.next();

        int sum = 0;
        for(int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            sum += ch - '0';
        }

        System.out.println(sum);
        sc.close();

    }
}
