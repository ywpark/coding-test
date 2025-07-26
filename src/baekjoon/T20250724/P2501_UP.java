package baekjoon.T20250724;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 조금 더 효율적으로 약수를 찾는 방법
 * P2501 의 경우 O(N) 이 나온다. 그렇기에 좀 더 효율적인 알고리즘을 찾아보자
 *
 */
public class P2501_UP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        /**
         * 약수를 구할 떄 구하고자 하는 숫자의 1 ~ N 의 제곱근 까지만 loop 를 돌면된다.
         * 여기서 구해진 숫자를 추가로 한번 더 나누게 되면서 나머지 약수들도 구할 수 있다.
         *
         * 예를 들어 100 의 약수를 구한다고 해보면
         * 처음에 제곱근 인 10 까지 loop 를 돌면서 찾는다
         * 그러면 [ 1, 2, 5, 10 ] 을 찾게 되고 이 숫자들을 100 에서 나눈다
         * 그러면 [ 100, 50, 20, 10 ] 이라는 숫자를 찾게 되고 N / i != i 를 통해 중복 숫자 제외
         * 그리고 마지막에 sort 를 하게 되면 1,2,5,10,20,50,100 이라는 데이터를 얻을 수 있다.
         *
         */
        int number = (int)Math.sqrt(N);
        List<Integer> lists = new ArrayList<>();
        for(int i = 1; i <= number; i++) {
            if(N % i == 0) {
                lists.add(i);
                if(N / i != i) {
                    lists.add(N / i);
                }
            }
        }
        lists.sort(Comparator.naturalOrder());

        if(lists.size() < K) {
            System.out.println(0);
        }
        else {
            System.out.println(lists.get(K));
        }
        sc.close();
    }
}
