import java.util.Scanner;

public class TipoTriangulo {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		if((a <= 0) || (b <= 0) || (c <= 0) || (a >= b+c) || (b >= a+c) || (c >= a+b)) {
			System.out.println("invalido");
			
		}else if(a == b && b == c) {
			System.out.println("equilatero");
			
		}else if((a == b) || (a == c) || (b == c)) {
			System.out.println("isosceles");
			
		}else {
			System.out.println("escaleno");
			
		}
		
		scan.close();
	}
}
