package baekjoon.T20250718;

import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] scores = new int[count];
        int maxScore = 0;

        for(int i = 0; i < count; i++) {
            int score = sc.nextInt();
            maxScore = Math.max(maxScore, score);
            scores[i] = score;
        }

        float sumScore = 0f;
        for(int s : scores) {
            sumScore += (float)s/maxScore * 100;
        }

        System.out.println(sumScore/count);

        sc.close();
    }
}
