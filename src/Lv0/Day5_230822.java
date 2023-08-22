package Lv0;

public class Day5_230822 {
}

//피자 나눠 먹기 (1)
//문제 설명
//머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
//
//제한사항
//1 ≤ n ≤ 100

class Solution18 {
    public int solution(int n) {
        int answer = 0;
        if(n%7==0){
            answer = n/7;
        }else{
            answer = n/7+1;
        }
        return answer;
    }
}

//다른사람 풀이중에 한줄 컷..

//class Solution {
//    public int solution(int n) {
//        return (n + 6) / 7;
//    }
//}

//==============================================================

//피자 나눠 먹기 (2)
//문제 설명
//머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
//
//제한사항
//1 ≤ n ≤ 100


class Solution19 {
    public int solution(int n) {
        int answer = 1;

        while(true){
            if(6*answer%n==0) break;
            answer++;
        }

        return answer;
    }
}

//반복문 정리하기

//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        for(int i=1; i<=n; i++){
//            if(i * 6 % n == 0){
//                answer = i;
//                break;
//            }
//        }
//        return answer;
//    }
//}
//for문에서 어떻게 빠져나가지? 했는데 break 달아주면 됐음 ㅠㅠ

//===============================================================================

    //피자 나눠 먹기 (3)
    //문제 설명
    //머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
    //
    //제한사항
    //2 ≤ slice ≤ 10
    //1 ≤ n ≤ 100

class Solution20 {
    public int solution(int slice, int n) {
        int answer = 1;
        while(true){
            if(slice*answer/n>=1){
                break;
            }
            answer++;
        }
        return answer;
    }
}
//===================================================

//배열의 평균값
//문제 설명
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//0 ≤ numbers의 원소 ≤ 1,000
//1 ≤ numbers의 길이 ≤ 100
//정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

class Solution21 {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        answer = sum/numbers.length;
        return answer;
    }
}
//double,float는 실수부 나온닷

//class Solution {
//    public double solution(int[] numbers) {
//        double answer = 0;
//
//        int sum = 0;
//        for(int i: numbers){
//            sum+=i;
//        }
//        answer = sum/(double)numbers.length;
//        return answer;
//    }
//}
//확장 포문으로 이렇게 써도 되는군!