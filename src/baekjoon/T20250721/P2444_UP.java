package baekjoon.T20250721;

import java.io.*;

public class P2444_UP {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int row = 2 * N - 1; // N 이 5면 9

        for(int n = 1; n <= row; ++n)
        {
            int cntBlank = Math.abs(n - N); // 절대값으로 계산하여 층 별로 공백 숫자 파악
            /**
             *  '*' 최고 갯수가 row 로 계산되고, 해당 값을 기준으로 각 row 의 '*' 갯수를 
             *  구하는 방식으로 접근한 것으로 보임
             */
            int cntStar = row - 2 * cntBlank;
            for(int i = 0; i < cntBlank; ++i)
                bw.append(' ');
            for(int i = 0; i < cntStar; ++i)
                bw.append('*');

            bw.append('\n');
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
