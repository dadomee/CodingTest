class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("left")){
            answer[numbers.length-1] = numbers[0];
            for(int i = 0; i<numbers.length-1; i++){
                answer[i]= numbers[i+1];
            }
        }else if(direction.equals("right")){
            answer[0] = numbers[numbers.length-1];
            for(int j = 1; j<numbers.length; j++){
                answer[j]= numbers[j-1];
            }
        }
        return answer;
    }
}