package baekjoon.T20250721;

import java.util.Scanner;

public class P11718 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()) { // Scanner 에서 EOF 판단
            String input = sc.nextLine();
            sb.append(input).append("\n");
        }

        System.out.println(sb.toString());
        sc.close();

    }
}
