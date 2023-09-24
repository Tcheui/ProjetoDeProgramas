import java.util.Scanner;

public class OperacoesInteiros {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		do {
			double cont = 0, pares = 0, impares = 0, soma = 0, maior = num, menor = num;
			while(num != -1) {
				cont++;
				if(num%2 == 0) {
					pares++;
				}else {
					impares++;
				}
				
				soma = soma + num;
				
				if(maior < num) {
					maior = num;
				}
				if(menor > num) {
					menor = num;
				}
				num = scan.nextDouble();
			}
			
			num = -2;
			Double media = soma/cont;
			System.out.println((int)cont);
			System.out.println((int)pares);
			System.out.println((int)impares);
			System.out.println((int)soma);
			System.out.printf("%.2f", media);
			System.out.println();
			System.out.println((int)maior);
			System.out.println((int)menor);
			num = scan.nextDouble();
		}while(num != -1);
		scan.close();
	}
}
