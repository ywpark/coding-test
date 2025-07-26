package baekjoon.T20250721;

import java.util.Scanner;

public class P2444 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int floor = sc.nextInt();
        int maxFloor = 2 * floor - 1;

        int downfloor = 1;
        for(int i = 1; i <= maxFloor; i++) {

            if(i <= floor) {
                System.out.print(" ".repeat(floor - i));
                System.out.println("*".repeat(2*i - 1));
            }
            else {
                int sameFloor = i - 2 * downfloor;
                System.out.print(" ".repeat(i - floor));
                System.out.println("*".repeat(2 * sameFloor - 1));
                downfloor++;
            }
        }
    }
}
