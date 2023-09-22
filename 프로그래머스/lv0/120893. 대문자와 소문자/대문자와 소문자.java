class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr1 = my_string.toCharArray();
        String[] arr = my_string.split("");
        for(int i = 0; i<arr.length; i++){
            if(Character.isUpperCase(arr1[i])==true){
                answer+=arr[i].toLowerCase();
            }else{
                answer+=arr[i].toUpperCase();
            }
        }
        return answer;
    }
}