import java.util.Scanner;
import java.lang.Math;

public class CaixaEletronico {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int dinheiro = scan.nextInt();
		
		int n50, n10, n2;
		n50 = (int) Math.floor(dinheiro/50);
		n10 = (int) Math.floor((dinheiro - n50*50)/10);
		n2 = (int) Math.floor((dinheiro - n50*50 - n10*10)/2);
		
		if(dinheiro < 0 || dinheiro % 2 != 0) {
			System.out.println("Valor Invalido");
		}else {
			System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2", n50, n10, n2);
		}
		
		scan.close();
	}
}
