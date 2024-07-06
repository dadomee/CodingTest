import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rong="";
		int n = sc.nextInt();
		for(int i=1; i<=n; i+=4) {
			rong +="long ";
		}
		if(n%4!=0) {
			rong +="long ";
		}
		System.out.println(rong+"int");
	}
}
