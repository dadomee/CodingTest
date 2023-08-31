class Solution {
    public String solution(int age) {
        String answer = "";
        String age1 = String.valueOf(age);
        for(int i = 0; i<age1.length(); i++){ 
            answer+= (char)(age1.charAt(i)+49);
        }
        return answer;
    }
}