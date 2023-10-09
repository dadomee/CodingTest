import java.util.*;
class Solution {
    public String solution(String my_string) {
        String str= my_string.toLowerCase();
        String[] arr = str.split("");
        Arrays.sort(arr);
        String answer ="";
        for(int i=0; i<arr.length; i++){
            answer +=arr[i];
        }
        return answer;
    }
}