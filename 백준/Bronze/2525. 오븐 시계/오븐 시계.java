import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int time = sc.nextInt();
		
	    M= M+time;
	    if(M>59) {
	    	H+=M/60;
	    	M=M%60;	    	
	    }else if(M==60) {
	    	M=0;
	    }
	    if(H>=24) {
	    	H=H-24;
	    }
	    System.out.println(H+" "+M);
		
	}
}
