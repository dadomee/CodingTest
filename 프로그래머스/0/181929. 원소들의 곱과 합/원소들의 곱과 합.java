
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        double gob = 1;
        int hab =0;
        for(int i=0; i<num_list.length; i++){
            gob *= num_list[i];
            hab += num_list[i];
        }
        if(gob<hab*hab){
            answer = 1;
        }
        return answer;
    }
}