class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String arr = String.valueOf(num);
        String[] arr1 = arr.split("");
        for(int i=0; i<arr1.length; i++){
            if(Integer.parseInt(arr1[i])==k){
                answer = i+1;
                break;
        }
        }
        return answer;
    }
}