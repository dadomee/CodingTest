package Lv1;

public class Day4_230821 {
    public static void main(String[] args){
        Solution11 s = new Solution11();

    }
}

//문제 설명
//문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
//제한사항
//1 ≤ arr의 길이 ≤ 200
//arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
//import java.util.*;
class Solution11 {
    public String solution(String[] arr) {
        String answer = "";
        if(1<=arr.length&&arr.length<=200){
            //Arrays.sort(arr);
            for(int i=0; i<=arr.length-1; i++){
                answer += arr[i];
            }
        }
        return answer;
    }
}

// 테스트 예시가 abc 하나라서
//Arrays.sort를 썼다가 지웠다...
//그래도 혼자서 풀어냄!


//====================================================================
//문제 설명
//문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
//
//제한사항
//1 ≤ my_string의 길이 ≤ 100
//my_string은 영소문자로만 이루어져 있습니다.
//1 ≤ k ≤ 100
class Solution12 {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i=1; i<=k; i++){
            answer += my_string;
        }
        return answer;
    }
}

//=========================================================================
//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//
//단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
class Solution13{
    public int solution(int a, int b) {
        int answer = 0;
        String AB= String.valueOf(a)+String.valueOf(b);
        String BA= String.valueOf(b)+String.valueOf(a);

        a = Integer.parseInt(AB);
        b = Integer.parseInt(BA);
        if(a>=b){
            answer=a;
        }else{
            answer=b;
        }
        return answer;
    }
}
//으악 charAt으로 바꿨다가 인트로 바꿨다가 너무 길어져서 이건 아니다 싶었는데...
//String.valueOf 랑 Integer.parseInt 완전 까먹고 있었다.

//=================================================================================
//두 수의 연산값 비교하기
//문제 설명
//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
//
//단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
//
//제한사항
//1 ≤ a, b < 10,000
class Solution14 {
    public int solution(int a, int b) {
        int answer = 0;
        int c = 2*a*b;
        String AB =String.valueOf(a)+String.valueOf(b);

        a = Integer.parseInt(AB);


        if(a>=c){
            answer = a;
        }else{
            answer = c;
        }
        return answer;
    }
}
//====================================================
//n의 배수
//문제 설명
//정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//2 ≤ num ≤ 100
//2 ≤ n ≤ 9

class Solution15 {
    public int solution(int num, int n) {
        int answer = 0;
        if(num%n==0){
            answer =1;
        }else{
            answer = 0;
        }
        return answer;
    }
}

//===================================================================
//공배수
//문제 설명
//정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//10 ≤ number ≤ 100
//2 ≤ n, m < 10
class Solution16 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number%n==0 && number%m ==0){
            answer=1;
        }else{
            answer=0;
        }
        return answer;
    }
}

//======================================================================

//홀짝에 따라 다른 값 반환하기
//문제 설명
//양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
//
//제한사항
//1 ≤ n ≤ 100

class Solution17 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%2==1 && i%2==1){
                answer+=i;
            }else if(n%2==0 && i%2==0){
                answer+=i*i;
            }
        }
        return answer;
    }
}

//이거 나는 if 문안에 for문을 넣어서
//엄청 헤맸음 ... 결국 구글링했다. 다음에 다시 도전! 꼭 다시하기!