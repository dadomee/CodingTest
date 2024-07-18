import java.io.BufferedReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num[] = new int[10];
        
        for (int i = 0; i <10; i++) {
          num[i] = Integer.parseInt(bf.readLine());
        }
        bf.close();
        
        for (int i = 0; i <10; i++) {
           num[i]=(num[i]%42);
            }
        Arrays.sort(num);
        int count =0;
        for(int i=0; i<9; i++) {
        	if(num[i]!=num[i+1]) {
        		count++;
        	}
        }
        System.out.print(count+1);
        }
        
    }
