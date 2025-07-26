package baekjoon.T20250717;

import java.util.Scanner;

public class P2439 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int depth = sc.nextInt();

        for(int i = 1; i <= depth; i++)
        {
            System.out.println(" ".repeat(depth - i) + "*".repeat(i));
        }

        sc.close();

    }
}
