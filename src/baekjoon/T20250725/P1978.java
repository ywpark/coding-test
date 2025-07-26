package baekjoon.T20250725;

import java.util.Scanner;

public class P1978 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int primeCount = 0;
        for(int i = 0; i < count; i++) {

            int number = sc.nextInt();
            if(number == 1) {
                continue;
            }

            if(isPrime(number)) {
                primeCount++;
            }
        }

        System.out.println(primeCount);
        sc.close();
    }


    /**
     * 1 ~ 자기자신 까지의 약수를 구하면서 약수의 갯수가 2개를 초과하면 소수가 아니라고 판단함
     * 
     * @param N
     * @return
     */
    public static boolean isPrime(int N) {

        boolean result = true;
        int cnt = 0;
        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                cnt++;
            }
            if(cnt > 2) {
                result = false;
            }
        }
        return result;
    }

}
