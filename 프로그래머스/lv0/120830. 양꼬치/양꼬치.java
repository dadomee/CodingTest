class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if(n>=10){
            int su = n/10;
            answer = (n*12000)+(k*2000)-(su*2000);
        }else{
            answer = n*12000+k*2000;
        }
        return answer;
    }
}