class Solution {
    public int[] solution(int[] num_list) {
       int answer[] = new int[num_list.length];
        for(int i = num_list.length-1; 0<=i; i--){
           for(int j = 0; j<=answer.length-1; j++){
               answer[i]=num_list[j];
               i--;
           }
        }
        return answer;
    }
}