class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length+1];
        for(int i =0; i<answer.length-1; i++){
            answer[i] = num_list[i];
        }
        int m = num_list[num_list.length-1];
        int n = num_list[num_list.length-2];
        if(m>n){
            answer[answer.length-1] =m-n;
        }else {
            answer[answer.length-1] = m*2;
            
        }
        return answer;
    }
}