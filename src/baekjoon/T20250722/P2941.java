package baekjoon.T20250722;

import java.util.Scanner;

public class P2941 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String[] langs = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int wordCount = 0;
        int pos = 0;
        StringBuffer sb = new StringBuffer(input);
        while(pos < langs.length) {

            int idx = sb.indexOf(langs[pos]);
            if(idx != -1) {
                sb = sb.replace(idx, idx + langs[pos].length(), " ");
                wordCount++;
            }
            else {
                pos++;
            }
        }

        System.out.println(sb.toString().replaceAll(" ", "").length() + wordCount);
        sc.close();
    }
}
