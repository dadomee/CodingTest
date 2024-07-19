import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       
        StringTokenizer st= new StringTokenizer(bf.readLine()," ");
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       int num[] = new int [N];
        for (int i = 0; i <num.length; i++) {
          num[i] = i+1;
        }
        for (int i=0; i<M; i++) {
        	 st = new StringTokenizer(bf.readLine(), " ");
        	 int o = Integer.parseInt(st.nextToken())-1;
        	 int p = Integer.parseInt(st.nextToken())-1;
        	
        	  while (o < p) {
                  int temp = num[o];
                  num[o] = num[p];
                  num[p] = temp;
                  o++;
                  p--;
              }
        }
        
        bf.close();
     for(int i=0;i<num.length;i++) {
    	 System.out.print(num[i] + " ");
     }
        
        }
        
    }
