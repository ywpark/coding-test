package baekjoon.T20250717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10951 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        while(true) {

            /**
             * 입출력의 EOF(End Of File) 를 알고 있어야 함
             */
            String readStr = br.readLine();
            if(readStr == null) {
                break;
            }

            st = new StringTokenizer(readStr, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a + b).append("\n");

        }

        System.out.println(sb.toString());

    }
}