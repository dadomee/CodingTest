
class Solution {
    public int solution(int[] numbers) {
        long answer = -100000000;
        for(int i = 0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i!=j){
                    long su = numbers[i]*numbers[j];
                    if(answer<su){
                        answer = su;
                    }
                }
            }
        }
        return (int)answer;
    }
}