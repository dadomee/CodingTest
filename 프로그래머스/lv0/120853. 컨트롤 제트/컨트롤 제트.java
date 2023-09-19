class Solution {
    public int solution(String s) {
         int answer = 0;
        String arr[] = s.split(" ");
        for(int i=0; i<arr.length; i++){
         if(arr[i].equals("Z")){
             answer -=Integer.parseInt(arr[i-1]);
            continue;
             //컨티뉴 만나면 밑에 문장 실행 X 다시 반복문으로 돌아간다
             //i++하면 밑에 문장 다시 더하기 때문에 에러
         }
        answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}