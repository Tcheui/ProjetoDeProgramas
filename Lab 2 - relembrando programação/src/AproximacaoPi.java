import java.util.Scanner;

public class AproximacaoPi {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		double soma = 3;
		System.out.printf("%f \n", soma);
		if(num > 1) {
			double ini = 2;
			double sinal = 1;
			for(int i = 1; i < num; i++) {
				double dem = 1;
				for(int j = 0; j < 3; j++) {
					dem = dem * ini;
					if(j != 2) {
						ini = ini + 1;
					}
				}
				soma = soma + sinal*(4/dem);
				if(sinal == 1){
					sinal = -1;
				}else {
					sinal = 1;
				}
				System.out.printf("%f \n", soma);
			}
		}
		scan.close();
	}
}
