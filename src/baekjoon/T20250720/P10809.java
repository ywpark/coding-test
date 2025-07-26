package baekjoon.T20250720;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P10809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Map<String, Integer> result = new HashMap<>();
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(!result.containsKey(String.valueOf(ch)))
                result.put(String.valueOf(ch), i);
        }

        for(char ch = 'a'; ch <= 'z'; ch++) {
            System.out.printf("%d ", result.getOrDefault(String.valueOf(ch), -1));
        }

    }
}
