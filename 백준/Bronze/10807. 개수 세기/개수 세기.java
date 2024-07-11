import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int count=0;
		for(int j=0; j<num.length; j++) {
			if(num[j]==v) {
				count++;
			}
		}
		System.out.println(count);
		
	
}}