package baekjoon.T20250721;

import java.util.Scanner;

public class P10988_UP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        boolean check = true;

        /**
         * 문자열의 앞, 뒤 문자를 비교하여 for 문 횟수를 반으로
         * 줄여서 체크를 함
         */
        for(int i=0; i < input.length() / 2; i++) {
            if(input.charAt(i) != input.charAt(input.length()-i-1)) {
                check = false;
                break;
            }
        }

        System.out.println(check ? 1 : 0);
        sc.close();

    }
}
