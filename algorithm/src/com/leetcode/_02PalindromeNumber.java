package com.leetcode;

public class _02PalindromeNumber {
    public static void main(String[] args) {
        boolean result;
        int num = 12344321;

        result = isPalindrome(num);
        System.out.println("정답 : " + result);

    }
    public static boolean isPalindrome(int x) {
        //string 대소문자 구별 주의
        //String.valueOf()함수....
        String keyword = String.valueOf(x);
        System.out.println(keyword);
        char[] key = keyword.toCharArray();
        for(int i = 0; i<key.length-1; i++){
            if(key[i]!=key[key.length-1-i]){
                return false;
            }
        }


        return true;
    }
}
