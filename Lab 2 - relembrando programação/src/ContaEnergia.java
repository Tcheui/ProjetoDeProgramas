import java.util.Scanner;

public class ContaEnergia {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		double consumo = scan.nextDouble();
		double erro = -1;
		char tipo = scan.next().charAt(0);
		
		if(consumo >= 0) {
			switch (tipo) {
			case 'R':
				if(consumo <= 500) {
					System.out.printf("%.2f", consumo*0.4);
				}else {
					System.out.printf("%.2f", consumo*0.65);
				}
			break;
			case 'C':
				if(consumo <= 1000) {
					System.out.printf("%.2f", consumo*0.55);
				}else {
					System.out.printf("%.2f", consumo*0.6);
				}
			break;
			case 'I':
				if(consumo <= 5000) {
					System.out.printf("%.2f", consumo*0.55);
				}else {
					System.out.printf("%.2f", consumo*0.6);
				}
			break;
			default:
				System.out.printf("%.2f", erro);
			break;
			}
		}else {
			System.out.printf("%.2f", erro);
		}
				
		scan.close();
	}
}
