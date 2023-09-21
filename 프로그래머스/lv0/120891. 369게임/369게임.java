class Solution {
    public int solution(int order) {
        String su = String.valueOf(order);
        char[] arr = su.toCharArray();
         int answer = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] =='3'||arr[i] =='6'||arr[i] =='9'){
                answer++;
            }
        }
       
        return answer;
    }
}