import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int num[] = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        bf.close();
        
        Arrays.sort(num);
        // 최솟값과 최댓값 출력
        System.out.println(num[0] + " " + num[n - 1]);
    }
}