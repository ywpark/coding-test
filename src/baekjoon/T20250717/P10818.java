package baekjoon.T20250717;

import java.util.Scanner;

public class P10818 {

    /**
     * 
     * 성능 상 좋지 않다.
     * 최적화 된 것은 P10818_UP.java 파일 참조
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int max = 0, min = 0;

        for(int i = 0; i < length; i++) {

            int number = sc.nextInt();
            if(i == 0) {
                max = number;
                min = number;
            }
            else {
                max = Math.max(max, number);
                min = Math.min(min, number);
            }
        }
        System.out.println(min + " " + max);
        sc.close();

    }
}
