class Solution {
    public int solution(int n, String control) {
        String[] arr = new String[control.length()];
         arr= control.split("");
        for(int i=0; i<arr.length; i++){
          switch(arr[i]){
                case "w": n= n+1;
                    continue;
                case "s": n= n-1;
                    continue;
                case "d": n= n+10;
                    continue;
                case "a" :n= n-10;
                    continue;
            }   
         }
        
        
        return n;
    }
}