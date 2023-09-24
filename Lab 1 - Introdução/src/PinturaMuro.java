
import java.util.Scanner;

public class PinturaMuro {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		float preco= scan.nextFloat();
		float total = preco*12*3 + 100;
		
		System.out.printf("%.1f", total);
		
		scan.close();
	}
}
