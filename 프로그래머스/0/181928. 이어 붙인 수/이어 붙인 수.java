class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String odd ="";
        String eve="";
        for(int i=0; i<num_list.length; i++){
          if(num_list[i]%2==1){
              odd += String.valueOf(num_list[i]);
          }else if(num_list[i]%2==0){
              eve += String.valueOf(num_list[i]);
          }  
        }
         answer = Integer.parseInt(odd);
             answer = answer+Integer.parseInt(eve);
        
        return answer;
    }
}