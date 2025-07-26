package baekjoon.T20250720;

import java.util.Arrays;
import java.util.Scanner;

public class P1152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(
                Arrays.stream(input.split(" "))
                .filter(i -> !i.isEmpty())
                .count()
        );
    }
}
