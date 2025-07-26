package baekjoon.T20250723;

import java.util.Scanner;

public class P2563 {
    public static void main(String[] args) {
        /**
         *
         * 도화지의 크기는 100x100
         *
         * 10*10 의 색종이를 도화지에 붙일 때 색종이가 붙은 영역의 넓이를 구하라
         *
         * 입력 받은 숫자 x, y 는 정사각형의 왼쪽 아래 꼭지점
         *
         * 100x100 배열을 만들어서 각 사각형의 부분을 1로 채운다
         * 그 뒤에 전체 숫자를 합하면 면적이 나온다
         *
         */

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[][] area = new int[100][100];
        for(int i = 0; i < count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int w = x; w < x + 10; w++) {
                for(int h = y; h < y + 10; h++) {
                    area[w][h] = 1;
                }
            }
        }

        int sumArea = 0;
        for(int[] a : area) {
            for(int b : a) {
                sumArea += b;
            }
        }

        System.out.println(sumArea);
        sc.close();

    }
}
