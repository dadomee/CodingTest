class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int [] sum = new int[included.length];
         sum[0] = a;
        for(int i =1; i<sum.length;i++){
            sum[i] = sum[i-1]+d;
        }
        for(int j=0; j<included.length; j++){
            if(included[j]==true){
                answer += sum[j];
        }
        }
        return answer;
    }
}