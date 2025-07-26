package baekjoon.T20250723;

import java.util.Scanner;

public class T2745 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();

        int len = N.length();
        int number = 0;
        for(int i = 0; i < len; i++) {

            char ch = N.charAt(i); // 숫자(48) or 영어 대문자(65)
            if(ch >= 48 && ch <= 57) {
                // 숫자
                number += (ch - '0') * (int)Math.pow(B, (len-i - 1));
            }
            else {
                number += ((int)ch - 55) * (int)Math.pow(B, (len-i - 1));

            }
        }

        System.out.println(number);
        sc.close();

    }
}
