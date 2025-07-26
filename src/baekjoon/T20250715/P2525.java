package baekjoon.T20250715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2525 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int workingMin = Integer.parseInt(br.readLine());

        /**
         * 시 영역을 분으로 변환한 뒤에 workingMin 을 더하고
         * 그 뒤에 시, 분 영역으로 나눠도 된다.
         */
        int completeMin = (min + workingMin) % 60;
        int completeHour = hour + ((min + workingMin) / 60);

        System.out.println((completeHour >= 24 ? completeHour - 24 : completeHour) + " " + completeMin);

    }

}
