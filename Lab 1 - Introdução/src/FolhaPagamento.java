import java.util.Scanner;

public class FolhaPagamento {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		double valor = scan.nextFloat();
		int horas = scan.nextInt();
		
		double IR = valor*horas*11/100;
		double INSS = valor*horas*8/100;
		
		System.out.printf("Salario bruto: R$%.2f\n", valor*horas);
		System.out.printf("IR: R$%.2f\n", IR);
		System.out.printf("INSS: R$%.2f\n", INSS);
		System.out.printf("Total de descontos: R$%.2f\n", (IR+INSS));
		System.out.printf("Salario liquido: R$%.2f\n", (valor*horas - IR - INSS));
		
		scan.close();
	}
}
