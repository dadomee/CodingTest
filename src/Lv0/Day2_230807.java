package Lv0;

public class Day2_230807{
}


//숫자 비교하기
//문제 설명
//정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//0 ≤ num1 ≤ 10,000
//0 ≤ num2 ≤ 10,000
class Solution5 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}


// else 문 처리할 때
    //if(num1 == num2) return 1;
    //        else return -1;
//중괄호 없이 이렇게 바로 리턴 값 처리 가능

//간단한 로직은
//  int answer = (num1 == num2) ? 1 : -1; 삼항 연산자로 처리 가능.
//  앞에는 true, 뒤에는 false 일때 반환값
//======================================================================================================

//분수의 덧셈
//문제 설명
//첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
//
//제한사항
//0 <numer1, denom1, numer2, denom2 < 1,000

    class Solution6 {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {

            int numer = numer1 * denom2 + numer2 * denom1;
            int denom = denom1 * denom2;

            int max = 1;

            for (int i = 1; i <= numer && i <= denom; i++) {
                if (numer % i == 0 && denom % i == 0) {
                    max = i;
                }
            }
            numer = numer / max;
            denom = denom / max;
            int[] answer = {numer, denom};
            return answer;
        }
    }
    // 공약수에서 절절 헤맸다...

//=========================================================================================

//배열 두배 만들기
//문제 설명
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//-10,000 ≤ numbers의 원소 ≤ 10,000
//1 ≤ numbers의 길이 ≤ 1,000

class Solution7{
    public int[] solution(int[] numbers) {

        for(int i=0; i<numbers.length; i++){
            numbers[i]*=2;
        }
        return numbers;
    }
}
//배열 길이 구하는게 length 였는지, length() 였는지 아직도 헷갈려
//length() 는 문자열 길이 구할 때 사용!