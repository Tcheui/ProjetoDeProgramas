import java.util.Scanner;
public class Media {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		System.out.printf("%.2f", (a + b + c)/3);
		
		scan.close();
	}
}
