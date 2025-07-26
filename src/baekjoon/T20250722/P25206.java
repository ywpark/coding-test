package baekjoon.T20250722;

import java.util.Map;
import java.util.Scanner;

public class P25206 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Double> scoreMap = Map.of(
                "A+", 4.5, "A0", 4.0, "B+", 3.5, "B0", 3.0,
                "C+", 2.5, "C0", 2.0, "D+", 1.5, "D0", 1.0,
                "F", 0.0
        );

        double sumScore = 0; // 학점의 총합
        double sumScore2 =0; // 학점 * 과목평점의 총합
        for(int i = 0; i < 20; i++) {

            String objectName = sc.next();
            double score = sc.nextDouble();
            String scoreText = sc.next();

            if("P".equals(scoreText)) {
                continue;
            }

            sumScore += score;
            sumScore2 += score * scoreMap.get(scoreText);
        }

        System.out.println(sumScore2 / sumScore);
        sc.close();
    }
}
