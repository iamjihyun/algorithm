# 가운데 글자 가져오기
 - 링크 : https://programmers.co.kr/learn/courses/30/lessons/12903

# 설명
 - 주어진 문자열의 가운데 글자만 반환하는 솔루션을 제시하는 것. 단 길이가 짝수인 문자열은 가운데 글자 두개를 반환할 것.


# 풀이 및 포인트
 - String 자료형을 Char[] 자료형으로 변환하는 함수(ex- s.ToArrayChar();)활용
 - 주어진 문자열의 길이가 짝수인 경우, 홀수인 경우 판단하여 인덱스 구하기.
 - *** 배열의 길이는 짝수일때 2, 홀수일때 1이다. 무조건 2로 할당시켜놓고 나중에 반환처리하면 홀수일때 빈공간의 배열도 같이 반환되니 주의할 것.