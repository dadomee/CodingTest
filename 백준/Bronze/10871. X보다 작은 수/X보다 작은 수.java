import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		int v = sc.nextInt();
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		for(int j=0; j<num.length; j++) {
			if(num[j]<v) {
				System.out.print(num[j]+" ");
				
			}
		}
		
	
}}