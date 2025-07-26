package baekjoon.T20250715;

import java.util.Scanner;

public class P2884 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if(min >= 45) {
            System.out.print(hour + " " + (min-45));
        }
        else {
            hour = hour == 0 ? 24 : hour;
            System.out.print((hour - 1) + " " + (min + 15));
        }

        sc.close();
    }
}
