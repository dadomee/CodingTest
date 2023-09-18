
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char arr[] = my_string.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(48<arr[i]&&arr[i]<58){
                answer += (int)arr[i]-48;
            }
        }
        return answer;
    }
}