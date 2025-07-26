package baekjoon.T20250722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2941_UP {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        String[] wordArr ={"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String word : wordArr){
            str = str.replace(word, ".");

        }
        System.out.println(str.length());
    }
}
