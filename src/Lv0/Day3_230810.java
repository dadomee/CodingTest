package Lv0;


import java.util.Arrays;
//문제 설명
//중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
//
//제한사항
//array의 길이는 홀수입니다.
//0 < array의 길이 < 100
//-1,000 < array의 원소 < 1,000
class Solution8 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2];

        return answer;
    }
}
//Arrays.sort ==> 배열을 오름차순으로 정리해 준다.
//---------------------------------------------------------------------------------

//최빈값 구하기
//문제 설명
//최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
//
//제한사항
//0 < array의 길이 < 100
//0 ≤ array의 원소 < 1000

//import java.util.Arrays;
class Solution9 {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0; // 배열길이 담을 int

        Arrays.sort(array); // 오름차순으로 sort
        max = array[array.length-1]; // sort한 배열 길이 담기 ( 시작이 0 부터니가 -1 해주기)

        int count[] = new int[max+1]; // count 배열에 max+1 담아주기
        for(int i = 0; i<array.length; i++){ // array 길이만큼 for문 돌려서 같은 값이 있다면 카운트 올려주기
            count[array[i]]++;
        }
        max = count[0]; // 배열의 길이는 count 맨처음값
        for(int i =1; i<count.length; i++){ //카운트 배열 길이만 큼 돌려서
            if(max<count[i]){ // 높은 빈도 수 계속 update 시켜주기
                max=count[i];
                answer=i;
            }else if(max==count[i]){
                answer = -1;
            }
        }
        return answer;
    }
}
//배열, array에 대한 개념이 없어서 바로 구글링해서
//답을 봐도 한 번에 파악하기 어려웠다.
//index용 count함수를 만들어서 카운트 누적하는 거 생각도 못했음..
//==============================================================================

//문제 설명
//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ n ≤ 100

class Solution10 {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];

        for(int i=0; i<=n; i++){
            if(i % 2 == 1){
                answer[i/2] = i;
            }
        }
        return answer;
    }
}

//import java.util.stream.IntStream;
//
//class Solution {
//    public int[] solution(int n) {
//        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
//    }
//}
//stream 한줄컷... stream 공부해야겠다