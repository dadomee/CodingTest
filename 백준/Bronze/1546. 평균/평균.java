import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       
        int n = Integer.parseInt(bf.readLine());
        double num[] = new double[n];
        StringTokenizer st= new StringTokenizer(bf.readLine()," ");
        for (int i = 0; i <n; i++) {
          num[i] = Double.parseDouble(st.nextToken());
        }
        bf.close();
        double max = 0;
        for (int i = 0; i<n; i++) {
        	if(num[i]>max) {
        		max = num[i];
        	}
        }
        double answer = 0;
        for(int i =0; i<n; i++) {
        	answer += (num[i]/max)*100;
        }
        System.out.println(answer/n);
        }
        
    }
