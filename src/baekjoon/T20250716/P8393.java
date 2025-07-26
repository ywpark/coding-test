package baekjoon.T20250716;

import java.util.Scanner;

public class P8393 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        boolean isEven = number % 2 == 0;

        int sum = 0;
        if(isEven) {
            sum = (1 + number) * number / 2;
        }
        else {
            int lastEven = number - 1;
            sum = ((1 + lastEven) * lastEven / 2) + number;
        }

        System.out.println(sum);
        sc.close();
    }
}
