package baekjoon.T20250720;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P5622 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Map<String, Integer> phones = init();
        int sum = 0;
        for(char ch : input.toCharArray()) {
            int num = phones.get(String.valueOf(ch));
            sum += num + 1;
        }

        System.out.println(sum);

    }

    static Map<String, Integer> init() {

        Map<String, Integer> initMap = new HashMap<>();
        initMap.put("A", 2);
        initMap.put("B", 2);
        initMap.put("C", 2);
        initMap.put("D", 3);
        initMap.put("E", 3);
        initMap.put("F", 3);
        initMap.put("G", 4);
        initMap.put("H", 4);
        initMap.put("I", 4);
        initMap.put("J", 5);
        initMap.put("K", 5);
        initMap.put("L", 5);
        initMap.put("M", 6);
        initMap.put("N", 6);
        initMap.put("O", 6);
        initMap.put("P", 7);
        initMap.put("Q", 7);
        initMap.put("R", 7);
        initMap.put("S", 7);
        initMap.put("T", 8);
        initMap.put("U", 8);
        initMap.put("V", 8);
        initMap.put("W", 9);
        initMap.put("X", 9);
        initMap.put("Y", 9);
        initMap.put("Z", 9);

        return initMap;
    }
}
