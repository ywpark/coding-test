package baekjoon.T20250724;

import java.util.Scanner;

public class P1193_UP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int line = 1;
        while(X > line) {
            X -= line;
            line++;
        }

        if(line % 2 == 0) {
            System.out.println(X + "/" + (line - X + 1));
        }
        else {
            System.out.println((line - X + 1) + "/" + X);
        }

        sc.close();

    }
}
