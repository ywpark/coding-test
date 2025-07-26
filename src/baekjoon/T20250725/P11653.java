package baekjoon.T20250725;

import java.util.*;

/**
 *
 * @TODO 소인수분해 확인해보자
 *
 * 소인수 분해를 구하라
 *
 * (1) 번 방법 -> 시간초과
 * 2부터 숫자 N 까지 소수인지 체크를 하고
 * 나머지가 0 이 아닐떄까지 동일한 소수로 나누기를 하고
 * 나머지가 0 이 아닌 경우에는 2 -> N 까지 숫자를 증가하면서 한다
 *
 * (2) 번 방법
 * 숫자 N 까지 미리 소수 목록을 구하고 소인수 분해를 해본다.
 *  => 여기서는 숫자 Overflow 이슈 발생
 *
 * (3) 번 방법
 *  외부 풀이를 확인함
 *
 */
public class P11653 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 2; i <= Math.sqrt(N); i++) {
            while(N % i == 0) {
                System.out.println(i);
                N = N / i;
            }
        }

        if(N != 1) {
            System.out.println(N);
        }

        sc.close();
    }

}
