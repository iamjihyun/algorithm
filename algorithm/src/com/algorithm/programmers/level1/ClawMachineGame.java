package com.algorithm.programmers.level1;

import java.util.ArrayList;

public class ClawMachineGame {

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};//[y][x] 중, x값

        solution(board, moves);
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> stack = new ArrayList<>();

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
            int a = 0;
            for(int j = 0; j < board.length; j++){
                if(board[j][xIdx]!=0) {
                    //담기
                    stack.add(board[j][xIdx]);
                    if(stack.size()>=2) {
                         a = stack.size();
                        if (a >= 2 || stack.get( a - 1) == stack.get( a - 2)) {
                            //System.out.println("안드러오면되자나.... : " + stack.size());
                            System.out.println("aa"+ (a-1));
                            System.out.println("aa"+ (a-2));
                            stack.remove((a - 1));
                            stack.remove((a - 2));
                            answer += 2;
                        }
                    }
                    //System.out.println("board["+j+"]["+xIdx+"] : " + board[j][xIdx]);
                    board[j][xIdx] = 0;
                    //System.out.println("board["+j+"]["+xIdx+"] : " + board[j][xIdx]);
                    break;
                }
            }

        }
        //삭제 후에 삭제된 데이터 앞 뒤로 같은 숫자이면 어떻게 해결 할 것인가?
        for(int k =0; k < stack.size()-1; k++){
            //두개가 같은것이 나오면 둘다 삭제

//                stack.remove(k);
//                stack.remove((k+1));
                System.out.println(stack.get(k));
                //answer += 2;

        }

        System.out.println("answer : " + answer);
        return answer;
    }
}