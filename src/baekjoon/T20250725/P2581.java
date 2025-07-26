package baekjoon.T20250725;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * 소수를 구하는 방법은 여러가지가 있지만 [ 에라토스테네스의 체 ] 알고리즘이
 * 제일 효율적이다.
 * - 2 부터 시작하여 2의 배수를 먼저 제거
 * - 3 의 배수를 제거
 * - 5 의 배수를 제거
 * 이런 식으로 반복하면 남은 수들은 소수 이다.
 *
 * 최악의 경우에는 M = 1, N = 10,000 이기 떄문에
 * N 까지의 소수를 전부 뽑아도 된다고 판단함
 *
 *
 */
public class P2581 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] prime = getPrimeTo(N);

        int sum = 0;
        int minPrimeNumber = N;
        for(int i = M; i <= N; i++) {
            if(prime[i]) {
                sum += i;
                minPrimeNumber = Math.min(minPrimeNumber, i);
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(minPrimeNumber);
        }

        sc.close();
    }

    public static boolean[] getPrimeTo(int number) {

        boolean[] prime = new boolean[number + 1];
        Arrays.fill(prime, true); // 기본 전제는 모두가 소수라고 적용

        /**
         * 0, 1은 소수 가 아니기 때문에 false 처리
         */
        prime[0] = false;
        prime[1] = false;

        /**
         *
         * 2 부터 숫자를 체크하고
         * 해당 숫자가 소수 라면 해당 숫자의 배수를 소수가 아닌 것으로 처리
         *
         * 아래와 같이 하게되면 number 숫자가 커지면 ArrayIndexOutOfBoundsException 발생할 수 있다.
         * 이런 경우에는 i <= number 대신에 i <= Math.sqrt(number) 범위까지 하면 된다.
         *   전제 ) 어떤 N이 두 개이상 곱셈(인수)으로 나타낼 수 있을 때 인수 중 한 개 이상은 반드시 √N보다 작거나 같다는 것이다.
         *
         */
        for(int i = 2; i <= number; i++) { // for(int i = 2; i <= Math.sqrt(number); i++)
            if(prime[i] == true) {
                for(int j = i * i; j <= number; j += i) {
                    prime[j] = false;
                }
            }
        }

        return prime;
    }
}
