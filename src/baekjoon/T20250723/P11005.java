package baekjoon.T20250723;

import java.util.Scanner;
import java.util.Stack;

public class P11005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        int n = 0, r = 0;
        while(true) {
            n = N / B;
            r = N % B;

            st.push(r);

            /**
             * 여러번 반례가 나와서 실패를 하였는데 이유는
             * 위의 n 값, 즉 몫이 0이 되는 경우가 존재하는데 이 경우에
             * 진법 변환을 하게 되면 앞에 0 이 붙기 때문에 제외 처리 되어야 함
             */
            if(n == 0) {
                break;
            }
            else if(n < B) {
                st.push(n);
                break;
            }
            else {
                N = n;
            }
        }

        while(!st.isEmpty()) {
            int k = st.pop();
            if(k < 10) {
                System.out.printf("%d", k);
            }
            else {
                System.out.printf("%c", (char) k + 55);
            }
        }


        sc.close();
    }
}
