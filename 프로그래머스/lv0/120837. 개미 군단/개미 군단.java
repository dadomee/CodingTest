class Solution {
    public int solution(int hp) {
        int answer = 0;
        int left = 0;
        answer = hp/5;
        left = hp%5;
        answer += left/3;
        left = left %3;
        answer += left;
        return answer;
    }
}