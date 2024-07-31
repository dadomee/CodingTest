class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        String str1 = myString.replace("A","X").replace("B","A").replace("X","B");
        if(str1.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}