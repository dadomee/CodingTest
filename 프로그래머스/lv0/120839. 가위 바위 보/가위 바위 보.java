class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int j=0; j<rsp.length(); j++){
            if(rsp.split("")[j].equals("0")){
                answer+="5";
            }else if(rsp.split("")[j].equals("2")){
                answer+="0";
            }else if(rsp.split("")[j].equals("5")){
                answer+="2";
            }
        }
        return answer;
    }
}