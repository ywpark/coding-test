package baekjoon.T20250718;

import java.util.Scanner;

public class P5597 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] check = new int[31];
        for(int i = 1; i <= 28; i++) {
            int pass = sc.nextInt();
            check[pass] = 1;
        }

        for(int i = 1; i < 31; i++) {
            if(check[i] == 0) {
                System.out.println(i);
            }
        }
        sc.close();

    }
}
