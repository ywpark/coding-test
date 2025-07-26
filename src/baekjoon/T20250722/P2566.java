package baekjoon.T20250722;

import java.util.Scanner;

public class P2566 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxValue = -1;
        int xPos = -1;
        int yPos = -1;

        for(int i = 1; i <= 9; i++) {
            for(int k = 1; k <= 9; k++) {
                int val = sc.nextInt();
                if(maxValue < val) {
                    maxValue = val;
                    xPos = i;
                    yPos = k;
                }
            }
        }

        System.out.println(maxValue);
        System.out.println(xPos + " " + yPos);

        sc.close();
    }
}
