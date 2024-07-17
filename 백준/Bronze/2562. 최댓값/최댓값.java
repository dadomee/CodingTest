import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num[] = new int[9];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(bf.readLine());
        }
        bf.close();
        
        int max = num[0];
        int index = 0;
        
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                index = i;
            }
        }
        
        System.out.println(max);
        System.out.println(index + 1);
    }
}
