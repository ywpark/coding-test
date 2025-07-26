package baekjoon.T20250717;

import java.util.Scanner;

public class P10871 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if(k < x) {
                sb.append(k).append(" ");
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
