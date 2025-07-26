package baekjoon.T20250716;

import java.util.Arrays;
import java.util.Scanner;

public class P10950 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCaseNumber = sc.nextInt();

        int[] answers = new int[testCaseNumber];
        for(int i = 0; i < testCaseNumber; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            answers[i] = a + b;
        }

        Arrays.stream(answers)
                        .forEach(System.out::println);
        sc.close();
    }
}
