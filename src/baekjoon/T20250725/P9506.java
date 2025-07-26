package baekjoon.T20250725;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Math.sqrt() 를 활용하여 자기 자신을 제외한 약수 목록 전체를 List 에 넣고
 * sort 를 통해 정렬한 이후에 출력한다.
 *
 */
public class P9506 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        List<Integer> lists = null;
        while(true) {

            int input = sc.nextInt();
            if(input == -1) {
                break;
            }

            lists = new ArrayList<>();
            int sqr = (int) Math.sqrt(input);
            int sum = 0;
            for(int i = 1; i <= sqr; i++) {
                if(input % i == 0) {
                    lists.add(i);
                    sum += i;
                    if(input / i != i && input / i != input) {
                        lists.add(input / i);
                        sum += (input / i);
                    }
                }
            }

            if(input == sum) {
                lists.sort(Comparator.naturalOrder());
                sb.append(input + " = ");
                for(int number : lists) {
                    sb.append(number + " + ");
                }
                sb.delete(sb.length() - 2, sb.length());
                sb.append("\n");
            }
            else {
                sb.append(input + " is NOT perfect.").append("\n");
            }

        }

        System.out.println(sb.toString());
        sc.close();
    }
}
