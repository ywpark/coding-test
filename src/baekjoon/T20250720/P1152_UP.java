package baekjoon.T20250720;

import java.io.IOException;
import java.io.InputStream;

public class P1152_UP {


    public static void main(String[] args) throws IOException {

        InputStream is = System.in;
        byte[] buffer = new byte[1000002];
        is.read(buffer);

        int cnt = 0;
        for(int i = 1; ; i++) {

            if(buffer[i] == 32) { // 아스키코드 32 는 space 이다
                cnt++;
            }
            else if(buffer[i] == 10) { // 아스키코드 10 은 New Line 이다
                if(buffer[i - 1] != 32) {
                    cnt++;
                }
                break;
            }

        }
        System.out.print(cnt);
    }
}
