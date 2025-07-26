package baekjoon.T20250720;

import java.io.IOException;

public class P2908 {

    static byte[] text = new byte[10];

    static int position = 0;

    public static void main(String[] args) throws IOException {

        System.in.read(text);

        int number1 = reverseReadInt();
        int number2 = reverseReadInt();

        System.out.println(number1 > number2 ? number1 : number2);
    }

    static int reverseReadInt() {
        String r = String.valueOf(text[position+2] - '0') + String.valueOf(text[position+1] - '0') + String.valueOf(text[position] - '0');
        position += 4;
        return Integer.parseInt(r);
    }
}
