import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num[] = new int[30];
        
        for (int i = 0; i <28; i++) {
          int n = Integer.parseInt(bf.readLine());
          num[n-1]=1;
        }
        bf.close();
        
        for (int i = 0; i <30; i++) {
            if (num[i]==0) {
            	System.out.println(i+1);
            }
        }
        
    }
}
