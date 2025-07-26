package baekjoon.T20250721;

import java.util.Scanner;

public class P1157 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();

        int[] alphabet = new int[26];
        for(char ch : input.toCharArray()) {
            // A : 65
            int pos = ch;
            alphabet[pos - 65] += 1;
        }

        /**
         * 내가 짠 로직에서 제일 문제 였던 부분은 bcddd
         * 이런식으로 최대 글자수 전에 동일한 횟수 만큼 반복된 문자가 나왔을 떄 임.
         * 이 부분에서 가장 반례를 찾기가 어려웠음.
         */
        boolean isSame = false;
        int maxPos = 0;
        for(int i = 1; i <= 25; i++) {

            if(alphabet[i] == 0)
                continue;

            if(alphabet[maxPos] <= alphabet[i]) {
                if(alphabet[maxPos] == alphabet[i]) {
                    isSame = true;
                }
                else {
                    isSame = false;
                }
                maxPos = i;
            }
        }

        if(isSame) {
            System.out.println("?");
        }
        else {
            System.out.println(String.valueOf((char)(maxPos + 65)));
        }

        sc.close();

    }
}
