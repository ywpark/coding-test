package baekjoon.T20250716;

import java.util.Scanner;

public class P25314 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int byteN = sc.nextInt();

        int count = byteN / 4;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= count; i++) {
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb.toString());

        sc.close();
    }
}
