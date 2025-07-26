package baekjoon.T20250716;

import java.util.Scanner;

public class P25304 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalAmount = sc.nextInt();
        int count = sc.nextInt();

        int sum = 0;
        while(count > 0) {

            int amount = sc.nextInt();
            int buyCount = sc.nextInt();

            sum += amount * buyCount;
            count--;

        }

        if(sum == totalAmount) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        sc.close();

    }
}
