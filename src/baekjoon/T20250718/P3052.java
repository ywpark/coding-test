package baekjoon.T20250718;

import java.util.Scanner;

public class P3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[42]; // 이 부분은 Set 을 활용해서도 접근 가능함

        for(int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            int r = number % 42;
            check[r] = true;
        }

        int result = 0;
        for(boolean chk : check) {
            if(chk) {
                result++;
            }
        }

        System.out.print(result);
        sc.close();
    }
}
