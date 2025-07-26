package baekjoon.T20250723;

import java.util.Scanner;

public class P10798 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] inputs = new String[5][15];
        for(int i = 0; i < 5; i++) {
            String input = sc.next();
            for(int k = 0; k < input.length(); k++) {
                inputs[i][k] = String.valueOf(input.charAt(k));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int col = 0; col < 15; col++) {
            for(int row = 0; row < 5; row++) {
                String str = inputs[row][col];
                if(str == null)
                    continue;
                sb.append(str);
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
