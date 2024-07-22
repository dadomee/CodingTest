import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       
        StringTokenizer st= new StringTokenizer(bf.readLine()," ");
      
        int N = Integer.parseInt(st.nextToken());
       int num[] = new int [N];
       int M = Integer.parseInt(st.nextToken());
        
       for (int i=0; i<M; i++) {
        	 st = new StringTokenizer(bf.readLine(), " ");
        	 int I = Integer.parseInt(st.nextToken());
        	 int J = Integer.parseInt(st.nextToken());
        	 int K = Integer.parseInt(st.nextToken());
        	
             for(int j = I - 1; j < J; j++) {
            	 num[j] = K;
             }
        }
        for(int k = 0; k < num.length; k++) {
        	System.out.print(num[k] + " ");
        }
        
        bf.close();
        
        }
        
    }
