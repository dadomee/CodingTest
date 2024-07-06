import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double answer = 0;
		
		if(a==b&&b==c) {
			
			answer = 10000+(a*1000);
		
		}else if(a==b&&b!=c) {
			
			answer = 1000+(a*100);
		
		}else if(a!=b&&b==c) {
			
			answer = 1000+(b*100);
		
		}else if(a==c&&c!=b) {
			
			answer = 1000+(a*100);
		
		}else if(a!=b&&b!=c&&a!=c) {
			int big;
			if(a>b) {
				if(c>a) {
					big =c;
				}else{
					big =a;
				}
			}else {
				if(c>b) {
					big =c;
				}else {
					big =b;
				}	
				}
			answer= big*100;	
			}
			
		
		System.out.println((int)answer);

	}
}
