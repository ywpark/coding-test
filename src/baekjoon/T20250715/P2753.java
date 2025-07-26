package baekjoon.T20250715;

import java.util.Scanner;

public class P2753 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean check = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if(check) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

        sc.close();
    }
}
