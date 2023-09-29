class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[]{0,0};
        for(int i=0; i<array.length; i++){
            for(int j=1; j<array.length; j++){
                if(array[i]<array[j]){
                    answer[0] = array[j];
                    answer[1]=j;
                }
            }
        }
        return answer;
    }
}