package baekjoon.T20250724;

import java.util.Scanner;

public class P5086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;

        StringBuilder sb = new StringBuilder();
        while(true) {
            A = sc.nextInt();
            B = sc.nextInt();

            if(A == 0 && B == 0) {
                break;
            }
            else if(A > B) {
                String str = A % B == 0 ? "multiple" : "neither";
                sb.append(str).append("\n");
            }
            else {
                String str = B % A == 0 ? "factor" : "neither";
                sb.append(str).append("\n");
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
