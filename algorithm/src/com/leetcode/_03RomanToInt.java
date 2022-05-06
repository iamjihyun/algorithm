package com.leetcode;

public class _03RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        int result = 0;
        result = romanToInt(s);
        System.out.println("정답 : " + result);
    }

    public static int romanToInt(String s) {
        char[] keywordArr = new char[s.length()];
        keywordArr = s.toCharArray();
        int result = 0;
        for(int i = 0; i < keywordArr.length; i++) {
            switch(keywordArr[i]) {
                case 'I':
                    //4일때와 9일 때
                    if(i !=keywordArr.length-1 && keywordArr[i+1]=='V' ) {
                        result+=4;
                        i+=1;
                    }else if(i !=keywordArr.length-1 && keywordArr[i+1]=='X') {
                        result+=9;
                        i+=1;
                    }else {
                        result+=1;
                    }
                    break;
                case 'V':
                    result+=5;
                    break;
                case 'X':
                    //40일때와 90일 때
                    if(i !=keywordArr.length-1 && keywordArr[i+1]=='L') {
                        result+=40;
                        i+=1;
                    }else if(i !=keywordArr.length-1 && keywordArr[i+1]=='C') {
                        result+=90;
                        i+=1;
                    }else {

                        result+=10;
                    }
                    break;
                case 'L':
                    result+=50;
                    break;
                case 'C':
                    //400일때와 900일때
                    if(i !=keywordArr.length-1 && keywordArr[i+1]=='D') {
                        result+=400;
                        i+=1;
                    }else if(i !=keywordArr.length-1 && keywordArr[i+1]=='M') {
                        result+=900;
                        i+=1;
                    }else {
                        result+=100;

                    }
                    break;
                case 'D':
                    result+=500;
                    break;
                case 'M':
                    result+=1000;
                    break;
                default :
                    result+=0;
                    break;

            }

        }

        return result;
    }

//    문제 내용 이해가 중요
//    로마글자를 숫자로 변경하는것. 핵심은 두글자가 붙어있는 글자를 제대로된 숫자로 설정하기.
//
//        회고
//        두글자와 한 글자의 규칙을 찾는게 어려웠으나, 큰 IF문 안에 작은 IF문으로 세팅하니 쉽게 됐다.
//        다만 바로 옆의 인덱스+1을 할 때, 마지막인덱스를 탐색할 땐 오류가 나니 IF문 맨 앞쪽에 마지막인덱스는 탐색 시 한글자 탐색 분기문을 타도록 해야 함.

}

