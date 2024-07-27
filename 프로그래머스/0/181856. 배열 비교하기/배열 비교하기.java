class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length==arr2.length){
            int hab1=0;
            int hab2=0;
            for(int i=0; i<arr1.length; i++){
                hab1+=arr1[i];
            }
            for(int j=0; j<arr2.length; j++){
                hab2+=arr2[j];
            }
            if(hab1>hab2){
                answer = 1;
            }else if(hab2>hab1){
                answer = -1;
            }
        }else if(arr1.length>arr2.length){
            answer = 1;
        }else{
            answer = -1;
        }
        return answer;
    }
}