package baekjoon.T20250717;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P10807 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        List<Integer> lists = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        int findNumber = Integer.parseInt(br.readLine());

        int result = 0;
        for(Integer number : lists) {
            if(findNumber == number) {
                result++;
            }
        }

        System.out.println(result);
    }
}
