class Solution {
    public int[] solution(int[] arr) {
        int leng=0;
           for(int i=0; i< arr.length; i++){
               leng+=arr[i];
           }
        int[] answer = new int[leng];
        
    int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}