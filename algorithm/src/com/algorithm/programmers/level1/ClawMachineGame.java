package com.algorithm.programmers.level1;

public class ClawMachineGame {

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};//[y][x] 중, x값

        solution(board, moves);
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] stack = new int[moves.length];

        for(int i = 0; i < moves.length; i++){
            //삽입 삭제.
            //00000
            //00103
            //02501
            //42442
            //35131

            //15351214
            //x값이 정해져있다. 그렇다면 세로(y) 크기만큼 움직여 0이아닌 값을 빼고 0으로 설정.
            int xIdx = moves[i]-1;
            for(int j = 0; j < board.length; j++){
                if(board[j][xIdx]!=0){
                    stack[i] = board[j][xIdx];

                }

            }

        }
        return answer;
    }
}


