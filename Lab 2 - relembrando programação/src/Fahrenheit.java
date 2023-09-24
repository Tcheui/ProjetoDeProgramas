import java.util.Scanner;

public class Fahrenheit {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		float c = scan.nextFloat();
		System.out.printf("%.1f", (1.8*c + 32));
		
		scan.close();
	}
}
