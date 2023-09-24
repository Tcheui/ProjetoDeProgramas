import java.util.Scanner;

public class RaizDois {
	public static double calculaPasso(int k) {
		if(k != -1) {
			return (double) 1.0 + (1/(calculaPasso(k-1)));
		}
		return (double) 1;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		
		for(int i = 1; i <= k ; i++) {
			System.out.printf("%.14f\n", calculaPasso(i) - 1);
		}
		
		scan.close();
	}
}
