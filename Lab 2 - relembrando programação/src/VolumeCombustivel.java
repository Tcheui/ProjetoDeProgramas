import java.util.Scanner;
import java.lang.Math;

public class VolumeCombustivel {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		double H = scan.nextDouble();
		double h = scan.nextDouble();
		double r = scan.nextDouble();
		
		double vtanque = ((4*Math.PI/3)*Math.pow(r, 3)) + ((H - 2*r)*(Math.pow(r, 2))*(Math.PI));
		
		if(H > 0 && h > 0 && r > 0) {
			if(h > (H - r)) {
				double x = H - h;
				double vcomb = vtanque - (Math.PI/3)*x*x*(3*r-x);
				System.out.printf("%.3f", vcomb);
			}else if(r < h && h <= (H - r)) {
				double x = h - r;
				double vcomb = ((2*Math.PI/3)*r*r*r) + (Math.PI)*r*r*x;
				System.out.printf("%.3f", vcomb);
			}else if(h <= r){
				double x = h;
				double vcomb = (Math.PI/3)*x*x*(3*r-x);
				System.out.printf("%.3f", vcomb);
			}
		}
		else {
			double erro = -1;
			System.out.printf("%.3f", erro);
		}
		scan.close();
	}
}
