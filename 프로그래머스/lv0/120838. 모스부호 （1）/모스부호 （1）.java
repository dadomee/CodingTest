class Solution {
    public String solution(String letter) {
        String answer = "";
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String let[] = letter.split(" ");
        for(int i = 0; i<let.length; i++){
            for(int j =0; j<morse.length; j++){
                if(let[i].equals(morse[j])){
                    answer+= Character.toString(j+'a');
                }
            }
        }
        return answer;
    }
}