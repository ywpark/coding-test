package baekjoon.T20250722;

import java.util.Scanner;

public class P1316 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        boolean[] check = null;
        int groupWordCount = 0;
        for(int i = 0; i < count; i++) {

            String input = sc.next();
            check = new boolean[26];
            boolean isGroupWord = true;
            for(int c = 0; c < input.length(); c++) {
                char ch = input.charAt(c); // 'a' = 97
                if(check[ch - 'a'] && (ch != input.charAt(c-1))) {
                    isGroupWord = false;
                    break;
                }
                else {
                    check[ch-'a'] = true;
                }
            }
            if(isGroupWord) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
        sc.close();
    }
}
