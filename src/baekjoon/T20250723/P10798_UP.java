package baekjoon.T20250723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10798_UP {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                /**
                 * 문자를 뽑으려는 index 보다 글자 길이가 긴 경우에만 접근하는 방식
                 */
                if (arr[j].length() > i) { 
                    sb.append(arr[j].charAt(i));
                }
            }
        }

        System.out.println(sb);

    }
}
