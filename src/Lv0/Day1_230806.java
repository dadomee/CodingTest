package Lv0;

class Day1_230806 {}
    //두 수의 합
    //정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
    //제한사항
    //-50,000 ≤ num1 ≤ 50,000
    //-50,000 ≤ num2 ≤ 50,000

    //나의 풀이
    class Solution {
        public int solution(int num1, int num2) {
            int answer = num1 + num2;
            return answer;
        }
    }

    //타인의 풀이
    class Solution_1 {
        public int solution(int num1, int num2) {
            boolean val = (-50000<= num1 && num1<= 50000 && -50000<=num2 && num2 <= 50000);
            //제한 사항도 반영 boolean에도 조건식 가능
            int answer = -1;
            //boolean false 반환 시 -1 나오게 .
            if(val){
                answer = num1 + num2;
            }
            return answer;
        }
    }

    //===================================================================================================

//정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
//
//제한사항
//-50000 ≤ num1 ≤ 50000
//-50000 ≤ num2 ≤ 50000

//위의 풀이를 적용한 나의 풀이
class Solution1{
    public int solution(int num1, int num2) {
        boolean val = (-50000 <= num1 && num1<= 50000 && -50000 <=num2 &&num2 <= 50000);
        int answer = 0;
        if(val){
            answer = num1-num2;
        }
        return answer;
    }
}

//===================================================================================
//문제 설명
//정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//0 ≤ num1 ≤ 100
//0 ≤ num2 ≤ 100
class Solution2 {
    public int solution(int num1, int num2) {
        boolean b = ( 0<=num1 && num1 <= 100&& 0<= num2 && num2<= 100);
        int answer = 0;
        if(b) {
            answer = num1 * num2;
        }
        return answer;
    }
}

//=======================================================================
//몫 구하기
//문제 설명
//정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//0 < num1 ≤ 100
//0 < num2 ≤ 100

class Solution3 {
    public int solution(int num1, int num2) {
        boolean b = ( 0<=num1 && num1 <= 100&& 0<= num2 && num2<= 100);
        int answer = 0;

        if(b){
            answer = num1/num2;
        }
        return answer;
    }
}
//====================================================================
//두 수의 나눗셈
//문제 설명
//정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
//
//제한사항
//0 < num1 ≤ 100
//0 < num2 ≤ 100

class Solution4 {
    public int solution(int num1, int num2) {
        double answer = (double)num1 / num2*1000;
        return (int)answer;
    }
}
// 자료형과 캐스팅에 대한 문제였다.
//float 캐스팅 했더니 실수부를 7자리까지 뽑아서 테스트에 걸렸다.