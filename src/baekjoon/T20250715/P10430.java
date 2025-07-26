package baekjoon.T20250715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10430 {

    public static void main(String[] args) throws IOException {

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bis.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result1 = (a + b) % c;
        int result2 = ((a%c) + (b%c)) % c;
        int result3 = (a*b) % c;
        int result4 = ((a%c) * (b%c)) % c;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }

}
