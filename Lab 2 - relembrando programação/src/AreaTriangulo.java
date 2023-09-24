
import java.util.Scanner;
import java.lang.Math;

public class AreaTriangulo {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		if((a <= 0) || (b <= 0) || (c <= 0) || (a >= b+c) || (b >= a+c) || (c >= a+b)) {
			System.out.println("Triangulo invalido");		
		}else{
			float s = (a+b+c)/2;
			double area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.printf("%.2f", area);
			
		}
		
	}
}
