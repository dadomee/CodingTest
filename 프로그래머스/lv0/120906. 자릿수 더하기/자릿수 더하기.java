class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        String[] arr = num.split("");
        for(int i=0; i<arr.length; i++){
            answer +=Integer.parseInt(arr[i]);
        }
        return answer;
    }
}