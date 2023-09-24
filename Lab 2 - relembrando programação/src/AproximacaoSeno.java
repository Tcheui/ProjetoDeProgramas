import java.util.Scanner;
import java.lang.Math;

public class AproximacaoSeno {
	public static double fatorial(double num) {
		if(num == 1) {
			return num;
		}else {
			return num*fatorial(num - 1);
		}
	}
	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		double x = Math.toRadians(scan.nextDouble());
		int k = scan.nextInt();
		double soma = x;
		System.out.printf("%.10f \n", soma);
		if(k > 1) {
			double ini = 3, sinal = -1;
			
			for(int i = 0; i < k - 1; i++) {
				soma = soma + sinal*(Math.pow(x, ini)/fatorial(ini));
				ini = ini + 2;
				System.out.printf("%.10f \n", soma);
				
				if(sinal == -1) {
					sinal = 1;
				}else {
					sinal = -1;
				}
			}
		}
		scan.close();
	}
}
