package baekjoon.T20250721;

import java.util.Scanner;

public class P3003 {

    static final int KING = 1;
    static final int QUEEN = 1;
    static final int ROOK = 2;
    static final int BISHOP = 2;
    static final int KNIGHT = 2;
    static final int PAWN = 8;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int findKing = sc.nextInt();
        int findQueen = sc.nextInt();
        int findRook = sc.nextInt();
        int findBishop = sc.nextInt();
        int findKnight = sc.nextInt();
        int findPawn = sc.nextInt();

        System.out.printf("%d %d %d %d %d %d", KING - findKing, QUEEN - findQueen, ROOK - findRook,
                BISHOP - findBishop, KNIGHT - findKnight, PAWN - findPawn);

    }

}
