package baekjoon.T20250718;

import java.io.IOException;

public class P2743 {

    static byte[] input = new byte[100];

    public static void main(String[] args) throws IOException {

        System.in.read(input);

        int pos = 0;
        int length = 0;
        while(pos <= 99 && input[pos++] >= 65) { // 아스키코드 A(65)
            length++;
        }

        System.out.println(length);

    }
}
