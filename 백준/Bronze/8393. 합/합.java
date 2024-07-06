import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hab = 0;
		int n = sc.nextInt();
		for(int i=0; i<=n; i++) {
			hab+=i;
		}
		System.out.println(hab);
	}
}
