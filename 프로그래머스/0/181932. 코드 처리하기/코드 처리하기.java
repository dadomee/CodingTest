class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        int code_idx[] = new int[code.length()];
        for(int i= 0; i<code.length(); i++){
            code_idx[i] = i;
            if(mode == 0){
                if(code.substring(i,i+1).equals("1")){
                mode = 1;
                    continue;
            }
            if(code_idx[i]%2==0){
                answer += code.substring(i,i+1);
            }
        }else if( mode == 1){
                if(code.substring(i,i+1).equals("1")){
                mode = 0;
                continue;
            }
           if(code_idx[i]%2==1){
                answer += code.substring(i,i+1);
            }
            }
        }
        
        if(answer.equals("")){
            answer = "EMPTY";
        }
    
        return answer;
        }
    }