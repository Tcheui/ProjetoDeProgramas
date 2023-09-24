import java.util.Scanner;

public class ArteAscii {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int ast = scan.nextInt();
		
		for(int i = ast; i > 0 ; i--) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i = 1; i <= ast ; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		scan.close();
	}
}
