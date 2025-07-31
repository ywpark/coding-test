package baekjoon.T20250731;

import java.util.Arrays;
import java.util.Scanner;

public class P2587 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        numbers[3] = sc.nextInt();
        numbers[4] = sc.nextInt();

        Arrays.sort(numbers);

        int sum = 0;
        for(int i : numbers) {
            sum += i;
        }

        System.out.println(sum / 5);
        System.out.println(numbers[2]);

        sc.close();
    }
}
