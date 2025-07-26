package baekjoon.T20250715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2588 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int f = b % 10;
        int s = (b / 10) % 10;
        int t = b / 100;

        System.out.println(a*f);
        System.out.println(a*s);
        System.out.println(a*t);
        System.out.println(a*f + 10*a*s + 100*t);

    }

}
